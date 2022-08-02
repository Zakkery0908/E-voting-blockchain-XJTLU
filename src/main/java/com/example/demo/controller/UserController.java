package com.example.demo.controller;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.mapper.EventMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.EventService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;
import com.example.demo.entity.Result;
import java.util.List;
import java.util.Objects;

//import 你自己的父类控制器,没有就不用设置!;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2022-07-27
 */
@RestController
@CrossOrigin(origins = "*",maxAge = 1800)
@Slf4j
//@RequestMapping("/getdata")
public class UserController {

    @Autowired
    EventMapper eventMapper;

    @Autowired
    UserMapper userMapper;

    @Autowired
    EventService eventService;

    @Autowired
    UserService userService;


    //关于json的解析问题
    @PostMapping("/login")
    public String login(@RequestBody String json) {
        User u = JSON.parseObject(json, User.class);
        String username = u.getUsername();
        String password = u.getPassword();

        //获取用户id
        int user_id = (int)userService.getUserId(username);

        //判断password
        if(user_id == -1){
            Result result = Result.create(300, "user do not exist");
            return JSON.toJSONString(result);
        }
        if (!Objects.equals(userService.getUserPassword(user_id), "null") && userService.getUserPassword(user_id).equals(password)) {
            User user = userService.getUser(user_id);
            Result result = Result.create(200,"get user successful", user);
            return JSON.toJSONString(result);
        } else {
            Result result = Result.create(300, "wrong password ");
            return JSON.toJSONString(result);
        }
    }
}
