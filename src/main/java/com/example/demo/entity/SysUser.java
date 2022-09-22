package com.example.demo.entity;

import cn.org.atool.fluent.mybatis.annotation.FluentMybatis;
import cn.org.atool.fluent.mybatis.base.RichEntity;
import com.fhs.core.trans.vo.TransPojo;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@FluentMybatis
public class SysUser extends RichEntity implements TransPojo {
    private String id;

    public SysUser(String id) {
        this.id = id;
    }

    public SysUser() {
    }

    public enum SysUserType {
        ONE("one"), TWO("two"),THREE("three");
        String type;

        SysUserType(String type) {
            this.type = type;
        }

        public static String getType(String type) {
            for (SysUserType value : values()) {
                if (value.type.equals(type)) {
                    return type;
                }
            }
            return null;
        }

        public String getType() {
            return type;
        }
    }


}
