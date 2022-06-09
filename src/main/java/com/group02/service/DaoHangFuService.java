package com.group02.service;

import com.group02.bean.DaoHangFu;

import java.util.List;

/**
 * t_DaoHangFu 业务层
 */
public interface DaoHangFuService {

    /**
     * 方法名： findT_DaoHangFuAll
     * 功能：  查询t_DaoHangFu所有数据
     * 时间：  6.9
     * codeBy：  韩兆淇
     * @return List<t_DaoHangFu>
     */
    List<DaoHangFu> findDaoHangFuAll();

}
