package com.group02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Demo 控制器【后端接口】
 */
@Controller
@RequestMapping("/自定义路径名")
public class DemoController {

    /**
     * 功能： controller控制器方法模板
     * 方法名：methodOne
     * @return String
     * time：  最后一次操作时间
     * codeBy：  操作人名
     *
     * 注意：RequestMapping 根据实际情况选择用post或put、delete、get
     *      并且根据情况选择是否用@RequestBody
     */
    @ResponseBody
    @RequestMapping("/自定义路径名")
    public String methodOne(){

        return "";
    }

}
