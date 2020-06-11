<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/common/taglibs.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"> 
<%@ include file="/WEB-INF/common/commonlib.jsp"%>
<title>本期开奖公告查询</title>
<style>
.bs-docs-example:after {
	background-color: #F5F5F5;
	border: 1px solid #DDDDDD;
	border-radius: 4px 0 4px 0;
	color: #9DA0A4;
	content: "开奖 > 查询指定奖期及开奖公告(agent-A2014)";
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
				<label for="gameCode" class="control-label">玩法标示</label>
				<div class="controls">
						<select id="gameCode" name="gameCode">
							<option value="99101" selected="selected">99101-超级大乐透</option>
							<option value="99105">99105-七星彩</option>
							<option value="99106">99106-排列3</option>
							<option value="99107">99107-排列5</option>
							<option value="99201">99201-胜负彩</option>
							<option value="99202">99202-6场半全场</option>
							<option value="99203">99203-4场进球</option>
							<option value="99204">99204-任选9场</option>
						</select>
				</div>
			</div>	
			<div class="control-group">
				<label for="period" class="control-label">奖期</label>
				<div class="controls">
					<input type="text" id="period" name="period" value="16111" >
				</div>
			</div>
			<div class="control-group">
			<div class="controls">
				<button class="btn btn-primary" type="button" onclick="$.ajaxSubmit('${ctx}/getDrawResult/submit');">提   交</button>
			</div>
		</div>
	</form>
	<%@ include file="/WEB-INF/views/simu/response.jsp"%>
</body>
</html>
