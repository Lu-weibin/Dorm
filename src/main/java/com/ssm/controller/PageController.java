package com.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
import com.ssm.service.RoleService;
import com.ssm.service.StudentService;

@Controller
public class PageController {
	@Autowired
	private HttpServletRequest request;
	@Autowired
	private StudentService studentService;
	@Autowired
	private RoleService roleService;
	
	
	//跳转到登录页面
	@RequestMapping("tologin")
	public String tologin(){
		return "login";
	}
	
	//管理员登录成功跳转到管理员首页
	@RequestMapping("adminindex")
	public String adminindex(){
		return "adminindex";
	}
	
	//宿管登录成功跳转到宿管首页
	@RequestMapping("suguanindex")
	public String suguanindex(){
		return "suguanindex";
	}
	
	//维修员登录成功跳转到维修员首页
	@RequestMapping("repairindex")
	public String repairindex(){
		return "repairindex";
	}
	
	//学生登录成功跳转到学生首页
	@RequestMapping("stuindex")
	public String stuindex(){
		return "stuindex";
	}
	
	//跳转到管理员发布公告页面
	@RequestMapping("toaddadminnotice")
	public String toadminaddnotice(){
		return "addadminnotice";
	}
	
	//登录
	@RequestMapping("login")
	public String login(String num,String pw,String level,RedirectAttributes redirectAttributes){
		if(!"3".equals(level)){
			//不是学生进行登录
			List<TRole> roleList = roleService.findRoleByNameAndPwd(num,pw,level);
			if(roleList!=null&&!roleList.isEmpty()){
				roleList.get(0).setPassword(null);
				request.getSession().setAttribute("role", roleList.get(0));
				switch (level) {
				case "0":
					return "redirect:adminindex";
				case "1":
					return "redirect:suguanindex";
				case "2":
					return "redirect:repairindex";
				default:
					return "redirect:tologin";
				}
			}else{
				redirectAttributes.addFlashAttribute("error", "账号或密码错误");
				return "redirect:tologin";
			}
		}else{
			//学生登录
			List<TStudent> studentList = studentService.findStudentByNameAndPwd(num,pw);
			if(studentList!=null&&!studentList.isEmpty()){
				request.getSession().setAttribute("student", studentList.get(0));
				return "redirect:stuindex";
			}else{
				redirectAttributes.addFlashAttribute("error", "账号或密码错误");
				return "redirect:tologin";
			}
		}
	}
	
	//跳转到修改密码页面
	@RequestMapping("toadminchangepwd")
	public String toadminchangpwd(){
		return "adminchangepwd";
	}
	
	//跳转到添加宿舍页面
	@RequestMapping("toaddsushe")
	public String toaddsushe(){
		return "addsushe";
	}
	
	//跳转到添加宿管页面
	@RequestMapping("toaddsuguan")
	public String toaddsuguan(){
		return "addsuguan";
	}
	
	//跳转到添加学生页面
	@RequestMapping("toaddstu")
	public String toaddstu(){
		return "addstudent";
	}
	
	//跳转到更新宿舍页面
	@RequestMapping("toupdatesushe")
	public String toupdatesushe(Model model){
		
		List<TDorm> dormList = roleService.findAllDorm();
		model.addAttribute("dormList", dormList);
		return "updatesushe";
	}
	
	//跳转到更新宿管页面
	@RequestMapping("toupdatesuguan")
	public String toupdatesuguan(Model model){
		List<TRole> suguanList = roleService.findRoleByRoleType(1);
		model.addAttribute("suguanList", suguanList);
		return "updatesuguan";
	}
	
	//跳转到更新学生页面
	@RequestMapping("toupdatestu")
	public String toupdatestu(Model model){
		List<TStudent> studentList = studentService.findAllStudent();
		model.addAttribute("studentList", studentList);
		return "updatestudent";
	}
	
	//跳转到更新公告页面
	@RequestMapping("toupdatenotice")
	public String toupdatenotice(Model model){
		List<TNotice> noticeList = roleService.findAllNotice();
		if(noticeList!=null&&!noticeList.isEmpty()){
			for (TNotice tNotice : noticeList) {
				Integer roleId = tNotice.getRoleId();//发布公告的角色id
				TRole role = roleService.findRoleById(roleId);
				tNotice.setRoleName(role.getName());
				switch (role.getRole()) {
				case 0:
					tNotice.setRole("管理员");
					break;
				case 1:
					tNotice.setRole("宿管");
					break;
				default:
					break;
				}
			}
		}
		model.addAttribute("noticeList", noticeList);
		return "updatenotice";
	}
	
