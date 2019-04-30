package com.ssm.service;

import java.util.List;

import com.ssm.pojo.TBaoxiu;
import com.ssm.pojo.TLaifang;
import com.ssm.pojo.TShuidianfei;
import com.ssm.pojo.TStudent;
import com.ssm.pojo.TWangui;

public interface StudentService {

	List<TStudent> findStudentByNameAndPwd(String num, String pw);

	TStudent findStudentByXueHao(String xuehao);

	void updateStudentByXueHao(TStudent student2);

	List<TStudent> findAllStudent();

	List<TShuidianfei> findShuidianfeiBySusheId(Integer id);

	List<TLaifang> findLaifangByXuehao(String xuehao);

	List<TWangui> findWanguiByXuehao(String xuehao);

	void addBaoxiu(TBaoxiu baoxiu);

	List<TBaoxiu> findBaoxiuByDorm(String string);

	void updateBaoxieById(TBaoxiu baoxiu);
	
	
}
