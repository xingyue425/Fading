<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/common/taglibs.jsp"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"> 
<%@ include file="/WEB-INF/common/commonlib.jsp"%>
<title>获取竞彩可售赛事</title>

<style>
.bs-docs-example:after {
	background-color: #F5F5F5;
	border: 1px solid #DDDDDD;
	border-radius: 4px 0 4px 0;
	color: #9DA0A4;
	content: "游戏 > 查询竞彩未开赛赛事(agent-A2005)";
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
				<label for="sportNo" class="control-label">运动类型编号</label>
				<div class="controls">
					<select id="sportNo" name="sportNo">
					  	<option value="1">1-足球</option>
					</select>
				</div>
			</div>
			<div class="control-group">
				<label for="version" class="control-label">代销者赛事版本号</label>
				<div class="controls">
					<input type="text" id="version" name="version" value="0" >
				</div>
			</div>
			<div class="control-group">
				<div class="controls">
					<button class="btn btn-primary" type="button" onclick="$.ajaxSubmit('${ctx}/jcMatchNoStart/submit');">查询</button>
				</div>
			</div>
	</form>
	<%@ include file="/WEB-INF/views/simu/response.jsp"%>
</body>
</html>
