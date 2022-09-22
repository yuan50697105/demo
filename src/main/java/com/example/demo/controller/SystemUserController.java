package com.example.demo.controller;

import com.example.demo.dao.factory.SysUserDaoFactory;
import com.example.demo.entity.SysUser;
import com.example.demo.service.factory.SysUserServiceFactory;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@AllArgsConstructor
public class SystemUserController {
    private SysUserServiceFactory sysUserServiceFactory;
    private SysUserDaoFactory sysUserDaoFactory;

    @GetMapping("/type/{type}")
    public SysUser get(@PathVariable String type) {
        return sysUserServiceFactory.get(type);
    }

    @GetMapping("/type/{type}")
    public SysUser get(@PathVariable String type, Map<String, Object> map) {
        return sysUserServiceFactory.get(type, map);
    }

    @PostMapping("type")
    public Map<String, Object> get2(@RequestParam @RequestBody Map<String, Object> map) {
        return map;
    }
}
