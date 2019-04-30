<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<link href="<%=basePath%>css/login.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="<%=basePath%>js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.validate.js"></script>
<script type="text/javascript">
	    	function check(){
	    		if($("#num").val() == ""){
					alert("请输入用户名");
					return false;
				}else if($("#pw").val() == ""){
					alert("请输入用户密码");
					return false;
				}else if($("#level").val() == ""){
					alert("请选择身份信息");
					return false;
				}
	    	}
</script>
</head>
<body>

<div id="loginbox">
	<div id="contain" class="radius">
		<div class="left"></div>
		<div class="right radius">
		     <form  method="post" action="login" onsubmit="return check()">
				<h3>佛大宿舍管理系统</h3>
				<br>
				<label for="num">用户名</label>
				<input type="text" name="num" id="num" />
				<p class="clear"></p>
				<label for="pw">密码</label>
				<input type="password" name="pw" id="pw" />
                <p class="clear"></p>
                <label for="level">身份</label>
				<select name="level" id="level">
					<option  value="">请选择角色</option>
                    <option  value="0">系统管理员</option>
                    <option  value="1">宿管</option>
                    <option  value="2">维修员</option>
                    <option  value="3">学生</option>
				</select> 
                <p class="clear"></p>
                <div style="color:red;">
                	${error}
                </div>	
				<div>
					<input type="submit" value="登录" id="login"/>
                    <input type="reset" value="重置" id="reset" />
				    <p class="clear"></p>
				</div>
			</form> 
		</div>
	</div>
    <div id="foot">
        <div id="footer_text1"><p>佛山科学技术学院&nbsp;版权所有&nbsp;2019</p></div>
        <div id="footer_text2"><p>Version&nbsp;1.0&nbsp;&nbsp;</p></div>
    </div>
</div>
</body>
</html>