package com.ruoyi.business.demo.service.impl;

import com.ruoyi.business.demo.mapper.Jc41ItemMapper;
import com.ruoyi.business.demo.mapper.Jc41Mapper;
import com.ruoyi.business.demo.domain.Jc41;
import com.ruoyi.business.demo.domain.Jc41Item;
import com.ruoyi.business.demo.service.Jc41Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Jc41ServiceImpl implements Jc41Service {
    @Autowired
    private Jc41Mapper mapper;
    @Autowired
    private Jc41ItemMapper itemMapper;

    @Transactional
    @Override
    public void insert(Jc41 jc41) {
        mapper.insert(jc41);
        for (Jc41Item item: jc41.getItems()) {
            item.setJc41Id(jc41.getId());
            itemMapper.insert(item);
        }
    }

    @Transactional
    @Override
    public void update(Jc41 jc41) {
        mapper.updateByPrimaryKey(jc41);
        for (Jc41Item item: jc41.getItems()) {
            item.setJc41Id(jc41.getId());
            itemMapper.updateById(item);
        }
    }

    @Override
    public void delete(Long id) {

    }
}
