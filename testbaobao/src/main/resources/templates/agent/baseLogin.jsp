<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/common/taglibs.jsp"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"> 
<%@ include file="/WEB-INF/common/commonlib.jsp"%>
<script type="text/javascript">
	$(function() {
		bindTypeAhead('#agentNo', agents);
	});
</script>
<title>代销者登录</title>
<style>
.bs-docs-example:after {
	background-color: #F5F5F5;
	border: 1px solid #DDDDDD;
	border-radius: 4px 0 4px 0;
	color: #9DA0A4;
	content: "账户 > 代销者登录(agent-A0000)";
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
				<label for="agentNo" class="control-label">代销者编号</label>
				<div class="controls">
					<input type="text" id="agentNo" name="agentNo" value='${sessionScope.agentNo eq null ? "" : sessionScope.agentNo}'>
				</div>
			</div>
			<div class="control-group">
				<label for="callBackUrl" class="control-label">回调地址</label>
				<div class="controls" >
					<input type="text" id="callBackUrl" name="callBackUrl" value="${sessionScope.callBackUrl }">
				</div>
			</div>	
			
			<div class="control-group">
			<div class="controls">
				<button class="btn btn-primary" type="button" onclick="$.ajaxSubmit('${ctx}/baseLogin/submit');">提   交</button>
			</div>
		</div>
	</form>
	<%@ include file="/WEB-INF/views/simu/response.jsp"%>
</body>
</html>
