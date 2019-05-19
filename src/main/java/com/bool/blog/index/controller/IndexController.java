package com.bool.blog.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("IndexController")
public class IndexController {

    @RequestMapping("getIndex")
    public ModelAndView getIndex()
    {
        return new ModelAndView("com/bool/blog/index");
    }
}
