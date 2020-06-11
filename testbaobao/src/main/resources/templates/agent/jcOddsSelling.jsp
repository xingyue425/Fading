<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/common/taglibs.jsp"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ include file="/WEB-INF/common/commonlib.jsp"%>
<title>查询竞彩在售赔率</title>

<style>
.bs-docs-example:after {
	background-color: #F5F5F5;
	border: 1px solid #DDDDDD;
	border-radius: 4px 0 4px 0;
	color: #9DA0A4;
	content: "游戏 > 查询竞彩在售赔率(agent-A2009)";
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
		bindTypeAhead('#gameCode', logicCodes);
	})
</script>
<body>
	<%@ include file="/WEB-INF/views/simu/simu_memu.jsp"%>
	<form class="bs-docs-example form-horizontal" id="inputForm">
		<div class="row">
		<div class="span9">
			<div class="span5 control-group">
				<label for="sportNo" class="control-label">运动类型编号</label>
				<div class="controls">
					<select id="sportNo" name="sportNo">
						<option value="1">1-足球</option>
					</select>
				</div>
			</div>
			<div class="span3 control-group">
				<label for="version" class="control-label">代销者赔率版本号</label>
				<div class="controls">
					<input type="text" id="version" name="version" value="0">
				</div>
			</div>
		</div>
		</div>
		<div class="row">
			<div class="span9">
				<div class="span5 control-group">
					<label for="oddsType" class="control-label">赔率类型值</label>
					<div class="controls">
						<select id="oddsType" name="oddsType">
							<option value="P">P-浮动赔率</option>
							<option value="F">F-固定赔率</option>
						</select>
					</div>
				</div>
				<div class="span3 control-group">
					<label for="gameCode" class="control-label">玩法编号</label>
					<div class="controls">
						<input type="text" id="gameCode" name="gameCode" value="00000">
					</div>
				</div>
			</div>
		</div>
		<div class="control-group">
			<div class="controls">
				<button class="btn btn-primary" type="button"
					onclick="$.ajaxSubmit('${ctx}/jcOddsSelling/submit');">查询</button>
			</div>
		</div>
	</form>
	<%@ include file="/WEB-INF/views/simu/response.jsp"%>
</body>
</html>
