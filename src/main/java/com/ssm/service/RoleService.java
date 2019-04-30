package com.ssm.service;

import java.util.List;

import com.ssm.pojo.TBaoxiu;
import com.ssm.pojo.TDorm;
import com.ssm.pojo.TLaifang;
import com.ssm.pojo.TLouhao;
import com.ssm.pojo.TNotice;
import com.ssm.pojo.TPinfen;
import com.ssm.pojo.TRole;
import com.ssm.pojo.TShuidianfei;
import com.ssm.pojo.TStudent;
import com.ssm.pojo.TWangui;

public interface RoleService {
	
	List<TRole> findRoleByNameAndPwd(String num, String pw, String level);

	TRole findRoleById(Integer id);

	void updateRoleById(TRole role2);

	void addDorm(TDorm dorm);

	void addRole(TRole role);

	void addLouHao(TLouhao louHao);

	TDorm findDormByLouhaoAndSushehao(String louhao, String dormNum);

	void addStudent(TStudent student);

	void updateDormById(TDorm dorm);

	void addNotice(TNotice notice);

	List<TDorm> findAllDorm();

	void delDormById(Integer id);

	TDorm findDormById(Integer id);

	TRole findRoleByNameAndRoleType(String name, Integer role);

	List<TRole> findRoleByRoleType(int i);

	List<TRole> findRoleByNameAndIdNotEqueal(TRole role);

	void delRoleById(Integer id);

	void updateLouhaoById(TRole role);

	void delLouhaoById(Integer louhaoid);

	Integer countLouhaoBySuguanId(Integer id);

	void delStudentByXuehao(String xuehao);

	List<TNotice> findAllNotice();

	void delNoticeeById(Integer id);

	List<TLouhao> findLouhaoBySuguanId(Integer suguanid);

	void addShuidianfei(TShuidianfei shuidianfei);

	void addPinfen(TPinfen pinfen);

	void addWangui(TWangui wangui);

	void addLaifang(TLaifang laifang);

	List<TShuidianfei> findShuidianfeiByLouhao(String louhao);

	void delShuidianfei(Integer id);

	void updateShuidianfei(TShuidianfei shuidianfei);

	List<TPinfen> findPinfenByLouhao(String louhao);

	void delPinfen(Integer id);

	List<TWangui> findWanguiByLouhao(String louhao);

	TStudent findStudentByXuehao(String xuehao);

	void delwangui(Integer id);

	List<TLaifang> findLaifangByLouhao(String louhao);

	void dellaifang(Integer id);

	List<TNotice> findNoticeByLouhao(String louhao);

	List<TBaoxiu> findAllBaoxiu();

	void delBaoxiuById(Integer id);

}
