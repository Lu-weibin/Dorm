package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.mapper.TBaoxiuMapper;
import com.ssm.mapper.TDormMapper;
import com.ssm.mapper.TLaifangMapper;
import com.ssm.mapper.TLouhaoMapper;
import com.ssm.mapper.TNoticeMapper;
import com.ssm.mapper.TPinfenMapper;
import com.ssm.mapper.TRoleMapper;
import com.ssm.mapper.TShuidianfeiMapper;
import com.ssm.mapper.TStudentMapper;
import com.ssm.mapper.TWanguiMapper;
import com.ssm.pojo.TBaoxiu;
import com.ssm.pojo.TDorm;
import com.ssm.pojo.TDormExample;
import com.ssm.pojo.TLaifang;
import com.ssm.pojo.TLaifangExample;
import com.ssm.pojo.TLouhao;
import com.ssm.pojo.TLouhaoExample;
import com.ssm.pojo.TNotice;
import com.ssm.pojo.TNoticeExample;
import com.ssm.pojo.TPinfen;
import com.ssm.pojo.TPinfenExample;
import com.ssm.pojo.TRole;
import com.ssm.pojo.TRoleExample;
import com.ssm.pojo.TRoleExample.Criteria;
import com.ssm.pojo.TShuidianfei;
import com.ssm.pojo.TShuidianfeiExample;
import com.ssm.pojo.TStudent;
import com.ssm.pojo.TWangui;
import com.ssm.pojo.TWanguiExample;
import com.ssm.service.RoleService;
@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	private TRoleMapper roleMapper;
	@Autowired
	private TDormMapper dormMapper;
	@Autowired
	private TLouhaoMapper louhaomapper;
	@Autowired
	private TStudentMapper studentMapper;
	@Autowired
	private TNoticeMapper noticeMapper;
	@Autowired
	private TShuidianfeiMapper shuidianfeiMapper;
	@Autowired
	private TPinfenMapper pinfenMapper;
	@Autowired
	private TWanguiMapper wanguiMapper;
	@Autowired
	private TLaifangMapper laifangMapper;
	@Autowired
	private TBaoxiuMapper baoxiuMapper;
	
	@Override
	public List<TRole> findRoleByNameAndPwd(String num, String pw,String level) {
		TRoleExample example = new TRoleExample();
		Criteria criteria = example.createCriteria();
		criteria.andNameEqualTo(num);
		criteria.andPasswordEqualTo(pw);
		criteria.andRoleEqualTo(Integer.parseInt(level));
		return roleMapper.selectByExample(example );
	}
	
	@Override
	public TRole findRoleById(Integer id) {
		
		return roleMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public void updateRoleById(TRole role2) {
		roleMapper.updateByPrimaryKeySelective(role2);
	}
	
	@Override
	public void addDorm(TDorm dorm) {
		dormMapper.insertSelective(dorm);
	}
	
	@Override
	public void addRole(TRole role) {
		roleMapper.insertSelective(role);
	}
	
	@Override
	public void addLouHao(TLouhao louHao) {
		louhaomapper.insertSelective(louHao);
	}
	
	@Override
	public TDorm findDormByLouhaoAndSushehao(String louhao, String dormNum) {
		TDormExample example = new TDormExample();
		com.ssm.pojo.TDormExample.Criteria criteria = example.createCriteria();
		criteria.andLouhaoEqualTo(louhao);
		criteria.andSushehaoEqualTo(dormNum);
		List<TDorm> dormList = dormMapper.selectByExample(example);
		if(dormList!=null&&!dormList.isEmpty()){
			return dormList.get(0);
		}
		return null;
	}
	
	@Override
	public void addStudent(TStudent student) {
		studentMapper.insertSelective(student);
	}
	
	@Override
	public void updateDormById(TDorm dorm) {
		dormMapper.updateByPrimaryKeySelective(dorm);
	}
	
	@Override
	public void addNotice(TNotice notice) {
		noticeMapper.insertSelective(notice);
	}
	
	@Override
	public List<TDorm> findAllDorm() {
		TDormExample example = new TDormExample();
		com.ssm.pojo.TDormExample.Criteria criteria = example.createCriteria();
		return dormMapper.selectByExample(example);
	}
	
	@Override
	public void delDormById(Integer id) {
		dormMapper.deleteByPrimaryKey(id);
	}
	
	@Override
	public TDorm findDormById(Integer id) {
		
		return dormMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public TRole findRoleByNameAndRoleType(String name, Integer role) {
		TRoleExample example = new TRoleExample();
		Criteria criteria = example.createCriteria();
		criteria.andNameEqualTo(name);
		criteria.andRoleEqualTo(role);
		List<TRole> roleList = roleMapper.selectByExample(example);
		if(roleList!=null&&!roleList.isEmpty()){
			return roleList.get(0);
		}
		return null;
	}
	
	@Override
	public List<TRole> findRoleByRoleType(int roleType) {
		return roleMapper.findRoleByRoleType(roleType);
	}
	
	@Override
	public List<TRole> findRoleByNameAndIdNotEqueal(TRole role) {
		TRoleExample example = new TRoleExample();
		Criteria criteria = example.createCriteria();
		criteria.andNameEqualTo(role.getName());
		criteria.andIdNotEqualTo(role.getId());
		criteria.andRoleEqualTo(role.getRole());
		return roleMapper.selectByExample(example);
	}
	
	@Override
	public void delRoleById(Integer id) {
		roleMapper.deleteByPrimaryKey(id);
	}
	
	@Override
	public void updateLouhaoById(TRole role) {
		TLouhao record = new TLouhao();
		record.setId(role.getLouhaoid());
		record.setLouhao(role.getLouhao());
		louhaomapper.updateByPrimaryKeySelective(record);
	}
	
	@Override
	public void delLouhaoById(Integer louhaoid) {
		louhaomapper.deleteByPrimaryKey(louhaoid);
	}
	
	@Override
	public Integer countLouhaoBySuguanId(Integer id) {
		TLouhaoExample example = new TLouhaoExample();
		com.ssm.pojo.TLouhaoExample.Criteria criteria = example.createCriteria();
		criteria.andSuguanidEqualTo(id);
		return louhaomapper.countByExample(example);
	}
	
	@Override
	public void delStudentByXuehao(String xuehao) {
		studentMapper.deleteByPrimaryKey(xuehao);
	}
	
	@Override
	public List<TNotice> findAllNotice() {
		
		return noticeMapper.selectByExample(null);
	}
	
	@Override
	public void delNoticeeById(Integer id) {
		noticeMapper.deleteByPrimaryKey(id);
	}
	
	@Override
	public List<TLouhao> findLouhaoBySuguanId(Integer suguanid) {
		TLouhaoExample example = new TLouhaoExample();
		com.ssm.pojo.TLouhaoExample.Criteria criteria = example.createCriteria();
		criteria.andSuguanidEqualTo(suguanid);
		return louhaomapper.selectByExample(example);
	}
	
	@Override
	public void addShuidianfei(TShuidianfei shuidianfei) {
		shuidianfeiMapper.insertSelective(shuidianfei);
	}
	
	@Override
	public void addPinfen(TPinfen pinfen) {
		pinfenMapper.insertSelective(pinfen);
	}
	
	@Override
	public void addWangui(TWangui wangui) {
		wanguiMapper.insertSelective(wangui);
	}
	
	@Override
	public void addLaifang(TLaifang laifang) {
		laifangMapper.insertSelective(laifang);
	}
	
	@Override
	public List<TShuidianfei> findShuidianfeiByLouhao(String louhao) {
		TShuidianfeiExample example = new TShuidianfeiExample();
		com.ssm.pojo.TShuidianfeiExample.Criteria criteria = example.createCriteria();
		criteria.andLouhaoEqualTo(louhao);
		return shuidianfeiMapper.selectByExample(example);
	}
	
	@Override
	public void delShuidianfei(Integer id) {
		shuidianfeiMapper.deleteByPrimaryKey(id);
	}
	
	@Override
	public void updateShuidianfei(TShuidianfei shuidianfei) {
		shuidianfeiMapper.updateByPrimaryKeySelective(shuidianfei);
	}
	
	@Override
	public List<TPinfen> findPinfenByLouhao(String louhao) {
		TPinfenExample example = new TPinfenExample();
		com.ssm.pojo.TPinfenExample.Criteria criteria = example.createCriteria();
		criteria.andLouhaoEqualTo(louhao);
		return pinfenMapper.selectByExample(example);
	}
	
	@Override
	public void delPinfen(Integer id) {
		pinfenMapper.deleteByPrimaryKey(id);
	}
	
	@Override
	public List<TWangui> findWanguiByLouhao(String louhao) {
		TWanguiExample example = new TWanguiExample();
		com.ssm.pojo.TWanguiExample.Criteria criteria = example.createCriteria();
		criteria.andLouhaoEqualTo(louhao);
		return wanguiMapper.selectByExample(example);
	}
	
	@Override
	public TStudent findStudentByXuehao(String xuehao) {
		
		return studentMapper.selectByPrimaryKey(xuehao);
	}
	
	@Override
	public void delwangui(Integer id) {
		wanguiMapper.deleteByPrimaryKey(id);
	}
	
	@Override
	public List<TLaifang> findLaifangByLouhao(String louhao) {
		TLaifangExample example = new TLaifangExample();
		com.ssm.pojo.TLaifangExample.Criteria criteria = example.createCriteria();
		criteria.andLouhaoEqualTo(louhao);
		return laifangMapper.selectByExample(example);
	}
	
	@Override
	public void dellaifang(Integer id) {
		laifangMapper.deleteByPrimaryKey(id);
	}
	
	@Override
	public List<TNotice> findNoticeByLouhao(String louhao) {
		return noticeMapper.findNoticeByLouhao(louhao);
	}
	
	@Override
	public List<TBaoxiu> findAllBaoxiu() {
		
		return baoxiuMapper.selectByExample(null);
	}
	
	@Override
	public void delBaoxiuById(Integer id) {
		baoxiuMapper.deleteByPrimaryKey(id);
	}
}
