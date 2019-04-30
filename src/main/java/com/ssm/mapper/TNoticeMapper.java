package com.ssm.mapper;

import com.ssm.pojo.TNotice;
import com.ssm.pojo.TNoticeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TNoticeMapper {
    int countByExample(TNoticeExample example);

    int deleteByExample(TNoticeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TNotice record);

    int insertSelective(TNotice record);

    List<TNotice> selectByExample(TNoticeExample example);

    TNotice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TNotice record, @Param("example") TNoticeExample example);

    int updateByExample(@Param("record") TNotice record, @Param("example") TNoticeExample example);

    int updateByPrimaryKeySelective(TNotice record);

    int updateByPrimaryKey(TNotice record);

	List<TNotice> findNoticeByLouhao(String louhao);
}