package com.group02.controller;


import com.group02.bean.t_DengLuJieMian;
import com.group02.serviceImpl.DengLuJieMianServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/denglu")
@CrossOrigin
public class DengLuJieMianController {
    @Autowired
    DengLuJieMianServiceImpl LuJieMianServiceImpl;
//    查询
    @ResponseBody
    @GetMapping("/chaxun")
    public int dengLuChaXun(t_DengLuJieMian ruleForm){

        return LuJieMianServiceImpl.chaxun(ruleForm);
    }
}
