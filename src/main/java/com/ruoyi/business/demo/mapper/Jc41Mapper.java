package com.ruoyi.business.demo.mapper;

import com.ruoyi.business.demo.domain.Jc41;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Jc41Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jc41
     *
     * @mbg.generated Mon Oct 28 14:44:04 UTC 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jc41
     *
     * @mbg.generated Mon Oct 28 14:44:04 UTC 2024
     */
    int insert(Jc41 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jc41
     *
     * @mbg.generated Mon Oct 28 14:44:04 UTC 2024
     */
    int insertSelective(Jc41 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jc41
     *
     * @mbg.generated Mon Oct 28 14:44:04 UTC 2024
     */
    Jc41 selectById(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jc41
     *
     * @mbg.generated Mon Oct 28 14:44:04 UTC 2024
     */
    int updateByPrimaryKeySelective(Jc41 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jc41
     *
     * @mbg.generated Mon Oct 28 14:44:04 UTC 2024
     */
    int updateByPrimaryKey(Jc41 record);
}