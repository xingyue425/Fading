<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/common/taglibs.jsp"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ include file="/WEB-INF/common/commonlib.jsp"%>
<title>查询玩法销售限制时段</title>

<style>
.bs-docs-example:after {
	background-color: #F5F5F5;
	border: 1px solid #DDDDDD;
	border-radius: 4px 0 4px 0;
	color: #9DA0A4;
	content: "游戏 > 查询玩法销售限制时段(agent-A2013)";
	font-size: 12px;
	font-weight: bold;
	left: -1px;
	padding: 3px 7px;
	position: absolute;
	top: -1px;
}
</style>
</head>
<script type="text/javascript">
	$(function() {
		bindTypeAhead('#logicCode', logicCodes);
	})
</script>
<body>
	<%@ include file="/WEB-INF/views/simu/simu_memu.jsp"%>
	<form class="bs-docs-example form-horizontal" id="inputForm">
		<div class="row">
			<div class="span9">
				<div class="span3 control-group">
					<label for="logicCode" class="control-label">玩法编号</label>
					<div class="controls">
						<input type="text" id="logicCode" name="logicCode" value="00000">
					</div>
				</div>
			</div>
		</div>
		<div class="control-group">
			<div class="controls">
				<button class="btn btn-primary" type="button"
					onclick="$.ajaxSubmit('${ctx}/saleLimit/submit');">查询</button>
			</div>
		</div>
	</form>
	<%@ include file="/WEB-INF/views/simu/response.jsp"%>
</body>
</html>
