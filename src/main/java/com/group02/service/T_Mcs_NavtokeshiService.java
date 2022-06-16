package com.group02.service;

import com.group02.bean.DaoHangZi;
import com.group02.bean.T_Mcs_Navtokeshi;

import java.util.List;

/**
 * DaoHangZi 业务层
 */
public interface T_Mcs_NavtokeshiService {

    /**
     * 根据系统id查询导航子表所有
     */
    List<T_Mcs_Navtokeshi> findT_Mcs_NavtokeshiAll(String xiTongID);

    /**
     *  查询常用菜单所有数据 并按组名分组
     */
    List<T_Mcs_Navtokeshi> findCaiDanDataBykeShiMingChengAndZiJiCaiDanMingCheng(T_Mcs_Navtokeshi t_Mcs_Navtokeshi);

}
