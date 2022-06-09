package com.group02.controller;

import com.group02.bean.DaoHangFu;
import com.group02.serviceImpl.DaoHangFuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * t_DaoHangFu 控制器  【后端接口】
 */
@Controller
@RequestMapping("/t_dhfC")
@CrossOrigin
public class DaoHangFuController {

    @Autowired
    DaoHangFuServiceImpl daoHangFuServiceImpl;

    /**
     * 方法名： get_DaoHangFuAll
     * 功能：  查询t_DaoHangFu所有数据
     * 时间：  6.9
     * codeBy：  韩兆淇
     * @return List<t_DaoHangFu>
     */
    @GetMapping("/sltall")
    @ResponseBody
    List<DaoHangFu> get_DaoHangFuAll(){
        return daoHangFuServiceImpl.findDaoHangFuAll();
    };
}
