package com.group02.bean;

import java.sql.Date;

/**
 * Keshi 具体类
 */
public class KeShi {

    //系统ID
    private String xiTongID;
    //病人ID
    private String bingRenID;
    //被改变
    private Integer beiGaiBian;
    //上级ID
    private String shangJiID;
    //更新时间
    private Date gengXinShiJian;
    //病区名称
    private String bingQuMingCheng;
    //病区ID
    private String bingQuID;
    //科室ID
    private String keShiID;
    //科室名称
    private String keShiMingCheng;

    public String getXiTongID() {
        return xiTongID;
    }

    public void setXiTongID(String xiTongID) {
        this.xiTongID = xiTongID;
    }

    public String getBingRenID() {
        return bingRenID;
    }

    public void setBingRenID(String bingRenID) {
        this.bingRenID = bingRenID;
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

    public String getBingQuMingCheng() {
        return bingQuMingCheng;
    }

    public void setBingQuMingCheng(String bingQuMingCheng) {
        this.bingQuMingCheng = bingQuMingCheng;
    }

    public String getBingQuID() {
        return bingQuID;
    }

    public void setBingQuID(String bingQuID) {
        this.bingQuID = bingQuID;
    }

    public String getKeShiID() {
        return keShiID;
    }

    public void setKeShiID(String keShiID) {
        this.keShiID = keShiID;
    }

    public String getKeShiMingCheng() {
        return keShiMingCheng;
    }

    public void setKeShiMingCheng(String keShiMingCheng) {
        this.keShiMingCheng = keShiMingCheng;
    }

    @Override
    public String toString() {
        return "KeShi{" +
                "xiTongID='" + xiTongID + '\'' +
                ", bingRenID='" + bingRenID + '\'' +
                ", beiGaiBian=" + beiGaiBian +
                ", shangJiID='" + shangJiID + '\'' +
                ", gengXinShiJian=" + gengXinShiJian +
                ", bingQuMingCheng='" + bingQuMingCheng + '\'' +
                ", bingQuID='" + bingQuID + '\'' +
                ", keShiID='" + keShiID + '\'' +
                ", keShiMingCheng='" + keShiMingCheng + '\'' +
                '}';
    }
}
