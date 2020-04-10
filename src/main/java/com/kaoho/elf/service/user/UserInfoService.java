package com.kaoho.elf.service.user;

import com.kaoho.elf.domains.user.UserInfo;

import java.util.List;

public interface UserInfoService
{
    public List<UserInfo> getUserList(UserInfo userInfo);

    public int doSave(UserInfo userInfo);

    public UserInfo getUserInfoById(Long id);

    public int updateUserInfo(UserInfo userInfo);

    public int deleteUser(String ids);
}
