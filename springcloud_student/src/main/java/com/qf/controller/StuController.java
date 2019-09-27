package com.qf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class StuController {
    @RequestMapping("/list")
    @ResponseBody
    public String list(){
        System.out.println("查询了所有的学生");
        return "热烈欢迎各位同学";

    }
}
