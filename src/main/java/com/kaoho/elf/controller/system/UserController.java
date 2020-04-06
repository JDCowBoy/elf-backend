package com.kaoho.elf.controller.system;

import com.kaoho.elf.controller.BaseController;
import com.kaoho.elf.domains.common.AjaxResult;
import com.kaoho.elf.domains.common.TableDataInfo;
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
public class UserController extends BaseController
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
    public TableDataInfo getUserList(UserInfo userInfo)
    {
        buildPageRequestData();
        List<UserInfo> userInfoList = userInfoService.getUserList(userInfo);
        return super.getDataTable(userInfoList);
    }

    /**
     * 新增用户界面
     * @return
     */
    @GetMapping("/add")
    public String add()
    {
        return "/system/user/add";
    }

    /**
     *
     * @param userInfo
     * @return
     */
    @PostMapping("/doSave")
    @ResponseBody
    public AjaxResult doSave(UserInfo userInfo)
    {
        AjaxResult ajaxResult = new AjaxResult();
        int row = userInfoService.doSave(userInfo);
        return toAjax(row);
    }
}
