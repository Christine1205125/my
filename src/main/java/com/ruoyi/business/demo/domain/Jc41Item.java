package com.ruoyi.business.demo.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Jc41Item implements Serializable {
    private Long id;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private Long jc41Id;
    private String sczbjcgX;
    private String sczbjcgY;
    private String sczbjcgH;
    private String jszh;
    private BigDecimal dmyxsjzbjcgX0;
    private BigDecimal dmyxsjzbjcgY0;
    private BigDecimal dmyxsjzbjcgH0;
    private BigDecimal jsscbj;
    private BigDecimal sjbj;
    private Integer cqz;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getJc41Id() {
        return jc41Id;
    }

    public void setJc41Id(Long jc41Id) {
        this.jc41Id = jc41Id;
    }

    public String getSczbjcgX() {
        return sczbjcgX;
    }

    public void setSczbjcgX(String sczbjcgX) {
        this.sczbjcgX = sczbjcgX;
    }

    public String getSczbjcgY() {
        return sczbjcgY;
    }

    public void setSczbjcgY(String sczbjcgY) {
        this.sczbjcgY = sczbjcgY;
    }

    public String getSczbjcgH() {
        return sczbjcgH;
    }

    public void setSczbjcgH(String sczbjcgH) {
        this.sczbjcgH = sczbjcgH;
    }

    public String getJszh() {
        return jszh;
    }

    public void setJszh(String jszh) {
        this.jszh = jszh;
    }

    public BigDecimal getDmyxsjzbjcgX0() {
        return dmyxsjzbjcgX0;
    }

    public void setDmyxsjzbjcgX0(BigDecimal dmyxsjzbjcgX0) {
        this.dmyxsjzbjcgX0 = dmyxsjzbjcgX0;
    }

    public BigDecimal getDmyxsjzbjcgY0() {
        return dmyxsjzbjcgY0;
    }

    public void setDmyxsjzbjcgY0(BigDecimal dmyxsjzbjcgY0) {
        this.dmyxsjzbjcgY0 = dmyxsjzbjcgY0;
    }

    public BigDecimal getDmyxsjzbjcgH0() {
        return dmyxsjzbjcgH0;
    }

    public void setDmyxsjzbjcgH0(BigDecimal dmyxsjzbjcgH0) {
        this.dmyxsjzbjcgH0 = dmyxsjzbjcgH0;
    }

    public BigDecimal getJsscbj() {
        return jsscbj;
    }

    public void setJsscbj(BigDecimal jsscbj) {
        this.jsscbj = jsscbj;
    }

    public BigDecimal getSjbj() {
        return sjbj;
    }

    public void setSjbj(BigDecimal sjbj) {
        this.sjbj = sjbj;
    }

    public Integer getCqz() {
        return cqz;
    }

    public void setCqz(Integer cqz) {
        this.cqz = cqz;
    }
}
