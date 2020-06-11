<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/common/taglibs.jsp"%>
<html>
<head>
<%@ include file="/WEB-INF/common/commonlib.jsp"%>
<script type="text/javascript">
	$(function() {
		bindTypeAhead('#paramKeyList', threshold);
		
	});
</script>
<title>代销者获取基础数据</title>
<style>
.bs-docs-example:after {
	background-color: #F5F5F5;
	border: 1px solid #DDDDDD;
	border-radius: 4px 0 4px 0;
	color: #9DA0A4;
	content: "帐户 > 代销者获取基础数据(agent-A0001)";
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
				<label for="paramKeyList" class="control-label">系统阈值列表</label>
				<div class="controls">
					<input type="text" id="paramKeyList" name="paramKeyList" >
				</div>
			</div>
		<div class="control-group">
			<div class="controls">
				<button class="btn btn-primary" type="button" onclick="$.ajaxSubmit('${ctx}/agentBaseInfo/submit');">提   交</button>
			</div>
		</div>
		
	</form>
	<%@ include file="/WEB-INF/views/simu/response.jsp"%>
</body>
</html>
