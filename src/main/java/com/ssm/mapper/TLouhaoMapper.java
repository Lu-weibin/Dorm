package com.ssm.mapper;

import com.ssm.pojo.TLouhao;
import com.ssm.pojo.TLouhaoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TLouhaoMapper {
    int countByExample(TLouhaoExample example);

    int deleteByExample(TLouhaoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TLouhao record);

    int insertSelective(TLouhao record);

    List<TLouhao> selectByExample(TLouhaoExample example);

    TLouhao selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TLouhao record, @Param("example") TLouhaoExample example);

    int updateByExample(@Param("record") TLouhao record, @Param("example") TLouhaoExample example);

    int updateByPrimaryKeySelective(TLouhao record);

    int updateByPrimaryKey(TLouhao record);
}