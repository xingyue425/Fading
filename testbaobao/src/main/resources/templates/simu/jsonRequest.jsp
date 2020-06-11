<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/common/taglibs.jsp"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"> 
<%@ include file="/WEB-INF/common/commonlib.jsp"%>
<title>JSON</title>
<style>
.bs-docs-example:after {
	background-color: #F5F5F5;
	border: 1px solid #DDDDDD;
	border-radius: 4px 0 4px 0;
	color: #9DA0A4;
	content: "报文调试 > JSON请求";
	font-size: 12px;
	font-weight: bold;
	left: -1px;
	padding: 3px 7px;
	position: absolute;
	top: -1px;
}
</style>
<script type="text/javascript">
$(function() {
	bindTypeAhead('#cmd',cmds);
	bindTypeAhead('#agentNo',agents);
});
</script>
</head>

<body>
	<%@ include file="/WEB-INF/views/simu/simu_memu.jsp"%>
	<form class="bs-docs-example form-horizontal" id="inputForm">
		<input type="hidden" name="timeStamp" value="0" />
		<input type="hidden" name="category" value="99" />
			<div class="control-group">
				<label for="agentNo" class="control-label">代销者编号</label>
				<div class="controls">
					<input type="text" id="agentNo" name="agentNo" value='${sessionScope.agentNo eq null ? "" : sessionScope.agentNo}' >
				</div>
			</div>
			<div class="control-group">
				<label for="token" class="control-label">token</label>
				<div class="controls">
					<input type="text" id="token" name="token" >
				</div>
			</div>
			<div class="control-group">
				<label for="cmd" class="control-label">命令字</label>
				<div class="controls">
					<input type="text" id="cmd" name="cmd" value="103" >
				</div>
			</div>
			<div class="control-group">
				<label for="jsonStr" class="control-label">json请求串</label>
				<div class="controls">
					<textarea rows="6" cols="30" id="jsonStr" name="jsonStr" style="width:500px;"></textarea>
				</div>
			</div>
			<div class="control-group">
				<div class="controls">
					<button class="btn btn-primary" type="button" onclick="$.ajaxSubmit('${ctx}/json/submit');">请求</button>
				</div>
			</div>
	</form>
	<%@ include file="/WEB-INF/views/simu/response.jsp"%>
</body>
</html>
