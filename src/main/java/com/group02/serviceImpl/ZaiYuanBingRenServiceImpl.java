package com.group02.serviceImpl;

import com.group02.bean.ZaiYuanBingRen;
import com.group02.dao.ZaiYuanBingRenDao;
import com.group02.service.ZaiYuanBingRenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ZaiYuanBingRen 业务层实现类
 */
@Service
public class ZaiYuanBingRenServiceImpl implements ZaiYuanBingRenService {

    //注入ZaiYuanBingRenDao对象
    @Autowired
    ZaiYuanBingRenDao zaiYuanBingRenDao;

    /**
     * name： findZaiYuanBingRenDataBykeShiID
     * 功能：  根据YongHuID 查询ZaiYuanBingRen表中所有数据
     *  如果参数中huLiDengJi不为空 那么查询时额外添加护理等级条件
     * 时间：  2022-0609-23：40
     * codeBy：  chen
     *
     * @param keShiID
     * @return List<ZaiYuanBingRen>
     */
    @Override
    public List<ZaiYuanBingRen> findZaiYuanBingRenDataBykeShiID(String keShiID,String huLiDengJi) {

        /**
         * 判断huLiDengJi是否为空
         * 若为空则正常执行查询方法 并直接返回结果集合
         * 否则执行查询方法后 组织并返回view层需要的数据格式
         */
        if(huLiDengJi == null || huLiDengJi == ""){

            List<ZaiYuanBingRen> list_flag = zaiYuanBingRenDao.selectZaiYuanBingRenDataBykeShiID(keShiID,huLiDengJi);

            return list_flag;

        }else{

            /**
             * 限制huLiDengJi的值，防止SQL返回错误数据
             */
            if(huLiDengJi.equals("在院病人")){
                huLiDengJi = "";
            }
            List<ZaiYuanBingRen> list_flag = zaiYuanBingRenDao.selectZaiYuanBingRenDataBykeShiID(keShiID,huLiDengJi);

            /**
             * 组织数据
             */
            //将在院病人对象中封装label和children属性 然后声明一个ZaiYuanBingRen的对象
            ZaiYuanBingRen obj_flag = new ZaiYuanBingRen();
            obj_flag.setLabel("在院病人");

            //将集合childrens 封装成children属性的值
            List<ZaiYuanBingRen> childrens = new ArrayList<>();
            obj_flag.setChildren(childrens);

            //遍历查询得到的数据
            for (ZaiYuanBingRen obj:list_flag){
                //声明新的ZaiYuanBingRen对象
                ZaiYuanBingRen objFlag = new ZaiYuanBingRen();
                objFlag = obj;
                //将每一个数据中树形控件所需要的数据封装在这个ZaiYuanBingRen对象中
                objFlag.setLabel("[" + obj.getChuangHao() + "]" + obj.getXingMing());

                //将这些对象循环封装在childrens集合中
                childrens.add(objFlag);
            }

            //最后将组织好的数据封装在一个新数组中return
            List<ZaiYuanBingRen> DataForTree = new ArrayList<>();
            DataForTree.add(obj_flag);

            return DataForTree;
        }
    }
}
