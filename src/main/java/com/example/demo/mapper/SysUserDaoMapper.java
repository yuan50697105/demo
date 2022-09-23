package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.ExampleMapper;

@Mapper
public interface SysUserDaoMapper extends BaseMapper<SysUser>, ExampleMapper<SysUser> {
}
