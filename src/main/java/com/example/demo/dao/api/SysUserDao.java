package com.example.demo.dao.api;

import cn.org.atool.fluent.mybatis.base.IBaseDao;
import com.example.demo.entity.SysUser;

import java.util.Map;

public interface SysUserDao extends IBaseDao<SysUser> {
    String getType();

    SysUser get();

    SysUser get(Map<String, Object> map);

}
