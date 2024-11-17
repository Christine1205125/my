package com.ruoyi.business.christine.controller;

import com.github.pagehelper.PageInfo;
import com.ruoyi.business.christine.domain.CX02;
import com.ruoyi.business.christine.domain.CX02VO;
import com.ruoyi.business.christine.mapper.CX02Mapper;
import com.ruoyi.business.christine.service.CX02Service;
import com.ruoyi.common.constant.HttpStatus;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.utils.PageUtils;
import com.ruoyi.common.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/business/christine/cx02")
public class CX02controller {
    @Autowired
    private CX02Mapper cx02Mapper;
    private CX02Service cx02Service;

    @GetMapping("/get/{id}")
    public AjaxResult get(@PathVariable Long id) {
        //cx02Mapper.selectByPrimaryKey(id);
        return AjaxResult.success();
    }
    @PostMapping("/insert")
    public AjaxResult insert(@Valid @RequestBody CX02 cx02, BindingResult result){
        CX02 temp = cx02;
        if(result.hasErrors()){
            List<FieldError>errors = result.getFieldErrors();
            Map<String,String> map = new HashMap<String,String>();
            for (FieldError err : errors){
                String beforeErrorInfo = map.get(err.getField()) == null ? "": map.get(err.getField())+"";
                map.put(err.getField(),beforeErrorInfo + err.getDefaultMessage());
            }
            return new AjaxResult(HttpStatus.VALID_ERROR,"表单校验失败！", map);
        }
        cx02 = compute(cx02);
        CX02 tep = cx02;
        if(cx02.getErrorsMap().size()>0){
            return new AjaxResult(HttpStatus.VALID_ERROR, "表单校验失败！", cx02.getErrorsMap());
        }

        cx02.setUserid(SecurityUtils.getUserId());
        cx02Mapper.insert(cx02);
        return AjaxResult.success(result.getAllErrors());

    }

    private CX02 compute(CX02 cx02){
        CX02 tmp = cx02;
        if(0.0f == cx02.getPT()){
            cx02.getErrorsMap().put("v1_rltrjdz","ΡT不能为0");
            return cx02;
        }
        if(0.0f == cx02.getPsha()){
            cx02.getErrorsMap().put("Ρsha","Ρsha不能为0");
            return cx02;
        }


        cx02.setV1_rltrjdz((cx02.getM3_rltblbhszzl()-cx02.getM1_rlthblbzzl())/cx02.getPT());
        cx02.setV2_rltrjdz((cx02.getM3_2_rltblbhszzl()-cx02.getM1_2_rlthblbzzl())/cx02.getPT());

        cx02.setV_pjz1((cx02.getV1_rltrjdz()+cx02.getV2_rltrjdz())/2);

        cx02.setP1_djmddz((cx02.getM2_rlthdjsdzzl()-cx02.getMo())/cx02.getV_pjz1());
        cx02.setP2_djmddz((cx02.getM2_2_rlthdjsdzzl()-cx02.getMo())/cx02.getV_pjz1());

        cx02.setP_pjz1((cx02.getP1_djmddz()+cx02.getP2_djmddz())/2);

        cx02.setK(((1-cx02.getP_pjz1())/ cx02.getPsha())*100);

        cx02.setY1_jzmddz((cx02.getM4_rlthjzsdzzl()-cx02.getMo())/cx02.getV_pjz1());
        cx02.setY2_jzmddz((cx02.getM4_2_rlthjzsdzzl()-cx02.getMo())/cx02.getV_pjz1());

        cx02.setY_pjz1((cx02.getY1_jzmddz()+cx02.getY2_jzmddz())/2);

        cx02.setT(((1-cx02.getY1_jzmddz())/ cx02.getPsha())*100);

        if(cx02.getV_pjz1() == null || 0.0f == cx02.getV_pjz1()){
            cx02.getErrorsMap().put("v_pjz","容量筒和玻璃板总质量不能等于容量筒、玻璃板和水总质量");
            return cx02;
        }
        return cx02;
    }

@PostMapping("/update")
public AjaxResult update(@RequestBody CX02 cx02, BindingResult result){
    if (null == cx02.getId()){
        return new AjaxResult(HttpStatus.VALID_ERROR, "ID为空！");
    }
    if(result.hasErrors()){
        List<FieldError>errors = result.getFieldErrors();
        Map<String,String> map = new HashMap<String,String>();
        for (FieldError err : errors){
            String beforeErrorInfo = map.get(err.getField()) == null ? "": map.get(err.getField())+"";
            map.put(err.getField(),beforeErrorInfo+err.getDefaultMessage());
        }
        return new AjaxResult(HttpStatus.VALID_ERROR,"表单校验失败！",map);
    }
    cx02=compute(cx02);
    if(cx02.getErrorsMap().size()>0){
        return new AjaxResult(HttpStatus.VALID_ERROR, "表单校验失败！", cx02.getErrorsMap());
    }
    cx02.setUserid(SecurityUtils.getUserId());
    cx02Mapper.updateByPrimaryKey(cx02);
    return AjaxResult.success();
}


    @DeleteMapping("/delete")
        public AjaxResult delete(Long id){
            cx02Mapper.deleteByPrimaryKey(id);
            return AjaxResult.success();
        }

    @PostMapping("/list")
    public TableDataInfo list(@RequestBody CX02VO vo)
    {
        PageUtils.startPage();
        List<CX02> cx02List = cx02Mapper.selectListByVo(vo);
        PageUtils.clearPage();
        return getDataTable(cx02List);
    }
    protected TableDataInfo getDataTable(List<?> list)
    {
        TableDataInfo rspData = new TableDataInfo();
        rspData.setCode(HttpStatus.SUCCESS);
        rspData.setMsg("查询成功");
        rspData.setRows(list);
        rspData.setTotal(new PageInfo(list).getTotal());
        return rspData;
    }


    //    @PostMapping("/insert")
//    public AjaxResult insert(@RequestBody CX02 cx02) {
//        cx02Mapper.insert(cx02);
//        return AjaxResult.success();
//    }
    //    @PostMapping("/update")
//    public AjaxResult update(@RequestBody CX02 cx02) {
//
//        cx02Mapper.updateByPrimaryKey(cx02);
//        return AjaxResult.success();
//    }

}