	//跳转到修改个人信息页面
	@RequestMapping("toadminchangeinfo")
	public String toadminchangeinfo(){
		
		return "adminchangeinfo";
	}
	
	//跳转到录入水电费页面
	@RequestMapping("toaddshuidianfei")
	public String toaddshuidianfei(){
		
		return "addshuidianfei";
	}
	
	//跳转到管理水电费页面
	@RequestMapping("toupdateshuidianfei")
	public String toupdateshuidianfei(Model model){
		TRole role = (TRole) request.getSession().getAttribute("role");
		if(role==null){
			return "用户未登录";
		}
		List<TLouhao> louhaoList = roleService.findLouhaoBySuguanId(role.getId());
		TLouhao louhao = louhaoList.get(0);//宿管管理的楼栋
		List<TShuidianfei> shuidianfeiList = roleService.findShuidianfeiByLouhao(louhao.getLouhao());
		for (TShuidianfei tShuidianfei : shuidianfeiList) {
			Integer id = tShuidianfei.getDormNum();
			TDorm dorm = roleService.findDormById(id);
			tShuidianfei.setLouhao(dorm.getLouhao()+" "+dorm.getSushehao());
		}
		model.addAttribute("shuidianfeiList", shuidianfeiList);
		return "updateshuidianfei";
	}
	
	//跳转到宿舍评分页面
	@RequestMapping("toaddpinfen")
	public String topinfen(){
		
		return "addpinfen";
	}
	
	//跳转到管理评分页面
	@RequestMapping("toupdatepinfen")
	public String toupdatepinfen(Model model){
		TRole role = (TRole) request.getSession().getAttribute("role");
		if(role==null){
			return "用户未登录";
		}
		List<TLouhao> louhaoList = roleService.findLouhaoBySuguanId(role.getId());
		TLouhao louhao = louhaoList.get(0);//宿管管理的楼栋
		List<TPinfen> pinfenList = roleService.findPinfenByLouhao(louhao.getLouhao());
		for (TPinfen pinfen : pinfenList) {
			String id = pinfen.getDormNum();
			TDorm dorm = roleService.findDormById(Integer.parseInt(id));
			pinfen.setLouhao(dorm.getLouhao()+" "+dorm.getSushehao());
		}
		model.addAttribute("pinfenList", pinfenList);
		return "updatepinfen";
	}
	
	//跳转到晚归页面
	@RequestMapping("toaddwangui")
	public String toaddwangui(){
		
		return "addwangui";
	}
	
	//跳转到管理晚归页面
	@RequestMapping("toupdatewangui")
	public String toupdatewangui(Model model){
		TRole role = (TRole) request.getSession().getAttribute("role");
		if(role==null){
			return "用户未登录";
		}
		List<TLouhao> louhaoList = roleService.findLouhaoBySuguanId(role.getId());
		TLouhao louhao = louhaoList.get(0);//宿管管理的楼栋
		List<TWangui> wanguiList = roleService.findWanguiByLouhao(louhao.getLouhao());
		for (TWangui wangui : wanguiList) {
			String xuehao = wangui.getXuehao();
			TStudent student = roleService.findStudentByXuehao(xuehao);
			wangui.setLouhao(student.getLouhao()+" "+student.getDormNum());
		}
		model.addAttribute("wanguiList", wanguiList);
		return "updatewangui";
	}
	
	//跳转到来访记录页面
	@RequestMapping("toaddlaifang")
	public String toaddlaifang(){
		
		return "addlaifang";
	}
	
