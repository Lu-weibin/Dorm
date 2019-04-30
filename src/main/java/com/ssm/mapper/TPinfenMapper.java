package com.ssm.mapper;

import com.ssm.pojo.TPinfen;
import com.ssm.pojo.TPinfenExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TPinfenMapper {
    int countByExample(TPinfenExample example);

    int deleteByExample(TPinfenExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TPinfen record);

    int insertSelective(TPinfen record);

    List<TPinfen> selectByExample(TPinfenExample example);

    TPinfen selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TPinfen record, @Param("example") TPinfenExample example);

    int updateByExample(@Param("record") TPinfen record, @Param("example") TPinfenExample example);

    int updateByPrimaryKeySelective(TPinfen record);

    int updateByPrimaryKey(TPinfen record);
}