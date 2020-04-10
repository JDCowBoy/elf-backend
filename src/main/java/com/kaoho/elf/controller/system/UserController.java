package com.kaoho.elf.controller.system;

import com.kaoho.elf.controller.BaseController;
import com.kaoho.elf.domains.common.AjaxResult;
import com.kaoho.elf.domains.common.TableDataInfo;
import com.kaoho.elf.domains.user.UserInfo;
import com.kaoho.elf.service.user.UserInfoService;
import com.kaoho.elf.util.DateUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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

    /**
     * 用户管理首页
     * @return
     */
    @GetMapping("/index")
    public String index()
    {
        return "/system/user/user";
    }

    /**
     * 查询用户列表
     * @param userInfo
     * @return
     */
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
     * 用户保存
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

    /**
     * 修改页面
     * @param id
     * @param modelMap
     * @return
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap modelMap)
    {
        UserInfo userInfo = userInfoService.getUserInfoById(id);
        String dateStr = DateUtils.dateFormat(userInfo.getBirthday());
        modelMap.put("userInfo", userInfo);
        modelMap.put("dateStr", dateStr);
        return "/system/user/edit";
    }

    @PostMapping("/doEditSave")
    @ResponseBody
    public AjaxResult doEditSave(UserInfo userInfo)
    {
        int row = userInfoService.updateUserInfo(userInfo);
        return toAjax(row);
    }


    @PostMapping("/delete")
    @ResponseBody
    public AjaxResult delete(String ids)
    {
        int row = userInfoService.deleteUser(ids);
        return toAjax(row);
    }
}
