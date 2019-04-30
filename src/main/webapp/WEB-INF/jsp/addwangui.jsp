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
			<%@include file="roletop.jsp" %>

			<div class="main-container">
				<!-- 静态包含 -->
				<%@include file="suguanleft.jsp" %>

				<div class="content">
					<div class="container-fluid">

						<div class="row ">
							<div class="col-md-12" style="margin-top: 50px;margin-left: 220px;">
								<div class="text-center" style="">
									<form id="wanguiForm">
										<input type="hidden" value="${sessionScope.role.id}" name="suguanid"/>
										<div class="col-lg-4" style="text-align-last: center">
											<div class="form-group">
												<label for="customerName">学号：</label>
												<input type="text" class="form-control" id="xuehao" name="xuehao">
											</div>
											<div class="form-group">
												<label for="name">姓名：</label>
												<input type="text" class="form-control" id="name" name="name">
											</div>
											<div class="form-group">
												<label for="name">时间：</label>
												<input type="text" class="form-control" id="time" name="time">
											</div>
											<div class="form-group">
												<label for="name">晚归事由：</label>
												<input type="text" class="form-control" id="matter" name="matter">
											</div>
											<button type="button" class="btn btn-primary text-right" style="" onclick="addwangui()">录入</button>
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
			function addwangui(){
				$.post("addwangui",$('#wanguiForm').serialize(),function(data){
					if(data=="ok"){
						alert("录入成功！");
						return;
					}
					alert(data);
				});
				
			}
		</script>
	</body>

</html>