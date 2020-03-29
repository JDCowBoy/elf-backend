package com.kaoho.elf.controller.system;

import com.kaoho.elf.domains.common.TableInfo;
import com.kaoho.elf.domains.user.UserInfo;
import com.kaoho.elf.service.user.UserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * UserController
 */
@Controller
@RequestMapping(value = "/system/user", method = RequestMethod.GET)
public class UserController
{
    @Resource
    private UserInfoService userInfoService;

    @GetMapping("/index")
    public String index()
    {
        return "/system/user/user";
    }

    @PostMapping("/getUserList")
    @ResponseBody
    public TableInfo getUserList(UserInfo userInfo)
    {
        TableInfo tableInfo = new TableInfo();
        List<UserInfo> userInfoList = userInfoService.getUserList(userInfo);
        return tableInfo;
    }
}
