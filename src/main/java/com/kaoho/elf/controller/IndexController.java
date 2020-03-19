package com.kaoho.elf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 首页
 */
@Controller
public class IndexController extends BaseController
{


    //系统首页
    @GetMapping(value = "/")
//    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index()
    {
        return "index";
    }

    @GetMapping(value = "/main")
    public String main()
    {
        return "main";
    }

}
