package com.group02.service;

import com.group02.bean.ZaiYuanBingRen;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ZaiYuanBIngRen 业务层接口
 */
@Service
public interface ZaiYuanBingRenService {

    /**
     * name： findZaiYuanBingRenDataBykeShiID
     * 功能：  根据YongHuID 查询ZaiYuanBingRen表中所有数据
     *  如果参数中huLiDengJi不为空 那么查询时额外添加护理等级条件
     * 时间：  2022-0609-23：40
     * codeBy：  chen
     * @return List<ZaiYuanBingRen>
     */
    List<ZaiYuanBingRen> findZaiYuanBingRenDataBykeShiID(String keShiID,String huLiDengJi);
}
