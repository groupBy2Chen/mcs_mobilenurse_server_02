package com.group02.serviceImpl;

import com.group02.bean.t_DengLuJieMian;
import com.group02.dao.DengLuJieMianDao;
import com.group02.service.DengLuJieMianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DengLuJieMianServiceImpl implements DengLuJieMianService {
    @Autowired
    DengLuJieMianDao dengLuJieMianDao;


    @Override
    public int chaxun(t_DengLuJieMian ruleForm) {
        t_DengLuJieMian chaxunS = dengLuJieMianDao.chaxunDao(ruleForm);
        if(chaxunS != null){
            return 1;
        }else {
            return 0;
        }
    }

}