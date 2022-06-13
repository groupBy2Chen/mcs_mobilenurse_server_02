package com.group02.controller;

import com.group02.bean.DaoHangZi;
import com.group02.serviceImpl.DaoHanagZiServiceImpl;
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
public class DaoHangZiController {

    @Autowired
    DaoHanagZiServiceImpl daoHanagZiServiceImpl;

    /**
     * 根据系统id查询导航子表所有
     */
    @GetMapping("/selAll")
    @ResponseBody
    public List<DaoHangZi> getDaoHangZiAll(DaoHangZi daoHangZi){
        return daoHanagZiServiceImpl.findDaoHangZiAll(daoHangZi);
    };

}
