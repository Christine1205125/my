package com.ruoyi.business.demo.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Jc41 implements Serializable {
    private Long id;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private String sgdw;
    private String hth;
    private String jldw;
    private String bh;
    private String gcmc;
    private String zhjgcbw;
    private String wydj;
    private String ddclCzdbh;
    private String czdX;
    private String czdY;
    private String czdH;
    private String ddclHsdbh;
    private String hsdX;
    private String hsdY;
    private String hsdH;
    private String bzhct;
    private String zjjl;
    private String jlyj;
    private String clgcs;
    private String zyjlgcs;
    private String cly;
    private String js;
    private String jh;
    private String clrq;

    private List<Jc41Item> items;

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

    public String getSgdw() {
        return sgdw;
    }

    public void setSgdw(String sgdw) {
        this.sgdw = sgdw;
    }

    public String getHth() {
        return hth;
    }

    public void setHth(String hth) {
        this.hth = hth;
    }

    public String getJldw() {
        return jldw;
    }

    public void setJldw(String jldw) {
        this.jldw = jldw;
    }

    public String getBh() {
        return bh;
    }

    public void setBh(String bh) {
        this.bh = bh;
    }

    public String getGcmc() {
        return gcmc;
    }

    public void setGcmc(String gcmc) {
        this.gcmc = gcmc;
    }

    public String getZhjgcbw() {
        return zhjgcbw;
    }

    public void setZhjgcbw(String zhjgcbw) {
        this.zhjgcbw = zhjgcbw;
    }

    public String getWydj() {
        return wydj;
    }

    public void setWydj(String wydj) {
        this.wydj = wydj;
    }

    public String getDdclCzdbh() {
        return ddclCzdbh;
    }

    public void setDdclCzdbh(String ddclCzdbh) {
        this.ddclCzdbh = ddclCzdbh;
    }

    public String getCzdX() {
        return czdX;
    }

    public void setCzdX(String czdX) {
        this.czdX = czdX;
    }

    public String getCzdY() {
        return czdY;
    }

    public void setCzdY(String czdY) {
        this.czdY = czdY;
    }

    public String getCzdH() {
        return czdH;
    }

    public void setCzdH(String czdH) {
        this.czdH = czdH;
    }

    public String getDdclHsdbh() {
        return ddclHsdbh;
    }

    public void setDdclHsdbh(String ddclHsdbh) {
        this.ddclHsdbh = ddclHsdbh;
    }

    public String getHsdX() {
        return hsdX;
    }

    public void setHsdX(String hsdX) {
        this.hsdX = hsdX;
    }

    public String getHsdY() {
        return hsdY;
    }

    public void setHsdY(String hsdY) {
        this.hsdY = hsdY;
    }

    public String getHsdH() {
        return hsdH;
    }

    public void setHsdH(String hsdH) {
        this.hsdH = hsdH;
    }

    public String getBzhct() {
        return bzhct;
    }

    public void setBzhct(String bzhct) {
        this.bzhct = bzhct;
    }

    public String getZjjl() {
        return zjjl;
    }

    public void setZjjl(String zjjl) {
        this.zjjl = zjjl;
    }

    public String getJlyj() {
        return jlyj;
    }

    public void setJlyj(String jlyj) {
        this.jlyj = jlyj;
    }

    public String getClgcs() {
        return clgcs;
    }

    public void setClgcs(String clgcs) {
        this.clgcs = clgcs;
    }

    public String getZyjlgcs() {
        return zyjlgcs;
    }

    public void setZyjlgcs(String zyjlgcs) {
        this.zyjlgcs = zyjlgcs;
    }

    public String getCly() {
        return cly;
    }

    public void setCly(String cly) {
        this.cly = cly;
    }

    public String getJs() {
        return js;
    }

    public void setJs(String js) {
        this.js = js;
    }

    public String getJh() {
        return jh;
    }

    public void setJh(String jh) {
        this.jh = jh;
    }

    public String getClrq() {
        return clrq;
    }

    public void setClrq(String clrq) {
        this.clrq = clrq;
    }

    public List<Jc41Item> getItems() {
        return items;
    }

    public void setItems(List<Jc41Item> items) {
        this.items = items;
    }
}
