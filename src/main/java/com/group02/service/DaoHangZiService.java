package com.group02.service;

import com.group02.bean.DaoHangZi;

import java.util.List;

/**
 * DaoHangZi 业务层
 */
public interface DaoHangZiService {

    /**
     * 根据系统id查询导航子表所有
     */
    List<DaoHangZi> findDaoHangZiAll(DaoHangZi daohangzi);

}
