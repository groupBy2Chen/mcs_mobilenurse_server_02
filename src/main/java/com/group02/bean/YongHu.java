package com.group02.bean;

import java.sql.Date;

/**
 * YongHu 具体类
 */
public class YongHu {

    /**
     * 系统ID
     */
    private String xiTongID;

    /**
     * 病人ID
     */
    private String bingRenID;

    /**
     * 是否被改变
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
     * 是否为超级管理员
     */
    private Integer chaoJi;

    /**
     *  密码
     */
    private String miMa;

    /**
     * 用户id
     */
    private String yongHuID;
    /**
     * 用户名
     */
    private String yongHuMing;

    /**
     * 工号
     */
    private Integer gongHao;

    /**
     * 职务
     */
    private String zhiWu;

    /**
     * 身份证号
     */
    private Integer shenFenZhengHao;

    /**
     * 备用字段01
     */
    private String beiyong01;

    /**
     * 生成setter 和 getter 方法
     */
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

    public Integer getchaoJi() {
    return chaoJi;
    }

    public void setchaoJi(Integer chaoJi) {
    this.chaoJi = chaoJi;
    }

    public String getmiMa() {
    return miMa;
    }

    public void setmiMa(String miMa) {
    this.miMa = miMa;
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

    /**
     * 重新toString方法
     */
    @Override
    public String toString() {
        return "t_yonghu{" +
                "xiTongID='" + xiTongID + '\'' +
                ", bingRenID='" + bingRenID + '\'' +
                ", beiGaiBian=" + beiGaiBian +
                ", shangJiID='" + shangJiID + '\'' +
                ", gengXinShiJian=" + gengXinShiJian +
                ", chaoJi=" + chaoJi +
                ", miMa='" + miMa + '\'' +
                ", beiyong01='" + beiyong01 + '\'' +
                ", yongHuID='" + yongHuID + '\'' +
                ", yongHuMing='" + yongHuMing + '\'' +
                ", gongHao=" + gongHao +
                ", zhiWu='" + zhiWu + '\'' +
                ", shenFenZhengHao=" + shenFenZhengHao +
                '}';
    }
}
