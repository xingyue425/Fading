<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/common/taglibs.jsp"%>
<html>
<head>
<%@ include file="/WEB-INF/common/commonlib.jsp"%>
<title>注销投注账户</title>
<style>
.bs-docs-example:after {
	background-color: #F5F5F5;
	border: 1px solid #DDDDDD;
	border-radius: 4px 0 4px 0;
	color: #9DA0A4;
	content: "帐户 > 注销投注帐户(agent-A0102)";
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
				<label for="betingNo" class="control-label">投注账号</label>
				<div class="controls">
					<input type="text" id="betingNo" name="betingNo" value="${sessionScope.accountNo }">
				</div>
			</div>
			<div class="control-group">
				<label for="accPass" class="control-label">投注密码</label>
				<div class="controls">
					<input type="text" id="accPass" name="accPass" >
				</div>
			</div>
			<div class="control-group">
				<label for="agentDisNo" class="control-label">代销者注销流水号</label>
				<div class="controls">
					<input type="text" id="agentDisNo" name="agentDisNo" >
				</div>
			</div>
		<div class="control-group">
			<div class="controls">
				<button class="btn btn-primary" type="button" onclick="$.ajaxSubmit('${ctx}/accCancel/submit');">提   交</button>
			</div>
		</div>
		
	</form>
	<%@ include file="/WEB-INF/views/simu/response.jsp"%>
</body>
</html>
