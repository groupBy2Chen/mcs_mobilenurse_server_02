package com.group02.serviceImpl;

import com.group02.bean.DaoHangZi;
import com.group02.dao.DaoHangZiDao;
import com.group02.service.DaoHangZiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * DaoHangZi 业务层实现类
 */
@Service
public class DaoHanagZiServiceImpl implements DaoHangZiService {

    @Autowired
    DaoHangZiDao DaoHangZiDao;

    /**
     * 根据系统id查询导航子表所有
     */
    @Override
    public List<DaoHangZi> findDaoHangZiAll(DaoHangZi daohangzi) {

        return DaoHangZiDao.seleteDaoHangZiAll(daohangzi);
    }
}
