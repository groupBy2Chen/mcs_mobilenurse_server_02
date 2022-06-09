package com.group02.bean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.Date;

/**
 * 导航父表
 */

@Component
public class DaoHangFu {

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
     * 组名称
     */
    private String zuMingCheng;

    /**
     * 排序id
     */
    private String paiXuID;

    /**
     * 组id
     */
    private String ZuID;

    /**
     * 备用01
     */
    private String beiYong01;

    /**
     * 备用02
     */
    private String bingRenID;

    /**
     * 备用03
     */
    private String beiYong03;

    /**
     * 备用04
     */
    private String beiYong04;

    /**
     * e名称
     */
    private String eMingCheng;

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

    public String getZuMingCheng() {
        return zuMingCheng;
    }

    public void setZuMingCheng(String zuMingCheng) {
        this.zuMingCheng = zuMingCheng;
    }

    public String getPaiXuID() {
        return paiXuID;
    }

    public void setPaiXuID(String paiXuID) {
        this.paiXuID = paiXuID;
    }

    public String getZuID() {
        return ZuID;
    }

    public void setZuID(String zuID) {
        ZuID = zuID;
    }

    public String getBeiYong01() {
        return beiYong01;
    }

    public void setBeiYong01(String beiYong01) {
        this.beiYong01 = beiYong01;
    }

    public String getBingRenID() {
        return bingRenID;
    }

    public void setBingRenID(String bingRenID) {
        this.bingRenID = bingRenID;
    }

    public String getBeiYong03() {
        return beiYong03;
    }

    public void setBeiYong03(String beiYong03) {
        this.beiYong03 = beiYong03;
    }

    public String getBeiYong04() {
        return beiYong04;
    }

    public void setBeiYong04(String beiYong04) {
        this.beiYong04 = beiYong04;
    }

    public String geteMingCheng() {
        return eMingCheng;
    }

    public void seteMingCheng(String eMingCheng) {
        this.eMingCheng = eMingCheng;
    }

    public String getMingCheng() {
        return mingCheng;
    }

    public void setMingCheng(String mingCheng) {
        this.mingCheng = mingCheng;
    }
}
