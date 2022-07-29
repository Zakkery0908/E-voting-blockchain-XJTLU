package com.example.demo.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
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
@CrossOrigin(value = "*",maxAge = 1800)
@RequestMapping("/event")
public class EventController {

}
