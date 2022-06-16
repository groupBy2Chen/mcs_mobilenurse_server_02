package com.group02.serviceImpl;

import com.group02.bean.KeShi;
import com.group02.bean.YongHu;
import com.group02.dao.KeShiDao;
import com.group02.service.KeShiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * KeShi 业务层实现类
 */
@Service
public class KeShiServiceImpl implements KeShiService {

    //注入dao层对象
    @Autowired
    KeShiDao keShiDao;

    /**
     * name： findKeShiDataByCon
     * 功能：  按照yongHuID查询用户、科室、用户科室表全部数据
     * 时间：  22-0609-16:18
     * codeBy：  chen
     *
     * @param yongHu_objFlag
     * @return List<KeShi>
     */
    @Override
    public List<KeShi> findKeShiDataByCon(YongHu yongHu_objFlag) {

        List<KeShi> listFlag = keShiDao.selectKeShiDataByCon(yongHu_objFlag);

        return listFlag;

    }
}
