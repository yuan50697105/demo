package com.example.demo.dao.factory;

import com.example.demo.entity.SysUser;

import java.util.Map;

public interface SysUserDaoFactory {
    SysUser get(String type);

    SysUser get(String type, Map<String, Object> map);
}
