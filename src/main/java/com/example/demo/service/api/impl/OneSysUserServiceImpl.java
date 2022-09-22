package com.example.demo.service.api.impl;

import com.example.demo.entity.SysUser;
import com.example.demo.entity.wrapper.SysUserOneQueryWrapper;
import com.example.demo.service.api.AbstractSysUserService;
import com.example.demo.service.api.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
public class OneSysUserServiceImpl extends AbstractSysUserService implements SysUserService {
    @Override
    public String getType() {
        return SysUser.SysUserType.ONE.getType();
    }

    @Override
    public SysUser get() {
        log.info("OneSysUserServiceImpl.get");
        return new SysUser("one");
    }

    @Override
    public SysUser get(Map<String, Object> map) {
        SysUserOneQueryWrapper sysUserOneQueryWrapper = new SysUserOneQueryWrapper(map);
        return null;
    }
}
