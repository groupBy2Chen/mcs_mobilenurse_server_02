package com.group02.dao;

import com.group02.bean.KeShi;
import com.group02.bean.YongHu;
import com.group02.bean.YongHuKeShi;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * YongHu Dao层接口
 */

/**
 * Repository dao层连接业务层实现类注解
 */
@Repository
public interface YongHuDao {

    /**
     * 查询,加载所有用户
     */

    List<KeShi> selectKeShiDataByCon();

    //删除关系表，传参(xiTongID)
    Integer deleteYongHuKeShiByCon(String xiTongID);

    //删除用户表，传参(yongHuID)
    Integer deleteYongHuByCon(String yongHuID);

    //查询关系表所有数据
    List<YongHuKeShi> chaxunguanxibiao(String yongHuID);

}
