package com.kaoho.elf.service.user;

import com.kaoho.elf.domains.user.UserInfo;
import com.kaoho.elf.mapper.user.UserInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 */

@Service
public class UserInfoServiceImpl implements UserInfoService
{
    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> getUserList(UserInfo userInfo)
    {
        return userInfoMapper.getUserList(userInfo);
    }

    @Override
    public int doSave(UserInfo userInfo)
    {
        return userInfoMapper.insertUser(userInfo);
    }

    @Override
    public UserInfo getUserInfoById(Long id)
    {
        return userInfoMapper.getUserInfoById(id);
    }

    @Override
    public int updateUserInfo(UserInfo userInfo)
    {
        return userInfoMapper.updateUser(userInfo);
    }

    @Override
    public int deleteUser(String ids)
    {
        return userInfoMapper.deleteUser(ids);
    }
}
