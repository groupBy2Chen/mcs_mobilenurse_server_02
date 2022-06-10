package com.group02.service;

import com.group02.bean.KeShi;
import com.group02.bean.YongHu;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * KeShi 业务层接口
 */
@Service
public interface KeShiService {

    /**
     * name： findKeShiDataByCon
     * 功能：  按照yongHuID查询用户、科室、用户科室表全部数据
     * 时间：  22-0609-16:18
     * codeBy：  chen
     * @return List<KeShi>
     */
    List<KeShi> findKeShiDataByCon(YongHu yongHu_objFlag);

}
