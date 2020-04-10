package com.kaoho.elf.domains.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.kaoho.elf.domains.common.BaseDomain;

import java.util.Date;
import java.util.Map;

/**
 * UserInfo
 */
public class UserInfo extends BaseDomain
{
    private String username;

    private String telephoneNo;

    /**
     * 性别：0 男, 1 女
     */
    private int sex;

    private int userStatus;

    /**
     * 生日
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone="GMT+8")
    private Date birthday;

    private String email;

    private String address;

    private Map<String, Object> params;

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getTelephoneNo()
    {
        return telephoneNo;
    }

    public void setTelephoneNo(String telephoneNo)
    {
        this.telephoneNo = telephoneNo;
    }

    public int getSex()
    {
        return sex;
    }

    public void setSex(int sex)
    {
        this.sex = sex;
    }

    public int getUserStatus()
    {
        return userStatus;
    }

    public void setUserStatus(int userStatus)
    {
        this.userStatus = userStatus;
    }

    public Date getBirthday()
    {
        return birthday;
    }

    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public Map<String, Object> getParams()
    {
        return params;
    }

    public void setParams(Map<String, Object> params)
    {
        this.params = params;
    }
}
