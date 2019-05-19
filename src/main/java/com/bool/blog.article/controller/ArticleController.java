package com.bool.blog.article.controller;

import com.bool.blog.article.service.BlogArticleServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("ArticleController")
public class ArticleController {

    @Autowired
    private BlogArticleServiceI blogArticleServiceI;

    @RequestMapping("getIndex")
    public ModelAndView getIndex(){
        ModelAndView modelAndView = new ModelAndView("com/bool/blog/Admin/articleManager");
        return modelAndView;
    }

    @RequestMapping("getAddIndex")
    public ModelAndView getAddIndex()
    {
        ModelAndView modelAndView = new ModelAndView("com/bool/blog/Admin/addArticle");
        return modelAndView;
    }
    @RequestMapping("getArticleList")
    @ResponseBody
    public Map<String,Object> getArticleList(String keywords,int limit,int page)
    {
        Map map = new HashMap();
        try {
            map.put("data",blogArticleServiceI.getArticleList(keywords,limit,page));
            map.put("count",blogArticleServiceI.getCount());
            map.put("code",0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return map;
    }
}
