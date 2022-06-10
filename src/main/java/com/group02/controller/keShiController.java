package com.group02.controller;

import com.group02.bean.KeShi;
import com.group02.bean.YongHu;
import com.group02.serviceImpl.KeShiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * keShi 控制器
 */
@CrossOrigin
@Controller
@RequestMapping("/kehsi")
public class keShiController {


    //注入ServieImpl层对象
    @Autowired
    KeShiServiceImpl keShiServiceImpl;

    /**
     * 功能：    根据用户ID获取对应的科室信息
     * name:    getKeShiDataByCon
     * @return  List
     */
    @GetMapping("/gksd")
    @ResponseBody
    public List<KeShi> getKeShiDataByCon(YongHu yongHu_objFlag){

        List<KeShi> list_flag = keShiServiceImpl.findKeShiDataByCon(yongHu_objFlag);

        return list_flag;
    }
}
