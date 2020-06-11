<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/common/taglibs.jsp"%>
<html>
<head>
<%@ include file="/WEB-INF/common/commonlib.jsp"%>
<script type="text/javascript">
	$(function() {
		bindTypeAhead('#agentNo', agents);
	});
</script>
<title>修改投注密码</title>
<style>
.bs-docs-example:after {
	background-color: #F5F5F5;
	border: 1px solid #DDDDDD;
	border-radius: 4px 0 4px 0;
	color: #9DA0A4;
	content: "帐户 > 修改投注密码(agent-A0107)";
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
					<input type="text" id="bettingNo" name="betingNo" value="${sessionScope.accountNo}">
				</div>
			</div>
			<div class="control-group">
				<label for="newPass" class="control-label">新密码</label>
				<div class="controls">
					<input type="text" id="newPass" name="newPass" value="${sessionScope.newPass}">
				</div>
			</div>
			<div class="control-group">
				<label for="pin" class="control-label">短信验证码</label>
				<div class="controls">
					<input type="text" id="pin" name="pin" value="${sessionScope.pin}">
				</div>
			</div>
		<div class="control-group">
			<div class="controls">
				<button class="btn btn-primary" type="button" onclick="$.ajaxSubmit('${ctx}/resetBetPass/submit');">提   交</button>
			</div>
		</div>
		
	</form>
	<%@ include file="/WEB-INF/views/simu/response.jsp"%>
</body>
</html>
