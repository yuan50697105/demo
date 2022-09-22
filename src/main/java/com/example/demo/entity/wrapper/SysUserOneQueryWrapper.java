package com.example.demo.entity.wrapper;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjUtil;
import lombok.Data;

import java.util.Map;

@Data
public class SysUserOneQueryWrapper {
    private String id;

    public SysUserOneQueryWrapper(Map<String, Object> map) {
        if (ObjUtil.isEmpty(map)) {
            BeanUtil.copyProperties(map, this);
        }
    }

}
