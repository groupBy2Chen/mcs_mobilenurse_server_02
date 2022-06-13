package com.group02.dao;

import com.group02.bean.DaoHangZi;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 导航子表 dao层接口
 */
@Repository
public interface DaoHangZiDao {

    /**
     * 根据系统id查询导航子表所有
     */
    List<DaoHangZi> seleteDaoHangZiAll(DaoHangZi daohangzi);


}
