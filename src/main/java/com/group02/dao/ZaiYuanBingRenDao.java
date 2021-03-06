package com.group02.dao;

import com.group02.bean.ZaiYuanBingRen;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ZaiYuanBingRen dao层
 */
@Repository
public interface ZaiYuanBingRenDao {

    /**
     * 方法名： selectZaiYuanBingRenDataBykeShiID
     * 功能：  根据YongHuID 查询ZaiYuanBingRen表中所有数据
     *  如果参数中huLiDengJi不为空 那么查询时额外添加护理等级条件
     * 时间：  2022-0609-23：19
     * codeBy：  chen
     * @return List<ZaiYuanBingRen>
     */
    List<ZaiYuanBingRen> selectZaiYuanBingRenDataBykeShiID(String keShiID,String huLiDengJi);
}
