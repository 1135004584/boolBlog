package com.bool.blog.setting.controller;

import com.bool.blog.setting.entity.BlogWebsiteSettingEntity;
import com.bool.blog.setting.service.BlogWebsiteSettingServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("SettingController")
public class SettingController {

    @Autowired
    private BlogWebsiteSettingServiceI blogWebsiteSettingServiceI;

    @RequestMapping("getIndex")
    public ModelAndView getIndex(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("com/bool/blog/Admin/websiteSetting");
        try {
            BlogWebsiteSettingEntity blogWebsiteSettingEntity;
            blogWebsiteSettingEntity = blogWebsiteSettingServiceI.getSettingInfo();
            modelAndView.addObject("blogWebsiteSettingEntity",blogWebsiteSettingEntity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return modelAndView;
    }

    //保存设置信息

    @RequestMapping("saveSettingInfo")
    @ResponseBody
    public Map<String,String> saveSettingInfo(BlogWebsiteSettingEntity blogWebsiteSettingEntity)
    {
        Map<String,String> map = new HashMap<>();
        try {
            blogWebsiteSettingServiceI.saveOrUpdate
                    (blogWebsiteSettingEntity);
            map.put("status","success");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("status","error");
        }
        return map;
    }
}
