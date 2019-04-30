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
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
		<meta http-equiv="X-UA-Compatible" content="ie=edge">
		<title>宿舍管理系统</title>
		<link rel="stylesheet" href="./vendor/simple-line-icons/css/simple-line-icons.css">
		<link rel="stylesheet" href="./vendor/font-awesome/css/fontawesome-all.min.css">
		<link rel="stylesheet" href="./css/styles.css">
	</head>

	<body class="sidebar-fixed header-fixed">
		<div class="page-wrapper">
			<!-- 静态包含 -->
			<%@include file="stutop.jsp" %>

			<div class="main-container">
				<!-- 静态包含 -->
				<%@include file="stuleft.jsp" %>

				<div class="content">
					<div class="container-fluid">

						<div class="row ">
							<div class="col-md-12" style="margin-top: 50px;margin-left: 220px;">
								<div class="text-center" style="">
									<form id="pwdForm">
										<div class="col-lg-4" style="text-align-last: center">
											<div class="form-group">
												<label for="customerName">原密码：</label>
												<input type="text" class="form-control" id="oldpwd" name="oldpwd">
											</div>
											<div class="form-group">
												<label for="customerName">新密码：</label>
												<input type="text" class="form-control" id="pwd" name="pwd">
											</div>
											<div class="form-group">
												<label for="name">确认新密码：</label>
												<input type="text" class="form-control" id="repwd" name="repwd">
											</div>
											
											<button type="button" class="btn btn-primary text-right" style="" onclick="changepwd()">修改</button>
										</div>
									</form>
								</div>
							</div>
						</div>
					</div>

				</div>
			</div>
		</div>
		<script src="./vendor/jquery/jquery.min.js"></script>
		<script src="./vendor/popper.js/popper.min.js"></script>
		<script src="./vendor/bootstrap/js/bootstrap.min.js"></script>
		<script src="./vendor/chart.js/chart.min.js"></script>
		<script src="./js/carbon.js"></script>
		<script src="./js/demo.js"></script>
		<script type="text/javascript">
			function changepwd(){
				if($('#pwd').val()!=$('#repwd').val()){
					alert("两次输入的密码不一致");
					return;
				}
				
				$.post("changepwd",$('#pwdForm').serialize(),function(data){
					if("error"==data){
						alert("用户未登录 ！");
						return;
					}
					alert(data);
				});
			}
		</script>
	</body>

</html>