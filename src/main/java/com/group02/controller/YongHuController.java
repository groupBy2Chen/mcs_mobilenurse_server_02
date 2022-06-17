package com.group02.controller;

import com.group02.bean.KeShi;
import com.group02.serviceImpl.YongHuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * YongHu 控制器【后端接口】
 */

/**
 * 跨域注解
 */
@CrossOrigin
@Controller
@RequestMapping("/yh")
public class YongHuController {

    //注入ServieImpl层对象
    @Autowired
    YongHuServiceImpl yongHuServiceImpl;

    //查询
    @GetMapping("/chaxun")
    @ResponseBody
    public List<KeShi> getYongHuDataByCon(){
        List<KeShi> list_flag = yongHuServiceImpl.findKeShiDataByCon();
        return list_flag;
    }

    //删除
    @DeleteMapping("/shanchu")
    @ResponseBody
    public Integer DeleteKeShiDataBycon(String xiTongID,String yongHuID){
        return yongHuServiceImpl.removeYongHuKeShiByCon(xiTongID,yongHuID);
    }

}
