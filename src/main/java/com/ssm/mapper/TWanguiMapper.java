package com.ssm.mapper;

import com.ssm.pojo.TWangui;
import com.ssm.pojo.TWanguiExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TWanguiMapper {
    int countByExample(TWanguiExample example);

    int deleteByExample(TWanguiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TWangui record);

    int insertSelective(TWangui record);

    List<TWangui> selectByExample(TWanguiExample example);

    TWangui selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TWangui record, @Param("example") TWanguiExample example);

    int updateByExample(@Param("record") TWangui record, @Param("example") TWanguiExample example);

    int updateByPrimaryKeySelective(TWangui record);

    int updateByPrimaryKey(TWangui record);
}