package com.example.demo.controller;

import com.example.demo.entity.SysUser;
import com.example.demo.service.factory.SysUserServiceFactory;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@AllArgsConstructor
public class SystemUserController {
    private SysUserServiceFactory sysUserServiceFactory;

    @GetMapping("/type/{type}")
    public SysUser get(@PathVariable String type) {
        return sysUserServiceFactory.get(type);
    }

    @GetMapping("/type/{type}")
    public SysUser get(@PathVariable String type, Map<String, Object> map) {
        return sysUserServiceFactory.get(type, map);
    }
}
