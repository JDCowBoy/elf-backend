package com.kaoho.elf.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * UserController
 */
@Controller
@RequestMapping(value = "/user", method = RequestMethod.GET)
public class UserController
{

    @GetMapping("/index")
    public String index()
    {
        return "/system/user/user";
    }

}
