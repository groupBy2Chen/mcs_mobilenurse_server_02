package com.group02.serviceImpl;

import com.group02.bean.ZaiYuanBingRen;
import com.group02.dao.ZaiYuanBingRenDao;
import com.group02.service.ZaiYuanBingRenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ZaiYuanBingRen 业务层实现类
 */
@Service
public class ZaiYuanBingRenServiceImpl implements ZaiYuanBingRenService {

    //注入ZaiYuanBingRenDao对象
    @Autowired
    ZaiYuanBingRenDao zaiYuanBingRenDao;

    /**
     * name： findZaiYuanBingRenDataBykeShiID
     * 功能：  根据YongHuID 查询ZaiYuanBingRen表中所有数据
     * 时间：  2022-0609-23：40
     * codeBy：  chen
     *
     * @param keShiID
     * @return List<ZaiYuanBingRen>
     */
    @Override
    public List<ZaiYuanBingRen> findZaiYuanBingRenDataBykeShiID(String keShiID) {

        List<ZaiYuanBingRen> list_flag = zaiYuanBingRenDao.selectZaiYuanBingRenDataBykeShiID(keShiID);

        return list_flag;
    }
}
