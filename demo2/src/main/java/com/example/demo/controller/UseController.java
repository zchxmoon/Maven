package com.example.demo.controller;

import com.example.demo.entity.UserEntity;

import com.example.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;

//@RestController("/user")
@Api(tags= "UserController", description = "用户管理模块")
@Controller
@RequestMapping("/user")
public class UseController {

    @Autowired
    private UserService userService;

    /**
     * 获取所有用户的信息
     *
     * @return
     */
    @ApiOperation("获取用户")
    @GetMapping("list")
    @ResponseBody
    public List<UserEntity> getUserList() {
        List<UserEntity> userEntities = userService.queryList();
        return userEntities;
    }

    @ApiOperation("更新或者保存")
    @PostMapping("addOrUpdate")
    @ResponseBody
    public UserEntity addOrUpdate(@RequestBody UserEntity user) {
        userService.addOrUpdateUser(user);
        return user;
    }


    // TODO  删
}
