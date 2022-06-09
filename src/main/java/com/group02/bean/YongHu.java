package com.group02.bean;

import java.sql.Date;

/**
 * YongHu 具体类
 */
public class YongHu {

    /**
     * 数据库中对应字段的含义
     */
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
    //超级管理员
    private Integer chaoji;
    //密码
    private String mima;
    //备用字段
    private String beiyong01;
    // 用户id
    private String yongHuID;
    //用户名
    private String yongHuMing;
    //工号
    private Integer gongHao;
    //职务
    private String zhiWu;
    //身份证号
    private Integer shenFenZhengHao;

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

    public Integer getChaoji() {
        return chaoji;
    }

    public void setChaoji(Integer chaoji) {
        this.chaoji = chaoji;
    }

    public String getMima() {
        return mima;
    }

    public void setMima(String mima) {
        this.mima = mima;
    }

    public String getBeiyong01() {
        return beiyong01;
    }

    public void setBeiyong01(String beiyong01) {
        this.beiyong01 = beiyong01;
    }

    public String getYongHuID() {
        return yongHuID;
    }

    public void setYongHuID(String yongHuID) {
        this.yongHuID = yongHuID;
    }

    public String getYongHuMing() {
        return yongHuMing;
    }

    public void setYongHuMing(String yongHuMing) {
        this.yongHuMing = yongHuMing;
    }

    public Integer getGongHao() {
        return gongHao;
    }

    public void setGongHao(Integer gongHao) {
        this.gongHao = gongHao;
    }

    public String getZhiWu() {
        return zhiWu;
    }

    public void setZhiWu(String zhiWu) {
        this.zhiWu = zhiWu;
    }

    public Integer getShenFenZhengHao() {
        return shenFenZhengHao;
    }

    public void setShenFenZhengHao(Integer shenFenZhengHao) {
        this.shenFenZhengHao = shenFenZhengHao;
    }

    @Override
    public String toString() {
        return "t_yonghu{" +
                "xiTongID='" + xiTongID + '\'' +
                ", bingRenID='" + bingRenID + '\'' +
                ", beiGaiBian=" + beiGaiBian +
                ", shangJiID='" + shangJiID + '\'' +
                ", gengXinShiJian=" + gengXinShiJian +
                ", chaoji=" + chaoji +
                ", mima='" + mima + '\'' +
                ", beiyong01='" + beiyong01 + '\'' +
                ", yongHuID='" + yongHuID + '\'' +
                ", yongHuMing='" + yongHuMing + '\'' +
                ", gongHao=" + gongHao +
                ", zhiWu='" + zhiWu + '\'' +
                ", shenFenZhengHao=" + shenFenZhengHao +
                '}';
    }
}
