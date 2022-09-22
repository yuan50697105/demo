package com.example.demo.service.factory;

import com.example.demo.entity.SysUser;

import java.util.Map;

public interface SysUserServiceFactory {
    SysUser get(String type);

    SysUser get(String type, Map<String, Object> map);
}
