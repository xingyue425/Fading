<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/common/taglibs.jsp"%>
<html>
<head>
<%@ include file="/WEB-INF/common/commonlib.jsp"%>

<title>提现</title>
<style>
.bs-docs-example:after {
	background-color: #F5F5F5;
	border: 1px solid #DDDDDD;
	border-radius: 4px 0 4px 0;
	color: #9DA0A4;
	content: "资金 > 提现(agent-A0104)";
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
		<div class="row">
			<div class="span5 control-group">
				<label for="betingNo" class="control-label">投注账号</label>
				<div class="controls" >
					<input type="text" id="betingNo" name="betingNo" value="${sessionScope.accountNo}">
				</div>
			</div>	
			<div class="span3 control-group">
				<label for="agentEncashSid" class="control-label">代销者提现流水号</label>
				<div class="controls">
					<input type="text" id="agentEncashSid" name="agentEncashSid" value="${sessionScope.agentEncashSid }">
				</div>
			</div>
		</div>
		<div class="row">
			<div class="span5 control-group">
				<label for="accPass" class="control-label">投注密码</label>
				<div class="controls" >
					<input type="text" id="accPass" name="accPass">
				</div>
			</div>	
			<div class="span3 control-group">
				<label for="encashAmount" class="control-label">提现金额(分)</label>
				<div class="controls">
					<div class="input-prepend input-append">
						<span class="add-on">分</span> 
						<input type="text" id="encashAmount" name="encashAmount" value="${sessionScope.encashAmount }">
					</div>
				</div>
			</div>
		</div>
		<div class="control-group">
			<div class="controls">
				<button class="btn btn-primary" type="button" onclick="$.ajaxSubmit('${ctx}/withDraw/submit');">提   交</button>
			</div>
		</div>
	</form>
	<%@ include file="/WEB-INF/views/simu/response.jsp"%>
</body>
</html>
