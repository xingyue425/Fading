<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/common/taglibs.jsp"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"> 
<%@ include file="/WEB-INF/common/commonlib.jsp"%>
<title>根据投注账户查询用户信息</title>
<style>
.bs-docs-example:after {
	background-color: #F5F5F5;
	border: 1px solid #DDDDDD;
	border-radius: 4px 0 4px 0;
	color: #9DA0A4;
	content: "账户 > 根据投注账户查询用户信息(agent-A1007)";
	font-size: 12px;
	font-weight: bold;
	left: -1px;
	padding: 3px 7px;
	position: absolute;
	top: -1px;
}
</style>
</head>

<body>
	<%@ include file="/WEB-INF/views/simu/simu_memu.jsp"%>
	<form class="bs-docs-example form-horizontal" id="inputForm">
			<div class="control-group">
				<label for="bettingNo" class="control-label">投注账户</label>
				<div class="controls" >
					<input type="text" id="bettingNo" name="bettingNo" value="${sessionScope.accountNo }">
				</div>
			</div>	
			<div class="control-group">
				<label for="idCard" class="control-label">身份证号</label>
				<div class="controls" >
					<input type="text" id="idCard" name="idCard" value="${sessionScope.idCard }">
				</div>
			</div>	
			
			<div class="control-group">
			<div class="controls">
				<button class="btn btn-primary" type="button" onclick="$.ajaxSubmit('${ctx}/accStatus/submit');">提   交</button>
			</div>
		</div>
	</form>
	<%@ include file="/WEB-INF/views/simu/response.jsp"%>
</body>
</html>
