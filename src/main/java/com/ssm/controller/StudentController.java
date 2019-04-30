package com.ssm.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssm.pojo.Result;
import com.ssm.pojo.TBaoxiu;
import com.ssm.pojo.TRole;
import com.ssm.pojo.TStudent;
import com.ssm.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private HttpServletRequest request;
	@Autowired
	private StudentService studentService;
	
	//添加报修信息
	@RequestMapping("addbaoxiu")
	public String addbaoxiu(String description){
		TStudent student = (TStudent) request.getSession().getAttribute("student");
		if(student==null){
			return "学生未登录";
		}
		TBaoxiu baoxiu = new TBaoxiu();
		baoxiu.setDescription(description);
		baoxiu.setBtime(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date()));
		baoxiu.setDormNum(student.getLouhao()+" "+student.getDormNum());
		studentService.addBaoxiu(baoxiu);
		return "报修成功";
	}
	
	//更新报修信息
	//学生自行处理的从页面传 flag=-1
	@RequestMapping("updatebaoxiu")
	public Map updatebaoxiuBystu(Integer id,Integer flag){
		Map<String, String> map = new HashMap<>();
		TBaoxiu baoxiu = new TBaoxiu();
		if(flag==null){
			TRole role = (TRole) request.getSession().getAttribute("role");
			if(role==null){
				map.put("error", "未登录");
				return map;
			}
			map.put("repairName", role.getName());
			baoxiu.setRepairId(role.getId());
		}else{
			baoxiu.setRepairId(flag);
		}
		String ctime = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date());
		baoxiu.setCtime(ctime);
		baoxiu.setId(id);
		baoxiu.setState(1);
		studentService.updateBaoxieById(baoxiu);
		map.put("ctime", ctime);
		return map;
	}
	
	@RequestMapping("updatestudent")
	public String updatestudent(TStudent student){
		studentService.updateStudentByXueHao(student);
		return "ok";
		
	}
}
