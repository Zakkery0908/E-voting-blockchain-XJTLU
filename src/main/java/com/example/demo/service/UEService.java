package com.example.demo.service;
import com.example.demo.entity.UE;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.User;

public interface UEService extends IService<User> {
    String getFlag(Integer user_id);

    String vote(Integer user_id,Integer event_id,String vote);

    String getVote(Integer user_id,Integer event_id);



}