	//跳转到管理来访记录页面
	@RequestMapping("toupdatelaifang")
	public String toupdatelaifang(Model model){
		TRole role = (TRole) request.getSession().getAttribute("role");
		if(role==null){
			return "用户未登录";
		}
		List<TLouhao> louhaoList = roleService.findLouhaoBySuguanId(role.getId());
		TLouhao louhao = louhaoList.get(0);//宿管管理的楼栋
		List<TLaifang> laifangList = roleService.findLaifangByLouhao(louhao.getLouhao());
		for (TLaifang laifang : laifangList) {
			String xuehao = laifang.getXuehao();
			TStudent student = roleService.findStudentByXuehao(xuehao);
			laifang.setLouhao(student.getLouhao()+" "+student.getDormNum());
		}
		model.addAttribute("laifangList", laifangList);
		return "updatelaifang";
	}
	
	//跳转到添加宿舍公告页面
	@RequestMapping("toaddsushenotice")
	public String toaddsushenotice(){
		
		return "addsushenotice";
	}
	
	//跳转到管理宿舍公告页面
	@RequestMapping("toupdatesushenotice")
	public String toupdatesushenotice(Model model){
		TRole role = (TRole) request.getSession().getAttribute("role");
		if(role==null){
			return "用户未登录";
		}
		List<TLouhao> louhaoList = roleService.findLouhaoBySuguanId(role.getId());
		TLouhao louhao = louhaoList.get(0);//宿管管理的楼栋
		List<TNotice> noticeList = roleService.findNoticeByLouhao(louhao.getLouhao());
		if(noticeList!=null&&!noticeList.isEmpty()){
			for (TNotice tNotice : noticeList) {
				Integer roleId = tNotice.getRoleId();//发布公告的角色id
				TRole role2 = roleService.findRoleById(roleId);
				tNotice.setRoleName(role2.getName());
				switch (role2.getRole()) {
				case 0:
					tNotice.setRole("管理员");
					break;
				case 1:
					tNotice.setRole("宿管");
					break;
				default:
					break;
				}
				}
		}
		model.addAttribute("noticeList", noticeList);
		return "updatesushenotice";
	}
	
	//跳转到学生查看公告页面
	@RequestMapping("tofindnotice")
	public String tofindnotice(Model model){
		TStudent student = (TStudent) request.getSession().getAttribute("student");
		if(student==null){
			return "用户未登录";
		}
		List<TNotice> noticeList = roleService.findNoticeByLouhao(student.getLouhao());
		if(noticeList!=null&&!noticeList.isEmpty()){
			for (TNotice tNotice : noticeList) {
				Integer roleId = tNotice.getRoleId();//发布公告的角色id
				TRole role2 = roleService.findRoleById(roleId);
				tNotice.setRoleName(role2.getName());
				switch (role2.getRole()) {
				case 0:
					tNotice.setRole("管理员");
					break;
				case 1:
					tNotice.setRole("宿管");
					break;
				default:
					break;
				}
				}
		}
		model.addAttribute("noticeList", noticeList);
		return "findnotice";
	}
	
	//跳转到学生查看水电费页面
	@RequestMapping("tofindshuidianfei")
	public String tofindshuidianfei(Model model){
		TStudent student = (TStudent) request.getSession().getAttribute("student");
		if(student==null){
			return "用户未登录";
		}
		TDorm dorm = roleService.findDormByLouhaoAndSushehao(student.getLouhao(), student.getDormNum());
		List<TShuidianfei> shuidianfeiList = studentService.findShuidianfeiBySusheId(dorm.getId());
		for (TShuidianfei tShuidianfei : shuidianfeiList) {
			tShuidianfei.setLouhao(student.getLouhao()+" "+student.getDormNum());
		}
		model.addAttribute("shuidianfeiList", shuidianfeiList);
		return "findshuidianfei";
	}
	
	//跳转到学生查看宿舍评分页面
	@RequestMapping("tofindpinfen")
	public String tofindpinfen(Model model){
		TStudent student = (TStudent) request.getSession().getAttribute("student");
		if(student==null){
			return "用户未登录";
		}
		List<TPinfen> pinfenList = roleService.findPinfenByLouhao(student.getLouhao());
		for (TPinfen pinfen : pinfenList) {
			String id = pinfen.getDormNum();
			TDorm dorm = roleService.findDormById(Integer.parseInt(id));
			pinfen.setLouhao(dorm.getLouhao()+" "+dorm.getSushehao());
		}
		model.addAttribute("pinfenList", pinfenList);
		return "findpinfen";
	}
	
