package com.ruoyi.business.christine.domain;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Date;
import java.util.Map;

@Data
@ToString
public class CX02 {
    //主键
    private Long id;
    //采集数据提交时间
//    @NotNull(message = "time字段不能为null")
    private Date time;
    //采集数据提交地点（经纬度）
    @Size(max = 64,message = "字符长度不超过64")
    private String position;
    //采集人员编号
//    @NotEmpty(message = "字段不能为空")
    private Long userid;
    //检测单位名称
    @Size(max = 64,message = "字符长度不超过64")
    @NotEmpty(message = "字段不能为空")
    private String jcdwmc;
    //记录编号
    @NotEmpty(message = "字段不能为空")
    @Size(max = 64,message = "字符长度不超过64")
    private String jlbh;
    //工程名称
    @NotEmpty(message = "字段不能为空")
    @Size(max = 64,message = "字符长度不超过64")
    private String gcmc;
    //合同段
    @NotEmpty(message = "字段不能为空")
    @Size(max = 64,message = "字符长度不超过64")
    private String htd;
    //施工单位
    @NotEmpty(message = "字段不能为空")
    @Size(max = 64,message = "字符长度不超过64")
    private String sgdw;
    //监理单位
    @NotEmpty(message = "字段不能为空")
    @Size(max = 64,message = "字符长度不超过64")
    private String jldw;
    //工程部位/用途
    @NotEmpty(message = "字段不能为空")
    @Size(max = 64,message = "字符长度不超过64")
    private String gcbw_yt;
    //样品信息
    @NotEmpty(message = "字段不能为空")
    @Size(max = 64,message = "字符长度不超过64")
    private String ypxx;
    //试验检测日期
    private Date syjcrq;
    //试验条件
    @Size(max = 64,message = "字符长度不超过64")
    private String sytj;
    //检测依据
    @Size(max = 64,message = "字符长度不超过64")
    private String jcyj;
    //判定依据
    @Size(max = 64,message = "字符长度不超过64")
    private String pdyj;
    //主要仪器设备名称及编号
    @Size(max = 64,message = "字符长度不超过64")
    private String zyyqsbmcjbh;
    //取样地点
    @Size(max = 64,message = "字符长度不超过64")
    private String qydd;
    //取样日期
    private Date qyrq;
    //代表数量（m³）
    private Float dbsl;
    //集料产地
    @Size(max = 64,message = "字符长度不超过64")
    private String jlcd;
    //品种规格
    @Size(max = 64,message = "字符长度不超过64")
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
    private Float ρT;
    //砂的表观密度(g/cm3)
    private Float ρsha;
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

    public Map<Object, Object> getErrorsMap() {
        return null;
    }
}
