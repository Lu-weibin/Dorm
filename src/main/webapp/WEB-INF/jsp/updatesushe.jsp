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
											<th>楼号</th>
											<th>宿舍号</th>
											<th>宿舍容量</th>
											<th>当前人数</th>
											<th>操作</th>
										</tr>
									</thead>
									<tbody class="text-center">
										<c:forEach items="${dormList}" var="item" varStatus="status">
											<tr id="tohid${item.id}">
												<td>${item.louhao}</td>
												<td>${item.sushehao}</td>
												<td id="rongliang${item.id}">${item.rongliang}</td>
												<td>${item.dangqianrenshu}</td>
												<td class="td">
													<a href="#" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#myModal" onclick="toedit('${item.id}','${item.louhao}','${item.sushehao}','${item.dangqianrenshu}')">编辑</a>
													<a href="#" class="btn btn-danger btn-xs"  onclick="del('${item.id}','${item.dangqianrenshu}')">删除</a>
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
									<form class="form-horizontal" id="dormForm"
										method="post" onsubmit="return false">
										<input type="hidden" id="id" name="id"/>
										<div class="form-group">
											<label for="phone" class="col-sm-9 control-label">宿舍楼</label>
											<div class="col-sm-9">
												<input type="text" class="form-control" id="sushelou" readonly>
												
											</div>
										</div>
										<div class="form-group">
											<label for="phone" class="col-sm-3 control-label">宿舍容量 </label>
											<div class="col-sm-9">
												<input type="text" class="form-control" id="rongliang" name="rongliang">
											</div>
										</div>
										<div class="form-group">
											<label for="phone" class="col-sm-3 control-label">当前人数</label>
											<div class="col-sm-9">
												<input type="text" class="form-control" id="dangqianrenshu" readonly>
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
			function toedit(id,louhao,sushehao,dangqianrenshu){
				$('#id').val(id);
				$('#sushelou').val(louhao+' '+sushehao);
				$('#rongliang').val($('#rongliang'+id).html());
				$('#dangqianrenshu').val(dangqianrenshu);
			}
			function edit(){
				var id = $('#id').val();
				var rongliang = $('#rongliang').val();
				var dangqianrenshu =  $('#dangqianrenshu').val();
				if(dangqianrenshu>rongliang){
					alert("宿舍容量低于人数，请核实！");
					return ;
				}
				$.post("updatedorm",$('#dormForm').serialize(),function(data){
					if("更新宿舍信息成功！"==data){
						$('#rongliang'+id).html(rongliang);
					}
					alert(data);
				});
			}
			
			function del(id,renshu){
				if(renshu>0){
					alert("当前宿舍已安排了学生，不允许删除！");
					return;
				}
				$.post('delDorm',{"id":id},function(data){
					if(data=="ok"){
						$('#tohid'+id).css('display','none');
						return;
					}
					alert(data);
				});
			}
		</script>
	</body>

</html>