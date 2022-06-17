package com.group02.serviceImpl;

import com.group02.bean.KeShi;
import com.group02.dao.YongHuDao;
import com.group02.service.YongHuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * YongHu 业务层实现类
 */
@Service
public class YongHuServiceImpl implements YongHuService {
    /**
     * 查询
     */

    //注入dao层对象
    @Autowired
    YongHuDao yonghuDao;

    /**
     * 查询
     *
     * @return
     */
    @Override
    public List<KeShi> findKeShiDataByCon() {

        List<KeShi> lisst_Flag = yonghuDao.selectKeShiDataByCon();
        return lisst_Flag;
    }

    /**
     * 删除
     *
     * @param xiTongID
     */
    @Override
    public Integer removeYongHuKeShiByCon(String xiTongID,String yongHuID) {
        /**
         * 假设：张三对应 产科 和 儿科 ，张三在产科是护士身份，在儿科是住院护士长身份
         * 1、关系表里删除了一条系统id ，删除的是张三对应的儿科住院护士身份信息
         * 2、如果张三离职，张三在产科还有护士的身份，所以需要删除用户表里张三的信息
         * 3、删除张三对应的儿科住院护士身份信息，如果要判断关系表里是否有张三的信息，
         *      在查询一遍关系表，然后在删除用户表张三的信息
         */

        if (yonghuDao.chaxunguanxibiao(yongHuID).size() ==1){
            yonghuDao.deleteYongHuByCon(yongHuID);
            yonghuDao.deleteYongHuKeShiByCon(xiTongID);
        }else {
            yonghuDao.deleteYongHuKeShiByCon(xiTongID);
        }
        return 2;
    }





}
