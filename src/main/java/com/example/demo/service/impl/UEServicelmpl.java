package com.example.demo.service.impl;
import com.example.demo.entity.UE;
import com.example.demo.mapper.UEMapper;

import com.example.demo.service.UEService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UEServiceImpl extends ServiceImpl<UEMapper, UE> implements UEService {
    @Autowired
    private UEMapper ueMapper;
    @Override
    public String getFlag(Integer user_id) {
        return ueMapper.findUEById(user_id).getFlag();
    }

    @Override
    public String vote(Integer user_id,Integer event_id,String vote){
        return ueMapper.vote(user_id, event_id, vote);
    }


    @Override
    public String getVote(Integer user_id,Integer event_id){
        return ueMapper.getVote(user_id, event_id);
    }

}