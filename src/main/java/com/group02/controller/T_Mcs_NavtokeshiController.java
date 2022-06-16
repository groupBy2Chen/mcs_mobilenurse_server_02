package com.group02.controller;

import com.group02.bean.DaoHangZi;
import com.group02.bean.T_Mcs_Navtokeshi;
import com.group02.serviceImpl.T_Mcs_NavtokeshiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * DaoHangZi 控制器【后端接口】
 */
@Controller
@RequestMapping("/dhzC")
@CrossOrigin
public class T_Mcs_NavtokeshiController {

    @Autowired
    T_Mcs_NavtokeshiServiceImpl t_Mcs_NavtokeshiServiceImpl;

    /**
     * 根据系统id查询导航子表所有
     */
    @GetMapping("/selAll")
    @ResponseBody
    public List<T_Mcs_Navtokeshi> getDaoHangZiAll(String xiTongID){
        return t_Mcs_NavtokeshiServiceImpl.findT_Mcs_NavtokeshiAll(xiTongID);
    };

    /**
     * 查询常用菜单所有数据并按照组名分组
     */
    @GetMapping("/selAllByZuMing")
    @ResponseBody
    public List<T_Mcs_Navtokeshi> getT_Mcs_NavtokeshiAllGroupByZuMing(String ksmc,String erjicaidanmingcheng){
        return t_Mcs_NavtokeshiServiceImpl.findT_Mcs_NavtokeshiAllGroupByZuMing(ksmc,erjicaidanmingcheng);
    }



}
