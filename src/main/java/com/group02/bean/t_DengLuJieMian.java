package com.group02.bean;

import java.sql.Date;
import java.util.List;

public class t_DengLuJieMian {
//   系统id
    private String xiTongID;

//    病人id
    private String bingRenID;

//      被改变
    private Integer beiGaiBian;

//    上级id
    private String shangJiID;

//    更新时间
    private Date gengXinShiJian;

//    密码
    private String miMa;

//    超级
    private Integer chaoJi;

//    备用01
    private String beiYong01;

//    用户id
    private String yongHuID;

//    用户名
    private String yongHuMing;

//    工号
    private Integer gongHao;

//    职务
    private String zhiWu;

//    身份证号
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

    public String getMiMa() {
        return miMa;
    }

    public void setMiMa(String miMa) {
        this.miMa = miMa;
    }

    public Integer getChaoJi() {
        return chaoJi;
    }

    public void setChaoJi(Integer chaoJi) {
        this.chaoJi = chaoJi;
    }

    public String getBeiYong01() {
        return beiYong01;
    }

    public void setBeiYong01(String beiYong01) {
        this.beiYong01 = beiYong01;
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
        return "t_DengLuJieMian{" +
                "xiTongID='" + xiTongID + '\'' +
                ", bingRenID='" + bingRenID + '\'' +
                ", beiGaiBian=" + beiGaiBian +
                ", shangJiID='" + shangJiID + '\'' +
                ", gengXinShiJian=" + gengXinShiJian +
                ", miMa='" + miMa + '\'' +
                ", chaoJi=" + chaoJi +
                ", beiYong01='" + beiYong01 + '\'' +
                ", yongHuID='" + yongHuID + '\'' +
                ", yongHuMing='" + yongHuMing + '\'' +
                ", gongHao=" + gongHao +
                ", zhiWu='" + zhiWu + '\'' +
                ", shenFenZhengHao=" + shenFenZhengHao +
                '}';
    }
}
