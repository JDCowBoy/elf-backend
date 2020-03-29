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
        return null;
    }
}
