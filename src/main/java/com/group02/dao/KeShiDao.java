package com.group02.dao;

import com.group02.bean.KeShi;
import com.group02.bean.YongHu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * KeShi    dao层接口
 */
@Repository
public interface KeShiDao {

    /**
     * name： selectKeShiDataByCon
     * 功能：  按照yongHuID查询用户、科室、用户科室表全部数据
     * 时间：  22-0609-16:18
     * codeBy：  chen
     * @return List<KeShi>
     */
    List<KeShi> selectKeShiDataByCon(YongHu obj_flag);
}
