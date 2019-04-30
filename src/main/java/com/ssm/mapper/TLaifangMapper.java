package com.ssm.mapper;

import com.ssm.pojo.TLaifang;
import com.ssm.pojo.TLaifangExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TLaifangMapper {
    int countByExample(TLaifangExample example);

    int deleteByExample(TLaifangExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TLaifang record);

    int insertSelective(TLaifang record);

    List<TLaifang> selectByExample(TLaifangExample example);

    TLaifang selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TLaifang record, @Param("example") TLaifangExample example);

    int updateByExample(@Param("record") TLaifang record, @Param("example") TLaifangExample example);

    int updateByPrimaryKeySelective(TLaifang record);

    int updateByPrimaryKey(TLaifang record);
}