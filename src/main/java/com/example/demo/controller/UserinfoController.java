package com.example.demo.controller;


import com.example.demo.entity.Userinfo;
import com.example.demo.mapper.EventMapper;
import com.example.demo.mapper.UserinfoMapper;
import com.example.demo.service.IEventService;
import com.example.demo.service.IUserinfoService;
import com.example.demo.service.impl.EventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
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
@RequestMapping("/getdata")
public class UserinfoController {

    @Autowired
    EventMapper eventMapper;

    @Autowired
    UserinfoMapper userinfoMapper;

    @Autowired
    IEventService eventService;

    @Autowired
    IUserinfoService userinfoService;

    @GetMapping
    public List<Userinfo> show(Userinfo userinfo){
        //查询所有信息
        return userinfoService.list();
    }
}
