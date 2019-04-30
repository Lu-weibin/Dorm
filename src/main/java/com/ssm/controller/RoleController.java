package com.ssm.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.jni.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssm.pojo.TDorm;
import com.ssm.pojo.TLaifang;
import com.ssm.pojo.TLouhao;
import com.ssm.pojo.TNotice;
import com.ssm.pojo.TPinfen;
import com.ssm.pojo.TRole;
import com.ssm.pojo.TShuidianfei;
import com.ssm.pojo.TStudent;
import com.ssm.pojo.TWangui;
import com.ssm.service.RoleService;
import com.ssm.service.StudentService;

@RestController
public class RoleController {
	@Autowired
	private HttpServletRequest request;
	@Autowired
	private RoleService roleService;
	@Autowired
	private StudentService studentService;
	
	//管理员添加宿舍
	@RequestMapping("addsushe")
	public String addsushe(TDorm dorm){
		TDorm dorm2 = roleService.findDormByLouhaoAndSushehao(dorm.getLouhao(),dorm.getSushehao());
		if(dorm2!=null){
			return "宿舍已存在，请不要重复添加！";
		}
		//页面管理员没有填写宿舍容量，默认为4
		if("".equals(dorm.getRongliang())){
			dorm.setRongliang("4");
		}
		roleService.addDorm(dorm);
		return "添加宿舍成功！";
	}
	
	//管理员添加宿管
	@RequestMapping("addsuguan")
	public String addsuguan(TRole role,String louhao){
		TRole role2 = roleService.findRoleByNameAndRoleType(role.getName(),1);
		if(role2!=null){			return "宿管信息已存在，请不要重复添加！";
		}
		//角色表中1表示为 宿管
		role.setRole(1);
		if("".equals(role.getPassword().trim())){
			role.setPassword("0000");
		}
		roleService.addRole(role);
		//System.out.println(role.getId());
		//将宿管与楼号关联
		TLouhao louHao = new TLouhao();
		louHao.setLouhao(louhao);
		louHao.setSuguanid(role.getId());
		roleService.addLouHao(louHao);
		return "添加宿管成功！";
	}
	
	//管理员添加学生
	@RequestMapping("addstudent")
	public String addstudent(TStudent student){
		TDorm dorm = roleService.findDormByLouhaoAndSushehao(student.getLouhao(),student.getDormNum());
		if(dorm!=null){
			String rongliang = dorm.getRongliang();
			String dangqianrenshu = dorm.getDangqianrenshu();
			if(Integer.parseInt(rongliang)-Integer.parseInt(dangqianrenshu)>0){
				//密码默认为学号，学生可登录后自行更改
				student.setPassword(student.getXuehao());
				try{
					roleService.addStudent(student);
				}catch(DuplicateKeyException e){
					//e.printStackTrace();
					return "添加失败！请核实学生信息";
				}
				dorm.setDangqianrenshu(Integer.parseInt(dangqianrenshu)+1+"");
				roleService.updateDormById(dorm);
			}else{
				return "当前宿舍人数已住满";
			}
		}else{
			return "查询不到宿舍号，请核实后再添加！";
		}
		return "添加学生成功！";
	}
	
