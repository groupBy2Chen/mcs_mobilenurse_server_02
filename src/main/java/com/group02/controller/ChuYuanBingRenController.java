package com.group02.controller;

import com.group02.bean.ChuYuanBingRen;
import com.group02.serviceImpl.ChuYuanBingRenServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * ChuYuanBingRen 控制器
 */
@Controller
@CrossOrigin
@RequestMapping("/cybrc")
public class ChuYuanBingRenController {

    //注入ChuYuanBingRenServiceImpl对象
    @Autowired
    ChuYuanBingRenServiceImpl chuYuanBingRenServiceImpl;

    /**
     * name getChuYuanBingRenAllDataOrByCon
     * 功能： 根据是否传递xingMing属性的参数判断查询全部数据或模糊查询
     * @param chuYuanBingRen_objFlag
     * @return List<ChuYuanBingRen>
     */
    @RequestMapping("/gcybrd")
    @ResponseBody
    public List<ChuYuanBingRen> getChuYuanBingRenAllDataOrByCon(ChuYuanBingRen chuYuanBingRen_objFlag ){

        List<ChuYuanBingRen> list_flag= chuYuanBingRenServiceImpl.findChuYuanBingRenAllDataOrByCon(chuYuanBingRen_objFlag);

        return list_flag;
    }

}
