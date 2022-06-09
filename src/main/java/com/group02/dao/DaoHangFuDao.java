package com.group02.dao;

import com.group02.bean.DaoHangFu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * t_DaoHangFu Dao层接口
 */


@Repository
public interface DaoHangFuDao {

    /**
     * 方法名： seleteT_DaoHangFuAll
     * 功能：  查询t_DaoHangFu所有数据
     * 时间：  6.9
     * codeBy：  韩兆淇
     * @return List<t_DaoHangFu>
     */
    List<DaoHangFu> seleteDaoHangFuAll();

}
