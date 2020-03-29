package com.kaoho.elf.domains.common;

import java.io.Serializable;
import java.util.Date;

public abstract class BaseDomain implements Serializable
{
    private static final long serialVersionUID = 1L;

    //主键
    private long id;

    //创建时间
    private Date createTime;

    //创建用户
    private String createUser;

    //更新时间
    private Date updateTime;

    //更新用户
    private String updateUser;

    //删除标识
    private int isDelete;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public Date getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }

    public String getCreateUser()
    {
        return createUser;
    }

    public void setCreateUser(String createUser)
    {
        this.createUser = createUser;
    }

    public Date getUpdateTime()
    {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime)
    {
        this.updateTime = updateTime;
    }

    public String getUpdateUser()
    {
        return updateUser;
    }

    public void setUpdateUser(String updateUser)
    {
        this.updateUser = updateUser;
    }

    public int getIsDelete()
    {
        return isDelete;
    }

    public void setIsDelete(int isDelete)
    {
        this.isDelete = isDelete;
    }
}
