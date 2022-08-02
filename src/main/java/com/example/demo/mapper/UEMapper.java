package com.example.demo.mapper;

import com.example.demo.entity.UE;
import org.springframework.stereotype.Repository;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

@Repository
public interface UEMapper extends BaseMapper<UE>  {
    UE findUEById(Integer user_id);
    String vote(Integer user_id,Integer event_id,String vote);

    String getVote(Integer user_id,Integer event_id);

}
