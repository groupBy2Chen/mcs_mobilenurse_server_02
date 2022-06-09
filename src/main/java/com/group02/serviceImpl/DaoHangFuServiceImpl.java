package com.group02.serviceImpl;

import com.group02.bean.DaoHangFu;
import com.group02.dao.DaoHangFuDao;
import com.group02.service.DaoHangFuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * T_DaoHangFu 业务层实现类
 */
@Service
public class DaoHangFuServiceImpl implements DaoHangFuService {

    @Autowired
    DaoHangFuDao daoHangFuDao;

    /**
     * 方法名： findT_DaoHangFuAll
     * 功能：  查询t_DaoHangFu所有数据
     * 时间：  6.9
     * codeBy：  韩兆淇
     * @return List<t_DaoHangFu>
     */
    @Override
    public List<DaoHangFu> findDaoHangFuAll() {
        return daoHangFuDao.seleteDaoHangFuAll();
    }
}
