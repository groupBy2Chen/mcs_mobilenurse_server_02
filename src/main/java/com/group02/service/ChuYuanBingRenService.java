package com.group02.service;

import com.group02.bean.ChuYuanBingRen;

import java.util.List;

/**
 * ChuYuanBingRen 业务层接口
 */
public interface ChuYuanBingRenService {

    /**
     * name findChuYuanBingRenAllDataOrByCon
     * 功能： 根据是否传递xingMing属性的参数判断查询全部数据或模糊查询
     * @param chuYuanBingRen_objFlag
     * @return List<ChuYuanBingRen>@return
     */
    List<ChuYuanBingRen> findChuYuanBingRenAllDataOrByCon(ChuYuanBingRen chuYuanBingRen_objFlag);
}