	//管理员,宿管 添加公告
	@RequestMapping("addadminnotice")
	public String addadminnotice(TNotice notice){
		notice.setRoleId(1);
		notice.setTime(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date()));
		roleService.addNotice(notice);
		return "添加公告成功！";
	}
	
	//修改密码
	@RequestMapping("changepwd")
	public String changepwd(String oldpwd,String pwd){
		TStudent student = (TStudent) request.getSession().getAttribute("student");
		if(student!=null){
			TStudent stu = studentService.findStudentByXueHao(student.getXuehao());
			if(stu.getPassword().equals(oldpwd)){
				stu.setPassword(pwd);
				studentService.updateStudentByXueHao(stu);
			}else{
				return "原密码错误！";
			}
		}else{
			TRole role = (TRole) request.getSession().getAttribute("role");
			if(role==null){
				return "error";
			}
			TRole role2 = roleService.findRoleById(role.getId());
			if(role2.getPassword().equals(oldpwd)){
				role2.setPassword(pwd);
				roleService.updateRoleById(role2);
			}else{
				return "原密码错误！";
			}
		}
		return "密码修改成功！";
	}
	
	//管理员更新宿舍信息
	@RequestMapping("updatedorm")
	public String updatedorm(TDorm dorm){
		System.out.println(dorm);
		roleService.updateDormById(dorm);
		return "更新宿舍信息成功！";
	}
	
	//删除宿舍
	@RequestMapping("delDorm")
	public String delDorm(Integer id){
		TDorm dorm = roleService.findDormById(id);
		if(Integer.parseInt(dorm.getDangqianrenshu())>0){
			return "当前宿舍已安排学生，不允许删除！";
		}else{
			roleService.delDormById(id);
		}
		return "ok";
	}
	
	//管理员修改宿管信息
	@RequestMapping("updatesuguan")
	public String updatesuguan(TRole role){
		System.out.println(role);
		role.setRole(1);
		List<TRole> roleList = roleService.findRoleByNameAndIdNotEqueal(role);
		if(roleList!=null&!roleList.isEmpty()){
			return "宿管名已存在！";
		}else{
			roleService.updateRoleById(role);
			roleService.updateLouhaoById(role);
		}
		return "更新宿管信息成功！";
	}
	
	//删除宿管信息
	@RequestMapping("delsuguan")
	public String delsuguan(Integer id,Integer louhaoid){
		//一个宿管可能同时管理不同楼栋，只有宿管管理的楼栋为0时才删除宿管信息
		//删除管理管理的楼栋信息
		roleService.delLouhaoById(louhaoid);
		Integer rows = roleService.countLouhaoBySuguanId(id);
		if(rows == 0){
			roleService.delRoleById(id);
		}
		return "ok";
	}
	
	//删除学生信息
	@RequestMapping("delstu")
	public String delstu(String xuehao,String louhao,String dormNum){
		try{
			roleService.delStudentByXuehao(xuehao);
			//删除学生 要减少该生所在宿舍人数
			TDorm dorm = roleService.findDormByLouhaoAndSushehao(louhao, dormNum);
			if(Integer.parseInt(dorm.getDangqianrenshu())<=0){//宿舍当前人数小于等于0
				return "删除学生失败！";
			}
			dorm.setDangqianrenshu(Integer.parseInt(dorm.getDangqianrenshu())-1+"");
			roleService.updateDormById(dorm);
		}catch(Exception e){
			return "删除学生失败！";
		}
		return "ok";
	}
	
	//删除公告
	@RequestMapping("delnotice")
	public String delnotice(Integer id){
		roleService.delNoticeeById(id);
		return "ok";
	}
	
	//管理员、宿管、维修员修改个人信息
	@RequestMapping("updatemyinfo")
	public String updatemyinfo(TRole role){
		if(role.getId()==null){
			return "error";
		}
		List<TRole> roleList = roleService.findRoleByNameAndIdNotEqueal(role);
		if(roleList!=null&&!roleList.isEmpty()){
			return "修改失败，用户名已存在！";
		}
		roleService.updateRoleById(role);
		request.getSession().setAttribute("role", role);
		return "ok";
	}
	
	//添加水电费
	@RequestMapping("addshuidianfei")
	public String addshuidianfei(TShuidianfei shuidianfei,Integer suguanid,String sushehao){
		if(suguanid==null){
			return "录入失败，请核实信息！";
		}
		//获取该宿管管理的楼号
		List<TLouhao> louhaoList = roleService.findLouhaoBySuguanId(suguanid);
		if(louhaoList==null||louhaoList.isEmpty()){
			return "录入失败，请核实信息！";
		}
		TLouhao louhao = louhaoList.get(0);
		TDorm dorm = roleService.findDormByLouhaoAndSushehao(louhao.getLouhao(), sushehao);
		if(dorm==null){
			return "输入的宿舍号不存在！";
		}
		shuidianfei.setDormNum(dorm.getId());
		shuidianfei.setLouhao(louhao.getLouhao());
		roleService.addShuidianfei(shuidianfei);
		return "ok";
	}
	
	//添加宿舍评分
	@RequestMapping("addpinfen")
	public String addpinfen(TPinfen pinfen,Integer suguanid,String sushehao){
		if(suguanid==null){
			return "录入失败，请核实信息！";
		}
		//获取该宿管管理的楼号
		List<TLouhao> louhaoList = roleService.findLouhaoBySuguanId(suguanid);
		if(louhaoList==null||louhaoList.isEmpty()){
			return "录入失败，请核实信息！";
		}
		TLouhao louhao = louhaoList.get(0);
		TDorm dorm = roleService.findDormByLouhaoAndSushehao(louhao.getLouhao(), sushehao);
		if(dorm==null){
			return "输入的宿舍号不存在！";
		}
		pinfen.setDormNum(dorm.getId()+"");
		pinfen.setLouhao(louhao.getLouhao());
		roleService.addPinfen(pinfen);
		return "ok";
	}
	
	//添加晚归记录
	@RequestMapping("addwangui")
	public String addwangui(TWangui wangui,Integer suguanid){
		System.out.println(wangui);
		//获取该宿管管理的楼号
		List<TLouhao> louhaoList = roleService.findLouhaoBySuguanId(suguanid);
		if(louhaoList==null||louhaoList.isEmpty()){
			return "录入失败，请核实信息！";
		}
		TLouhao louhao = louhaoList.get(0);
		wangui.setLouhao(louhao.getLouhao());
		try{
			roleService.addWangui(wangui);
		}catch(Exception e){
			return "录入失败，请核实信息！";
		}
		return "ok";
	}
	
	//添加来访记录
	@RequestMapping("addlaifang")
	public String addlaifang(TLaifang laifang,Integer suguanid){
		TStudent student = roleService.findStudentByXuehao(laifang.getXuehao());
		if(student==null){
			return "被访问者学号信息不存在！请核实！";
		}
		//获取该宿管管理的楼号
		List<TLouhao> louhaoList = roleService.findLouhaoBySuguanId(suguanid);
		if(louhaoList==null||louhaoList.isEmpty()){
			return "录入失败，请核实信息！";
		}
		TLouhao louhao = louhaoList.get(0);
		laifang.setLouhao(louhao.getLouhao());
		try{
			roleService.addLaifang(laifang);
		}catch(Exception e){
			return "录入失败，请核实信息！";
		}
		return "ok";
	}
	
	//添加宿舍公告
	@RequestMapping("addsushenotice")
	public String addsushenotice(TNotice notice,Integer suguanid){
		System.out.println(notice);
		//获取该宿管管理的楼号
		List<TLouhao> louhaoList = roleService.findLouhaoBySuguanId(suguanid);
		if(louhaoList==null||louhaoList.isEmpty()){
			return "录入失败，请核实信息！";
		}
		TLouhao louhao = louhaoList.get(0);
		notice.setLouhao(louhao.getLouhao());
		notice.setRoleId(suguanid);
		notice.setTime(new SimpleDateFormat("yyyy:MM:dd HH:mm").format(new Date()));
		try{
			roleService.addNotice(notice);
		}catch(Exception e){
			return "录入失败，请核实信息！";
		}
		return "ok";
	}
	
	//删除水电费记录
	@RequestMapping("delshuidianfei")
	public String delshuidianfei(Integer id){
		roleService.delShuidianfei(id);
		return "ok";
	}
	
	//更新水电费信息
	@RequestMapping("updateshuidianfei")
	public String updateshuidianfei(TShuidianfei shuidianfei){
		shuidianfei.setState(1);
		roleService.updateShuidianfei(shuidianfei);
		return "ok";
	}
	
	//删除水电费记录
	@RequestMapping("delpinfen")
	public String delpinfen(Integer id){
		roleService.delPinfen(id);
		return "ok";
	}
	
	//删除晚归记录
	@RequestMapping("delwangui")
	public String delwangui(Integer id){
		roleService.delwangui(id);
		return "ok";
	}
	
	//删除来访记录
	@RequestMapping("dellaifang")
	public String dellaifang(Integer id){
		roleService.dellaifang(id);
		return "ok";
	}
	
	//删除报修信息
	@RequestMapping("delbaoxiu")
	public String delbaoxiu(Integer id){
		roleService.delBaoxiuById(id);
		return "ok";
	}
	
}
