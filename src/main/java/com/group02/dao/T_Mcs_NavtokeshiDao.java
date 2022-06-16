package com.group02.dao;

import com.group02.bean.DaoHangZi;
import com.group02.bean.T_Mcs_Navtokeshi;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 导航子表 dao层接口
 */
@Repository
public interface T_Mcs_NavtokeshiDao {

    /**
     * 根据系统id查询导航子表所有
     */
    List<T_Mcs_Navtokeshi> seleteT_Mcs_NavtokeshiAll(String xiTongID);

    /**
     *  查询所有常用菜单配置
     */
    List<T_Mcs_Navtokeshi> selectCaiDanDataBykeShiMingChengAndZiJiCaiDanMingCheng(T_Mcs_Navtokeshi t_Mcs_Navtokeshi);

    /**
     * 更新常用菜单配置子级id
     */
//    Integer updateChangYongCaiDanPeiZhi();


}