	//跳转学生查看来访记录页面
	@RequestMapping("tofindlaifang")
	public String tofindlaifang(Model model){
		TStudent student = (TStudent) request.getSession().getAttribute("student");
		if(student==null){
			return "用户未登录";
		}
		List<TLaifang> laifangList = studentService.findLaifangByXuehao(student.getXuehao());
		model.addAttribute("laifangList", laifangList);
		return "findlaifang";
	}
	
	//跳转到管理晚归页面
	@RequestMapping("tofindwangui")
	public String tofindwangui(Model model){
		TStudent student = (TStudent) request.getSession().getAttribute("student");
		if(student==null){
			return "用户未登录";
		}
		List<TWangui> wanguiList = studentService.findWanguiByXuehao(student.getXuehao());
		model.addAttribute("wanguiList", wanguiList);
		return "findwangui";
	}
	
	//跳转到学生添加报修信息页面
	@RequestMapping("toaddbaoxiu")
	public String tobaoxiu(){
		
		return "addbaoxiu";
	}
	
	//跳转到学生查看报修情况页面
	@RequestMapping("toupdatebaoxiu")
	public String toupdatebaoxiu(Model model){
		TStudent student = (TStudent) request.getSession().getAttribute("student");
		if(student==null){
			return "学生未登录！";
		}
		List<TBaoxiu> baoxiuList = studentService.findBaoxiuByDorm(student.getLouhao()+" "+student.getDormNum());
		for (TBaoxiu tBaoxiu : baoxiuList) {
			if(tBaoxiu.getRepairId()!=null){
				if(tBaoxiu.getRepairId()!=-1){
					Integer repairId = tBaoxiu.getRepairId();
					TRole role = roleService.findRoleById(repairId);
					tBaoxiu.setRepairName(role.getName()+" (维修员)");
				}else{
					tBaoxiu.setRepairName("学生自已");
				}
			}
			
		}
		model.addAttribute("baoxiuList", baoxiuList);
		return "updatebaoxiu";
	}
	
	//跳转到维修员查看报修页面
	@RequestMapping("torepairupdatebaoxiu")
	public String torepairupdatebaoxiu(Model model){
		List<TBaoxiu> baoxiuList = roleService.findAllBaoxiu();
		for (TBaoxiu tBaoxiu : baoxiuList) {
			if(tBaoxiu.getRepairId()!=null){
				if(tBaoxiu.getRepairId()!=-1){
					Integer repairId = tBaoxiu.getRepairId();
					TRole role = roleService.findRoleById(repairId);
					tBaoxiu.setRepairName(role.getName()+" (维修员)");
				}else{
					tBaoxiu.setRepairName("学生自已");
				}
			}
			
		}
		model.addAttribute("baoxiuList", baoxiuList);
		return "repairupdatebaoxiu";
	}
	
	//管理员，宿管，维修员退出登录
	@RequestMapping("rolequit")
	public String rolequit(){
		request.getSession().setAttribute("role",null);
		return "redirect:tologin";
	}
	
	//学生退出登录
	@RequestMapping("stuquit")
	public String stuquit(){
		request.getSession().setAttribute("student",null);
		return "redirect:tologin";
	}
	
	//跳转到维修员更改密码页面
	@RequestMapping("torepairchangepwd")
	public String torepairchangepwd(){
		return "repairchangepwd";
	}
	
	//跳转到维修员更改密码页面
	@RequestMapping("torepairchangeinfo")
	public String torepairchangeinfo(){
		return "repairchangeinfo";
	}
	
	//跳转到宿管修改个人信息页面
	@RequestMapping("tosuguanchangeinfo")
	public String tosuguanchangeinfo(){
		
		return "suguanchangeinfo";
	}
	
	//跳转到宿管修改密码页面
	@RequestMapping("tosuguanchangepwd")
	public String tosuguanchangepwd(){
		
		return "suguanchangepwd";
	}
	
	//跳转到学生修改密码页面
	@RequestMapping("tostuchangepwd")
	public String tostuchangepwd(){
		
		return "stuchangepwd";
	}
	
	//跳转到学生修改信息页面
	@RequestMapping("tostuchangeinfo")
	public String tostuchangeinfo(){
		return "stuchangeinfo";
	}
	
}
