package com.example.demo.service;

import com.example.demo.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2022-07-27
 */
public interface UserService extends IService<User> {
    User getUser(Integer user_id);

    //获取用户id
    long getUserId(String username);

    //获取用户password
    String getUserPassword(Integer user_id);
    //获取用户username
    String getUserName(Integer user_id);
    //获取用户role_id
    String getUserRoleId(Integer user_id);
}
