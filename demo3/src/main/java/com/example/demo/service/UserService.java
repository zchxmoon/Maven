package com.example.demo.service;

import com.example.demo.entity.UserEntity;

import java.util.List;


public interface UserService {
    /**
     * 查询所有用户信息
     *
     * @return
     */
    List<UserEntity> queryList();

    /**
     * 新增或者更新用户
     *
     * @param userEntity
     * @return
     */
    int addOrUpdateUser(UserEntity userEntity);

    /**
     * 根据主键删除用户
     *
     * @param id
     * @return
     */
    int deleteById(Integer id);

    UserEntity queryById(Integer id);
}
