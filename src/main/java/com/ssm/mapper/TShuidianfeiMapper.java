package com.ssm.mapper;

import com.ssm.pojo.TShuidianfei;
import com.ssm.pojo.TShuidianfeiExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TShuidianfeiMapper {
    int countByExample(TShuidianfeiExample example);

    int deleteByExample(TShuidianfeiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TShuidianfei record);

    int insertSelective(TShuidianfei record);

    List<TShuidianfei> selectByExample(TShuidianfeiExample example);

    TShuidianfei selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TShuidianfei record, @Param("example") TShuidianfeiExample example);

    int updateByExample(@Param("record") TShuidianfei record, @Param("example") TShuidianfeiExample example);

    int updateByPrimaryKeySelective(TShuidianfei record);

    int updateByPrimaryKey(TShuidianfei record);
}