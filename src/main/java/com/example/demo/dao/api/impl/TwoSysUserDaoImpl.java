package com.example.demo.dao.api.impl;

import com.example.demo.dao.api.SysUserDao;
import com.example.demo.dao.base.SysUserBaseDao;
import com.example.demo.entity.SysUser;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class TwoSysUserDaoImpl extends SysUserBaseDao implements SysUserDao {
    @Override
    public String getType() {
        return SysUser.SysUserType.TWO.getType();
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
