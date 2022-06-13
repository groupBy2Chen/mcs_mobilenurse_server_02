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
    public t_DengLuJieMian chaxun(t_DengLuJieMian ruleForm) {
        t_DengLuJieMian chaxunS = dengLuJieMianDao.chaxunDao(ruleForm);

        if(chaxunS != null){
            return chaxunS;
        }else {
            return null;
        }
    }


}