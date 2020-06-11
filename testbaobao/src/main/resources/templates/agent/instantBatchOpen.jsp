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
<title>即开批量刮开</title>
<style>
.bs-docs-example:after {
	background-color: #F5F5F5;
	border: 1px solid #DDDDDD;
	border-radius: 4px 0 4px 0;
	color: #9DA0A4;
	content: "投注 > 即开批量刮开(agent-A6002)";
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
				<label for="bettingNo" class="control-label">投注账号</label>
				<div class="controls">
					<input type="text" id="bettingNo" name="bettingNo" value="${sessionScope.accountNo }">
				</div>
			</div>
			<div class="control-group">
				<label for="platSn" class="control-label">省平台流水号</label>
				<div class="controls">
					<textarea id="platSn" name="platSn" rows="10"></textarea>
				</div>
			</div>
			<div class="control-group">
				<div class="controls">
					<button class="btn btn-primary" type="button" onclick="javascript:$.ajaxSubmit('${ctx}/instantbatch/submit');">批量刮开</button>
				</div>
			</div>
	</form>
	<%@ include file="/WEB-INF/views/simu/response.jsp"%>
</body>
</html>
