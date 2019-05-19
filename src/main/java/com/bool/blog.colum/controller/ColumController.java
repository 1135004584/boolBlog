package com.bool.blog.colum.controller;

import com.bool.blog.colum.entity.BlogColumListEntity;
import com.bool.blog.colum.service.BlogArticleRelColumServiceI;
import com.bool.blog.colum.service.BlogColumListServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("ColumController")
public class ColumController {

    @Autowired
    private BlogColumListServiceI blogColumListServiceI;

    @RequestMapping("getIndex")
    public ModelAndView getIndex()
    {
        return new ModelAndView("com/bool/blog/Admin/columnManager");
    }
    @RequestMapping("getColumInfo")
    @ResponseBody
    public Map<String,Object> getColumInfo()
    {
        Map<String,Object> map = new HashMap<>();
        try {
            List<Map<String,String>> list = blogColumListServiceI.getColumInfo();

            map.put("data",list);
            map.put("code",0);
            map.put("message","");
            map.put("total",list.size());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return map;
    }

    @RequestMapping("saveColumItem")
    @ResponseBody
    public Map<String,Object> saveColumItem(BlogColumListEntity blogColumListEntity)
    {
        Map<String,Object> map = new HashMap<>();
        try {
            if(blogColumListEntity.getFathercolumid() == null)
                blogColumListEntity.setFathercolumid(-1);
            blogColumListServiceI.save(blogColumListEntity);
            map.put("status","success");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("status","error");
        }

        return map;
    }

    @RequestMapping("updateColumnItem")
    @ResponseBody
    public Map<String,Object> updateColumnItem(BlogColumListEntity blogColumListEntity)
    {
        Map<String,Object> map = new HashMap<>();
        if(blogColumListEntity.getFathercolumid() == null)
            blogColumListEntity.setFathercolumid(-1);
        blogColumListServiceI.updateEntitie(blogColumListEntity);
        map.put("status","success");
        return map;
    }

    @RequestMapping("deleteById")
    @ResponseBody
    public Map<String,String> deleteById(String id)
    {
        Map<String,String> map = new HashMap<>();
        BlogColumListEntity blogColumListEntity = new BlogColumListEntity();
        blogColumListEntity.setId(Integer.parseInt(id));
        try {
            blogColumListServiceI.delete(blogColumListEntity);
            map.put("status","success");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("status","error");
        }
        return map;
    }
}
