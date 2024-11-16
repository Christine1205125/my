package com.ruoyi.business.demo.controller;

import com.alibaba.fastjson2.JSON;
import com.ruoyi.business.demo.mapper.Jc41Mapper;
import com.ruoyi.business.demo.domain.Jc41;
import com.ruoyi.business.demo.service.Jc41Service;
import com.ruoyi.common.core.domain.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/business/demo/jc41")
public class Jc41Controller {
    @Autowired
    private Jc41Mapper jc41Mapper;
    @Autowired
    private Jc41Service jc41Service;

    @GetMapping(value = "/get/{id}")
    public AjaxResult get(@PathVariable Long id){
        Jc41 jc41 = jc41Mapper.selectById(id);
        System.out.println(JSON.toJSONString(jc41));
        if (null == jc41) {
            return AjaxResult.error("没有记录");
        }
        return AjaxResult.success(jc41);
    }

    @PostMapping("/insert")
    public AjaxResult insert(@RequestBody Jc41 jc41) {
        try{
            jc41Service.insert(jc41);
            return AjaxResult.success("成功插入！");
        }catch (Exception e){
            return AjaxResult.error("插入失败："+e.getMessage()+"!");
        }
    }

    @PostMapping("/update")
    public AjaxResult update(@RequestBody Jc41 jc41) {
        try{
            jc41Service.update(jc41);
            return AjaxResult.success("成功修改！");
        }catch (Exception e){
            return AjaxResult.error("失败修改："+e.getMessage()+"!");
        }
    }
}
