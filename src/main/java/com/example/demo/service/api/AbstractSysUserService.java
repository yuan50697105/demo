package com.example.demo.service.api;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.SysUser;
import com.example.demo.mapper.SysUserDaoMapper;

public abstract class AbstractSysUserService extends ServiceImpl<SysUserDaoMapper, SysUser> implements SysUserService {
}
