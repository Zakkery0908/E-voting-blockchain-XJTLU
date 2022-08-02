package com.example.demo.mapper;

import com.example.demo.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2022-07-27
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
    List<Integer> getUserIdList();
    User findUserById(Integer user_id);

    Object getUserId(String username);
    User getUser(Integer user_id);
}
