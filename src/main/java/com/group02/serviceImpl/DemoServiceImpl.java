package com.group02.serviceImpl;

import com.group02.dao.DemoDao;
import com.group02.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Demo 业务层实现类
 */
public class DemoServiceImpl implements DemoService {

    //注入DemoDao对象
    @Autowired
    DemoDao demoDao;

    /**
     * 方法名： methodThreee
     * 功能：  serviceImpl层方法模板
     * 时间：  最后一次操作时间
     * codeBy：  操作人名
     *
     * @return String
     */
    @Override
    public String methodThreee() {

        /**
        *   调用对应的dao层某某方法做了某件事
        */
        String str = demoDao.methodTow();

        return str;
    }
}
