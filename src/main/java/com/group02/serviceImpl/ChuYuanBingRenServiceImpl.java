package com.group02.serviceImpl;

import com.group02.bean.ChuYuanBingRen;
import com.group02.bean.ZaiYuanBingRen;
import com.group02.dao.ChuYuanBingRenDao;
import com.group02.service.ChuYuanBingRenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * ChuYuanBingRen 业务层实现类
 */
@Service
public class ChuYuanBingRenServiceImpl implements ChuYuanBingRenService {

    //注入ChuYuanBingRenDao对象
    @Autowired
    ChuYuanBingRenDao chuYuanBingRenDao;

    /**
     * name findChuYuanBingRenAllDataOrByCon
     * 功能： 根据是否传递xingMing属性的参数判断查询全部数据或模糊查询
     *
     * @param chuYuanBingRen_objFlag
     * @return List<ChuYuanBingRen>@return
     */
    @Override
    public List<ChuYuanBingRen> findChuYuanBingRenAllDataOrByCon(ChuYuanBingRen chuYuanBingRen_objFlag) {

        /**
         * 判断
         *  如果不携带xingMing参数则查询全部数据并返回
         *  否则按照xingMing参数进行模糊查询并组织树形控件对应的数据格式返回
         */
        if(chuYuanBingRen_objFlag == null | chuYuanBingRen_objFlag.getXingMing().equals("")){

            List<ChuYuanBingRen> list_flag = chuYuanBingRenDao.selectChuYuanBingRenAllDataOrByCon(chuYuanBingRen_objFlag);

            return list_flag;
        }else{
            /**
             * 组织数据
             */
            List<ChuYuanBingRen> list_flag = chuYuanBingRenDao.selectChuYuanBingRenAllDataOrByCon(chuYuanBingRen_objFlag);

            //将出院病人对象中封装label和children属性 然后声明一个ChuYuanBingRen的对象
            ChuYuanBingRen obj_flag = new ChuYuanBingRen();
            obj_flag.setLabel("出院病人");

            //将集合childrens 封装成children属性的值
            List<ChuYuanBingRen> childrens = new ArrayList<>();
            obj_flag.setChildren(childrens);

            //遍历查询得到的数据
            for (ChuYuanBingRen obj:list_flag){

                //声明新的ChuYuanBingRen对象
                ChuYuanBingRen objFlag = new ChuYuanBingRen();
                objFlag = obj;

                //将每一个数据中树形控件所需要的数据封装在这个ChuYuanBingRen对象中
                objFlag.setLabel("[" + obj.getChuangHao() + "]" + obj.getXingMing());

                //将这些对象循环封装在childrens集合中
                childrens.add(objFlag);
            }

            //最后将组织好的数据封装在一个新数组中return
            List<ChuYuanBingRen> DataForTree = new ArrayList<>();
            DataForTree.add(obj_flag);

            return DataForTree;

        }

    }
}
