package com.ssm.mapper;

import com.ssm.pojo.TBaoxiu;
import com.ssm.pojo.TBaoxiuExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TBaoxiuMapper {
    int countByExample(TBaoxiuExample example);

    int deleteByExample(TBaoxiuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBaoxiu record);

    int insertSelective(TBaoxiu record);

    List<TBaoxiu> selectByExample(TBaoxiuExample example);

    TBaoxiu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBaoxiu record, @Param("example") TBaoxiuExample example);

    int updateByExample(@Param("record") TBaoxiu record, @Param("example") TBaoxiuExample example);

    int updateByPrimaryKeySelective(TBaoxiu record);

    int updateByPrimaryKey(TBaoxiu record);
}