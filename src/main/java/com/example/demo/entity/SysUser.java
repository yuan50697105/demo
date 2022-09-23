package com.example.demo.entity;

import cn.org.atool.fluent.mybatis.annotation.FluentMybatis;
import cn.org.atool.fluent.mybatis.base.RichEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fhs.core.trans.vo.TransPojo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Id;

@EqualsAndHashCode(callSuper = true)
@Data
@FluentMybatis
public class SysUser extends RichEntity implements TransPojo {
    @Id
    @TableId(type = IdType.INPUT)
    @cn.org.atool.fluent.mybatis.annotation.TableId
    private String id;
    private String username;
    private String name;
    private String password;
    private Integer state;

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
