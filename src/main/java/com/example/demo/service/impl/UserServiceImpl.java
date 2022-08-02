package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2022-07-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUser(Integer user_id) {
        List<Integer> UserIdList = userMapper.getUserIdList();
        if (UserIdList.contains(user_id)){
            return userMapper.findUserById(user_id);
        } else {
            return null;
        }

    }

    @Override
    public long getUserId(String username) {
        Object o = userMapper.getUserId(username);
        if(o == null){
            return -1;
        }else {
            return (long) o;
        }
    }

    @Override
    public String getUserPassword(Integer user_id) {
        return getUser(user_id).getPassword();
    }

    @Override
    public String getUserName(Integer user_id) {
        return null;
    }

    @Override
    public String getUserRoleId(Integer user_id) {
        return getUser(user_id).getRole_id();
    }

}
