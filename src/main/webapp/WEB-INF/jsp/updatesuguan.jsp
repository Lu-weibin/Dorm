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
				<%@include file="adminleft.jsp" %>

				<div class="content">
					<div class="container-fluid">

						<div class="row ">
							<div class="col-md-12" style="margin-top: 10px;">
								<div class="text-center" style="">
									
									<table class="table table-bordered table-striped ">
									<thead >
										<tr class="text-center">
											<th>宿管姓名</th>
											<th>联系方式</th>
											<th>管理楼号</th>
											<th>操作</th>
										</tr>
									</thead>
									<tbody class="text-center">
										<c:forEach items="${suguanList}" var="item" varStatus="status">
											<tr id="tohid${item.louhaoid}">
												<td id="name${item.louhaoid}">${item.name}</td>
												<td id="phone${item.louhaoid}">${item.phone}</td>
												<td id="louhao${item.louhaoid}">${item.louhao}</td>
												<td class="td">
													<a href="#" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#myModal" onclick="toedit('${item.id}','${item.louhaoid}')">编辑</a>
													<a href="#" class="btn btn-danger btn-xs"  onclick="del('${item.id}','${item.louhaoid}')">删除</a>
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
			
			<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
						aria-labelledby="myModalLabel" aria-hidden="true">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-hidden="true">&times;</button>
									<h4 class="modal-title" id="myModalLabel"></h4>
								</div>
								<div class="" style="width: 100%">
									<form class="form-horizontal" id="suguanForm"
										method="post" onsubmit="return false">
										<input type="hidden" id="id" name="id"/>
										<input type="hidden" id="louhaoid" name="louhaoid"/>
										<div class="form-group">
											<label for="phone" class="col-sm-9 control-label">宿管姓名</label>
											<div class="col-sm-9">
												<input type="text" class="form-control" id="name" name="name">
												
											</div>
										</div>
										<div class="form-group">
											<label for="phone" class="col-sm-3 control-label">联系方式</label>
											<div class="col-sm-9">
												<input type="text" class="form-control" id="phone" name="phone">
											</div>
										</div>
										<div class="form-group">
											<label for="phone" class="col-sm-3 control-label">管理楼号</label>
											<div class="col-sm-9">
												<select name="louhao" class="form-control" id="louhao">
													<option value="玉兰宛D1">玉兰宛D1</option>
													<option value="玉兰宛D2">玉兰宛D2</option>
													<option value="玉兰宛D3">玉兰宛D3</option>
													<option value="玉兰宛D4">玉兰宛D4</option>
													<option value="玉兰宛D5">玉兰宛D5</option>
													<option value="玉兰宛D6">玉兰宛D6</option>
													<option value="玉兰宛D7">玉兰宛D7</option>
													<option value="玉兰宛D8">玉兰宛D8</option>
													<option value="玉兰宛D9">玉兰宛D9</option>
												</select>
											</div>
										</div>
										<div class="modal-footer">
											<button type="button" class="btn btn-default"
												data-dismiss="modal">关闭</button>
											<button type="submit" class="btn btn-primary" onclick="edit()">修改</button>
										</div>
									</form>
								</div>
							</div>
						</div>
					<!-- /.modal-content -->
				</div>
			
		</div>
		<script src="./vendor/jquery/jquery.min.js"></script>
		<script src="./vendor/popper.js/popper.min.js"></script>
		<script src="./vendor/bootstrap/js/bootstrap.min.js"></script>
		<script src="./vendor/chart.js/chart.min.js"></script>
		<script src="./js/carbon.js"></script>
		<script src="./js/demo.js"></script>
		<script type="text/javascript">
			function toedit(id,louhaoid){
				$('#id').val(id);
				$('#louhaoid').val(louhaoid);
				$('#name').val($('#name'+louhaoid).html());
				$('#phone').val($('#phone'+louhaoid).html());
				$('#louhao').val($('#louhao'+louhaoid).html());
			}
			function edit(){
				var id = $('#id').val();
				var name = $('#name').val();
				var phone =  $('#phone').val();
				var louhao =  $('#louhao').val();
				var louhaoid =  $('#louhaoid').val();
				
				$.post("updatesuguan",$('#suguanForm').serialize(),function(data){
					if("更新宿管信息成功！"==data){
						$('#name'+louhaoid).html(name);
						$('#phone'+louhaoid).html(phone);
						$('#louhao'+louhaoid).html(louhao);
					}
					alert(data);
				});
			}
			
			function del(id,louhaoid){
				$.post('delsuguan',{"id":id,"louhaoid":louhaoid},function(data){
					if(data=="ok"){
						$('#tohid'+louhaoid).css('display','none');
						return;
					}
					alert(data);
				});
			}
		</script>
	</body>

</html>