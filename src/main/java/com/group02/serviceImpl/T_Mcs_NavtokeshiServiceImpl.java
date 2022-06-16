package com.group02.serviceImpl;

import com.group02.bean.DaoHangZi;
import com.group02.bean.T_Mcs_Navtokeshi;
import com.group02.dao.T_Mcs_NavtokeshiDao;
import com.group02.service.T_Mcs_NavtokeshiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * DaoHangZi 业务层实现类
 */
@Service
public class T_Mcs_NavtokeshiServiceImpl implements T_Mcs_NavtokeshiService {

    @Autowired
    T_Mcs_NavtokeshiDao t_Mcs_NavtokeshiDao;

    /**
     * 根据系统id查询导航子表所有
     */
    @Override
    public List<T_Mcs_Navtokeshi> findT_Mcs_NavtokeshiAll(String xiTongID) {
        return t_Mcs_NavtokeshiDao.seleteT_Mcs_NavtokeshiAll(xiTongID);
    }

    /**
     * 查询常用菜单所有数据 并按组名分组
     * @return
     */
    @Override
    public List<T_Mcs_Navtokeshi> findT_Mcs_NavtokeshiAllGroupByZuMing(String ksmc,String erjicaidanmingcheng) {
        return t_Mcs_NavtokeshiDao.selectT_Mcs_NavtokeshiAllGroupByZuMing(ksmc,erjicaidanmingcheng);
    }
}
