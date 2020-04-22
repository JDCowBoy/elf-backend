package com.kaoho.elf.controller;

import com.kaoho.elf.common.config.ElfBackendConfig;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * 首页
 */
@Controller
public class IndexController extends BaseController
{

    @Resource
    private ElfBackendConfig elfBackendConfig;

    //系统首页
    @GetMapping(value = "/")
//    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap modelMap)
    {
        modelMap.put("author", elfBackendConfig.getAuthor());
        modelMap.put("version", elfBackendConfig.getVersion());
        return "index";
    }

    @GetMapping(value = "/main")
    public String main()
    {
        return "main";
    }

}
