package com.sc.ajax.bean;

public class Address {
    private Integer addId;

    private String shr;

    private String phone;

    private String sheng;

    private String shi;

    private String qu;

    private String detail;

    private Integer def;

    private Integer state;

    public Integer getAddId() {
        return addId;
    }

    public void setAddId(Integer addId) {
        this.addId = addId;
    }

    public String getShr() {
        return shr;
    }

    public void setShr(String shr) {
        this.shr = shr == null ? null : shr.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getSheng() {
        return sheng;
    }

    public void setSheng(String sheng) {
        this.sheng = sheng == null ? null : sheng.trim();
    }

    public String getShi() {
        return shi;
    }

    public void setShi(String shi) {
        this.shi = shi == null ? null : shi.trim();
    }

    public String getQu() {
        return qu;
    }

    public void setQu(String qu) {
        this.qu = qu == null ? null : qu.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public Integer getDef() {
        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}