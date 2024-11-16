package com.ruoyi.business.christine.mapper;

import com.ruoyi.business.christine.domain.CX02;
import com.ruoyi.business.christine.domain.CX02VO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CX02Mapper {
    int deleteByPrimaryKey(Long id);

    int insert(CX02 row);

    int insertSelective(CX02 row);

    CX02 selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CX02 row);

    int updateByPrimaryKey(CX02 row);

    List<CX02> selectListByVo(CX02VO vo);
}