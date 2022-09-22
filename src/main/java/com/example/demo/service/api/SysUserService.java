package com.example.demo.service.api;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.SysUser;

import java.util.Map;

public interface SysUserService extends IService<SysUser> {
    String getType();

    SysUser get();

    SysUser get(Map<String, Object> map);
}
