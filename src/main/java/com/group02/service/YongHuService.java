package com.group02.service;

import com.group02.bean.KeShi;

import java.util.List;

/**
 * YongHu 业务层接口
 */
public interface YongHuService {
    /**
     * 查询
     * @return
     */
    List<KeShi> findKeShiDataByCon();

    /**
     * 删除
     */
    Integer removeYongHuKeShiByCon(String xiTongID,String yongHuID);

}
