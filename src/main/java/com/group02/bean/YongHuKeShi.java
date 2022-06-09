package com.group02.bean;

import java.sql.Date;

/**
 * YongHuKeShi 具体类
 */
public class YongHuKeShi {

    /**
     * 系统ID
     */
    private String xiTongID;
    /**
     * 病人ID
     */
    private String bingRenID;
    /**
     * 被改变
     */
    private Integer beiGaiBian;
    /**
     * 上级ID
     */
    private String shangJiID;
    /**
     * 更新时间
     */
    private Date gengXinShiJian;
    /**
     * 科室ID
     */
    private String keShiID;
    /**
     * 用户ID
     */
    private String yongHuID;

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

    public String getKeShiID() {
        return keShiID;
    }

    public void setKeShiID(String keShiID) {
        this.keShiID = keShiID;
    }

    public String getYongHuID() {
        return yongHuID;
    }

    public void setYongHuID(String yongHuID) {
        this.yongHuID = yongHuID;
    }

    @Override
    public String toString() {
        return "YongHuKeShi{" +
                "xiTongID='" + xiTongID + '\'' +
                ", bingRenID='" + bingRenID + '\'' +
                ", beiGaiBian=" + beiGaiBian +
                ", shangJiID='" + shangJiID + '\'' +
                ", gengXinShiJian=" + gengXinShiJian +
                ", keShiID='" + keShiID + '\'' +
                ", yongHuID='" + yongHuID + '\'' +
                '}';
    }
}
