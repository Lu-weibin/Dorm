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
		
		<style type="text/css">
			#studentForm div div{
				margin-bottom: 5px;
			}
		</style>
		
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
							<div class="col-md-10" style="margin-top: 20px;margin-left: 230px;">
									<form id="studentForm" class="form-inline">
										<div class="" style="text-align-last: center;margin-top:50px">
											<div class="form-group">
												<div class="col-lg-4">
													<label for="customerName">学号：</label>
												</div>
												<div class="col-lg-6">
													<input type="text" class="form-control" id="xuehao" name="xuehao" value="${sessionScope.student.xuehao}" readonly>
												</div>					
											</div>
											<div class="form-group">
												<div class="col-lg-4">
													<label for="customerName">姓名：</label>
												</div>
												<div class="col-lg-6">
													<input type="text" class="form-control" id="name" name="name" value="${sessionScope.student.name}">
												</div>					
											</div>
											<div class="form-group">
												<div class="col-lg-4">
													<label for="customerName">班级：</label>
												</div>
												<div class="col-lg-6">
													<input type="text" class="form-control" id="banji" name="banji" value="${sessionScope.student.banji}">
												</div>					
											</div>
											<div class="form-group">
												<div class="col-lg-4">
													<label for="customerName">电话号码：</label>
												</div>
												<div class="col-lg-6">
													<input type="text" class="form-control" id="phone" name="phone" value="${sessionScope.student.phone}">
												</div>					
											</div>
											<div class="form-group">
												<div class="col-lg-4">
													<label for="customerName">性别：</label>
												</div>
												<div class="col-lg-6">
													<input type="radio" class="form-control" id="sex" name="sex" value="男" 
													<c:if test="${sessionScope.student.sex=='男'}">checked</c:if> >
														男
													</input>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
													<input type="radio" class="form-control" id="sex" name="sex" value="女" <c:if test="${sessionScope.student.sex=='女'}">checked</c:if>  >女</input>
												</div>					
											</div>
											
											<button type="button" class="btn btn-primary text-right" style="margin-left:48px" onclick="addstudent()">修改</button>
										</div>
										
										
									</form>
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
			function addstudent(){
				$.post("updatestudent",$('#studentForm').serialize(),function(data){
					if(data=="ok"){
						alert("操作成功！");
					}
				});
			}
		</script>
	</body>

</html>