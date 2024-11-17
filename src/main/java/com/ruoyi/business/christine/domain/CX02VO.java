package com.ruoyi.business.christine.domain;

import lombok.Data;

import java.util.Date;

@Data
public class CX02VO {
    private Long id;
    //创建时间
    private Date time;
    //地理位置（经纬度，以逗号分隔）
    private String position;
    //创建人ID
    private Long userid;
    private String username;
    //检测单位名称
    private String jcdwmc;
    //记录编号
    private String jlbh;
    //工程名称
    private String gcmc;
    //合同段
    private String htd;
    //施工单位
    private String sgdw;
    //监理单位
    private String jldw;
    //工程部位/用途
    private String gcbw_yt;
    //样品信息
    private String ypxx;
    //试验检测日期
    private Date syjcrq;
    //试验条件
    private String sytj;
    //检测依据
    private String jcyj;
    //判定依据
    private String pdyj;
    //主要仪器设备名称及编号
    private String zyyqsbmcjbh;
    //取样地点
    private String qydd;
    //取样日期
    private Date qyrq;
    //代表数量
    private Float dbsl;
    //集料产地
    private String jlcd;
    //品种规格
    private String pzgg;
    //容量筒和玻璃板总质量(g)（试验1）
    private Float m1_rlthblbzzl;
    //容量筒和玻璃板总质量(g)（试验2）
    private Float m1_2_rlthblbzzl;
    //容量筒、玻璃板和水总质量(g)（试验1）
    private Float m3_rltblbhszzl;
    //容量筒、玻璃板和水总质量(g)（试验2）
    private Float m3_2_rltblbhszzl;
    //容量筒容积单值（ml）（试验1）
    private Float v1_rltrjdz;
    //容量筒容积单值（ml）（试验2）
    private Float v2_rltrjdz;
    //容量筒容积平均值（ml）（试验1）
    private Float v_pjz1;
    //容量筒容积平均值（ml）（试验1）
    private Float v_pjz2;
    //试验温度T时水的密度
    private Float pT;
    //砂的表观密度(g/cm3)
    private Float psha;
    //容量筒质量(g)
    private Float mo;
    //容量筒和堆积砂的总质量(g)（试验1）
    private Float m2_rlthdjsdzzl;
    //容量筒和堆积砂的总质量(g)（试验2）
    private Float m2_2_rlthdjsdzzl;
    //堆积密度(g/cm3)单值（试验1）
    private Float p1_djmddz;
    //堆积密度(g/cm3)单值（试验2）
    private Float p2_djmddz;
    //堆积密度(g/cm3)平均值（试验1）
    private Float p_pjz1;
    //堆积密度(g/cm3)平均值（试验2）
    private Float p_pjz2;
    //堆积空隙率（%）
    private Float k;
    //容量筒和紧装砂的总质量(g)（试验1）
    private Float m4_rlthjzsdzzl;
    //容量筒和紧装砂的总质量(g)（试验2）
    private Float m4_2_rlthjzsdzzl;
    //紧装密度(g/cm3)单值（试验1）
    private Float y1_jzmddz;
    //紧装密度(g/cm3)单值（试验2）
    private Float y2_jzmddz;
    //紧装密度(g/cm3)平均值（试验1）
    private Float y_pjz1;
    //紧装密度(g/cm3)平均值（试验2）
    private Float y_pjz2;
    //紧装空隙率（%）
    private Float t;
    //附加声明
    private String fjsm;
}
