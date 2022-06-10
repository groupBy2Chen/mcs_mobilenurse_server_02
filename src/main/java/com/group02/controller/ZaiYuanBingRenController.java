package com.group02.controller;

import com.group02.bean.ZaiYuanBingRen;
import com.group02.serviceImpl.ZaiYuanBingRenServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * ZaiYuanBingRen 控制器
 */
@CrossOrigin
@Controller
@RequestMapping("/zybr")
public class ZaiYuanBingRenController {

    //注入ZaiYuanBingRenServiceImpl对象
    @Autowired
    ZaiYuanBingRenServiceImpl zaiYuanBingRenServiceImpl;

    /**
     * name： getZaiYuanBingRenDataByKeShiID
     * 功能：  根据YongHuID 查询ZaiYuanBingRen表中所有数据
     * 时间：  2022-0609-23：40
     * codeBy：  chen
     *
     * @param keShiID
     * @return List<ZaiYuanBingRen>
     */
    @GetMapping("/gzybrdbyh")
    @ResponseBody
    public List<ZaiYuanBingRen> getZaiYuanBingRenDataByKeShiID(String keShiID){

        List<ZaiYuanBingRen> list_flag = zaiYuanBingRenServiceImpl.findZaiYuanBingRenDataBykeShiID(keShiID);

        return list_flag;
    }
}
