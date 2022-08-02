package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.mapper.EventMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.EventService;
import com.example.demo.service.UserService;
import com.example.demo.service.UEService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;
import com.example.demo.entity.Result;
import java.util.List;
import java.util.Objects;


@RestController
@CrossOrigin(origins = "*",maxAge = 1800)
@Slf4j
public class UEController {
    @Autowired
    EventMapper eventMapper;

    @Autowired
    UserMapper userMapper;

    @Autowired
    EventService eventService;

    @Autowired
    UserService userService;

    @Autowired
    UEService UEService;

    @GetMapping (value = "/checkVoter")
    public String checkVoter(@RequestParam (name = "user_id") Integer user_id) {

        String flag = UEService.getFlag(user_id);
        Result result = Result.create(200, "flag successfully", flag);
        return JSON.toJSONString(result);
    }


    @GetMapping (value = "/checkVote")
    public String checkVote(@RequestParam (name = "user_id") Integer user_id, @RequestParam (name = "event_id") Integer event_id) {
        //调取数据库中vote的值（加密后的）
         String vote = UEService.getVote(user_id,event_id);
        //调取event表中的私钥解密???
        Result result = Result.create(200, "check vote successfully", vote);
        return JSON.toJSONString(result);
    }



    @PostMapping (value = "/vote")
    public String vote(@RequestBody String json) {
        JSONObject object = JSONObject.parseObject(json);
        int event_id = object.getIntValue("event_id");
        int user_id = object.getIntValue("user_id");

        String vote = object.getString("vote");

        String vote_result = UEService.vote(user_id,event_id,vote);

            Result result = Result.create(200, "vote successfully ",vote_result);
            return JSON.toJSONString(result);
        }
    }




