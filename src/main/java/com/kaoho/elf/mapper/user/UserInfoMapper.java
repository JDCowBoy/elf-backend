package com.kaoho.elf.mapper.user;

import com.kaoho.elf.domains.user.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@Mapper
public interface UserInfoMapper
{
    public List<UserInfo> getUserList(UserInfo userInfo);

    public int insertUser(UserInfo userInfo);

    public UserInfo getUserInfoById(Long id);

    public int updateUser(UserInfo userInfo);

    public int deleteUser(String ids);
}
