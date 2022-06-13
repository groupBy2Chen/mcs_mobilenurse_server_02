package com.group02.bean;

import java.sql.Date;

/**
 * 导航子表实体类
 */
public class DaoHangZi {

    /**
     * 系统id
     */
    private String xiTongID;

    /**
     * 被改变
     */
    private Integer beiGaiBian;

    /**
     * 上级id
     */
    private String shangJiID;

    /**
     * 更新时间
     */
    private Date gengXinShiJian;

    /**
     * 子菜单id
     */
    private String ziCaiDanID;

    /**
     * 子菜单名称
     */
    private String ziCaiDanMingCheng;

    /**
     * 分组id
     */
    private String fenZuID;

    /**
     * 子菜单排序id
     */
    private String ziCaiDanPaiXuID;

    /**
     * 病人id
     */
    private String bingRenID;

    /**
     * 备用01
     */
    private String beiYong01;

    /**
     * 备用02
     */
    private String beiYong02;

    /**
     * e姓名
     */
    private String eXingMing;

    /**
     * 名称
     */
    private String mingCheng;

    public String getXiTongID() {
        return xiTongID;
    }

    public void setXiTongID(String xiTongID) {
        this.xiTongID = xiTongID;
    }

    public Integer getBeiGaiBian() {
        return beiGaiBian;
    }

    public void setBeiGaiBian(Integer beiGaiBian) {
        this.beiGaiBian = beiGaiBian;
    }

    public String getShangJiID() {
        return shangJiID;
    }

    public void setShangJiID(String shangJiID) {
        this.shangJiID = shangJiID;
    }

    public Date getGengXinShiJian() {
        return gengXinShiJian;
    }

    public void setGengXinShiJian(Date gengXinShiJian) {
        this.gengXinShiJian = gengXinShiJian;
    }

    public String getZiCaiDanID() {
        return ziCaiDanID;
    }

    public void setZiCaiDanID(String ziCaiDanID) {
        this.ziCaiDanID = ziCaiDanID;
    }

    public String getZiCaiDanMingCheng() {
        return ziCaiDanMingCheng;
    }

    public void setZiCaiDanMingCheng(String ziCaiDanMingCheng) {
        this.ziCaiDanMingCheng = ziCaiDanMingCheng;
    }

    public String getFenZuID() {
        return fenZuID;
    }

    public void setFenZuID(String fenZuID) {
        this.fenZuID = fenZuID;
    }

    public String getZiCaiDanPaiXuID() {
        return ziCaiDanPaiXuID;
    }

    public void setZiCaiDanPaiXuID(String ziCaiDanPaiXuID) {
        this.ziCaiDanPaiXuID = ziCaiDanPaiXuID;
    }

    public String getBingRenID() {
        return bingRenID;
    }

    public void setBingRenID(String bingRenID) {
        this.bingRenID = bingRenID;
    }

    public String getBeiYong01() {
        return beiYong01;
    }

    public void setBeiYong01(String beiYong01) {
        this.beiYong01 = beiYong01;
    }

    public String getBeiYong02() {
        return beiYong02;
    }

    public void setBeiYong02(String beiYong02) {
        this.beiYong02 = beiYong02;
    }

    public String geteXingMing() {
        return eXingMing;
    }

    public void seteXingMing(String eXingMing) {
        this.eXingMing = eXingMing;
    }

    public String getMingCheng() {
        return mingCheng;
    }

    public void setMingCheng(String mingCheng) {
        this.mingCheng = mingCheng;
    }
}
