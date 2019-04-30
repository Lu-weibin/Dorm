package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.mapper.TBaoxiuMapper;
import com.ssm.mapper.TLaifangMapper;
import com.ssm.mapper.TShuidianfeiMapper;
import com.ssm.mapper.TStudentMapper;
import com.ssm.mapper.TWanguiMapper;
import com.ssm.pojo.TBaoxiu;
import com.ssm.pojo.TBaoxiuExample;
import com.ssm.pojo.TLaifang;
import com.ssm.pojo.TLaifangExample;
import com.ssm.pojo.TShuidianfei;
import com.ssm.pojo.TShuidianfeiExample;
import com.ssm.pojo.TStudent;
import com.ssm.pojo.TStudentExample;
import com.ssm.pojo.TWangui;
import com.ssm.pojo.TWanguiExample;
import com.ssm.pojo.TStudentExample.Criteria;
import com.ssm.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private TStudentMapper studentMapper;
	@Autowired
	private TShuidianfeiMapper shuidianfeiMapper;
	@Autowired
	private TLaifangMapper laifangMapper;
	@Autowired
	private TWanguiMapper wanguiMapper;
	@Autowired
	private TBaoxiuMapper baoxiuMapper;
	
	@Override
	public List<TStudent> findStudentByNameAndPwd(String num, String pw) {
		TStudentExample example = new TStudentExample();
		Criteria criteria = example.createCriteria();
		criteria.andXuehaoEqualTo(num);
		criteria.andPasswordEqualTo(pw);
		List<TStudent> studentList = studentMapper.selectByExample(example);
		return studentList;
	}
	
	@Override
	public TStudent findStudentByXueHao(String xuehao) {
		
		return studentMapper.selectByPrimaryKey(xuehao);
	}
	
	@Override
	public void updateStudentByXueHao(TStudent student2) {
		studentMapper.updateByPrimaryKeySelective(student2);
	}
	
	@Override
	public List<TStudent> findAllStudent() {
		List<TStudent> studentList = studentMapper.selectByExample(null);
		return studentList;
	}
	
	@Override
	public List<TShuidianfei> findShuidianfeiBySusheId(Integer id) {
		TShuidianfeiExample example = new TShuidianfeiExample();
		com.ssm.pojo.TShuidianfeiExample.Criteria criteria = example.createCriteria();
		criteria.andDormNumEqualTo(id);
		return shuidianfeiMapper.selectByExample(example);
	}
	
	@Override
	public List<TLaifang> findLaifangByXuehao(String xuehao) {
		TLaifangExample example = new TLaifangExample();
		com.ssm.pojo.TLaifangExample.Criteria criteria = example.createCriteria();
		criteria.andXuehaoEqualTo(xuehao);
		return laifangMapper.selectByExample(example);
	}
	
	@Override
	public List<TWangui> findWanguiByXuehao(String xuehao) {
		TWanguiExample example = new TWanguiExample();
		com.ssm.pojo.TWanguiExample.Criteria criteria = example.createCriteria();
		criteria.andXuehaoEqualTo(xuehao);
		return wanguiMapper.selectByExample(example);
	}
	
	@Override
	public void addBaoxiu(TBaoxiu baoxiu) {
		baoxiuMapper.insertSelective(baoxiu);
	}
	
	@Override
	public List<TBaoxiu> findBaoxiuByDorm(String dorm) {
		TBaoxiuExample example = new TBaoxiuExample();
		com.ssm.pojo.TBaoxiuExample.Criteria criteria = example.createCriteria();
		criteria.andDormNumEqualTo(dorm);
		return baoxiuMapper.selectByExample(example);
	}
	
	@Override
	public void updateBaoxieById(TBaoxiu baoxiu) {
		baoxiuMapper.updateByPrimaryKeySelective(baoxiu);
	}
}
