package com.ssm.mapper;

import com.ssm.pojo.TDorm;
import com.ssm.pojo.TDormExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TDormMapper {
    int countByExample(TDormExample example);

    int deleteByExample(TDormExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDorm record);

    int insertSelective(TDorm record);

    List<TDorm> selectByExample(TDormExample example);

    TDorm selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TDorm record, @Param("example") TDormExample example);

    int updateByExample(@Param("record") TDorm record, @Param("example") TDormExample example);

    int updateByPrimaryKeySelective(TDorm record);

    int updateByPrimaryKey(TDorm record);
}