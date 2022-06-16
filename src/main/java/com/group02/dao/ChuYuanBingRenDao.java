package com.group02.dao;

import com.group02.bean.ChuYuanBingRen;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ChuYuanBingRen dao层接口
 */
@Repository
public interface ChuYuanBingRenDao {

    /**
    * name selectChuYuanBingRenAllDataOrByCon
    * 功能： 根据是否传递xingMing属性的参数判断查询全部数据或模糊查询
    * @param chuYuanBingRen_objFlag
    * @return List<ChuYuanBingRen>
    */
    List<ChuYuanBingRen> selectChuYuanBingRenAllDataOrByCon(ChuYuanBingRen chuYuanBingRen_objFlag);
}
