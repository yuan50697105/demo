package com.example.demo.controller

import com.example.demo.entity.SysUser
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("sysuser")
class SysUserController {
    companion object{
        private val logger = LoggerFactory.getLogger(SysUserController::class.java)

    }
    @GetMapping
    fun getId(x: SysUser) {
        logger.info(x.toString())

    }
}