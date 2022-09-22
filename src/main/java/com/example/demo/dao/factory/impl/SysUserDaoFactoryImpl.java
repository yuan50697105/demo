package com.example.demo.dao.factory.impl;

import com.example.demo.dao.api.SysUserDao;
import com.example.demo.dao.factory.SysUserDaoFactory;
import com.example.demo.entity.SysUser;
import com.example.demo.service.api.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class SysUserDaoFactoryImpl implements SysUserDaoFactory {
    private final Map<String, SysUserDao> sysUserDaoMap;

    @Autowired
    public SysUserDaoFactoryImpl(List<SysUserDao> sysUserServices) {
        if (sysUserServices != null && sysUserServices.size() > 0) {
            this.sysUserDaoMap = sysUserServices.stream().collect(Collectors.toMap(SysUserDao::getType, Function.identity()));
        } else {
            sysUserDaoMap = new HashMap<>();
        }

    }

    @Override
    public SysUser get(String type) {
        if (sysUserDaoMap.size() > 0) {
            SysUserDao sysUserService = sysUserDaoMap.get(SysUser.SysUserType.getType(type));
            if (sysUserService != null) {
                return sysUserService.get();
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @Override
    public SysUser get(String type, Map<String, Object> map) {
        if (sysUserDaoMap.size() > 0) {
            SysUserDao sysUserService = sysUserDaoMap.get(SysUser.SysUserType.getType(type));
            if (sysUserService != null) {
                return sysUserService.get(map);
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
}
