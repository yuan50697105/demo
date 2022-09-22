package com.example.demo.dao.api.impl;

import com.example.demo.dao.api.SysUserDao;
import com.example.demo.dao.base.SysUserBaseDao;
import com.example.demo.entity.SysUser;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class OneSysUserDaoImpl extends SysUserBaseDao implements SysUserDao {
    @Override
    public String getType() {
        return SysUser.SysUserType.ONE.getType();
    }

    @Override
    public SysUser get() {
        return null;
    }

    @Override
    public SysUser get(Map<String, Object> map) {
        return null;
    }
}
