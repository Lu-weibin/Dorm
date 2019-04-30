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
				<%@include file="repairleft.jsp" %>

				<div class="content">
					<div class="container-fluid">

						<div class="row ">
							<div class="col-md-12" style="margin-top: 10px;">
								<div class="text-center" style="">
									
									<table class="table table-bordered table-striped ">
									<thead >
										<tr class="text-center">
											<th>宿舍</th>
											<th>报修描述</th>
											<th>报修时间</th>
											<th>处理时间</th>
											<th>处理人</th>
											<th>状态</th>
											<th>操作</th>
										</tr>
									</thead>
									<tbody class="text-center">
										<c:forEach items="${baoxiuList}" var="item" varStatus="status">
											<tr id="tohid${item.id}">
												<td>${item.dormNum}</td>
												<td>${item.description}</td>
												<td>${item.btime}</td>
												<td id="ctime${item.id}">${item.ctime}</td>
												<td id="chuliren${item.id}">${item.repairName}</td>
												<td id="state${item.id}">
													<c:if test="${item.state==0}">
														未解决
													</c:if>
													<c:if test="${item.state==1}">
														已解决
													</c:if>
												</td>
												<td class="td" width="20%" id="caozuo${item.id}">
													<c:if test="${item.state==0}">
														<a href="#" class="btn btn-primary btn-xs" id="tobtnhid${item.id}" onclick="edit('${item.id}')">已解决</a>
													</c:if>
														<a href="#" class="btn btn-primary btn-xs" onclick="del('${item.id}')">删除</a>
												</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
									
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
			function edit(id){
				$.post("updatebaoxiu",{"id":id},function(data){
					$('#state'+id).html("已解决");
					$('#chuliren'+id).html(data.repairName+'(维修员)');
					$('#ctime'+id).html(data.ctime);
					$('#tobtnhid'+id).css('display','none');
				});
			}
			
			function del(id){
				var re = confirm("确定删除报修信息");
				if(re==false){
					return;
				}
				$.post("delbaoxiu",{"id":id},function(data){
					if(data=="ok"){
						$('#tohid'+id).css('display','none');
					}
				});
			}
		</script>
	</body>

</html>