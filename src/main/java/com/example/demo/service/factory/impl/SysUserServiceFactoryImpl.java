package com.example.demo.service.factory.impl;

import com.example.demo.entity.SysUser;
import com.example.demo.service.api.SysUserService;
import com.example.demo.service.factory.SysUserServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class SysUserServiceFactoryImpl implements SysUserServiceFactory {
    private final Map<String, SysUserService> stringSysUserServiceMap;

    @Autowired
    public SysUserServiceFactoryImpl(List<SysUserService> sysUserServices) {
        if (sysUserServices != null && sysUserServices.size() > 0) {
            this.stringSysUserServiceMap = sysUserServices.stream().collect(Collectors.toMap(SysUserService::getType, Function.identity()));
        } else {
            stringSysUserServiceMap = new HashMap<>();
        }

    }

    @Override
    public SysUser get(String type) {
        if (stringSysUserServiceMap.size() > 0) {
            SysUserService sysUserService = stringSysUserServiceMap.get(SysUser.SysUserType.getType(type));
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
        if (stringSysUserServiceMap.size() > 0) {
            SysUserService sysUserService = stringSysUserServiceMap.get(SysUser.SysUserType.getType(type));
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
