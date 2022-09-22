package com.example.demo.service.factory.impl;

import com.example.demo.dao.factory.SysUserDaoFactory;
import com.example.demo.service.factory.SysUserDaoServiceFactory;
import com.example.demo.service.factory.SysUserServiceFactory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SysUserDaoServiceFactoryImpl implements SysUserDaoServiceFactory {
    private SysUserDaoFactory sysUserDaoFactory;
    private SysUserServiceFactory sysUserServiceFactory;
}
