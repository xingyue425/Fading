<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/common/taglibs.jsp"%>
<html>
<head>
<%@ include file="/WEB-INF/common/commonlib.jsp"%>
<script type="text/javascript">
	$(function() {
		bindTypeAhead('#logicCode',logicCodes);
	});
</script>
<title>竞彩足球赛果查询</title>
<style>
.bs-docs-example:after {
	background-color: #F5F5F5;
	border: 1px solid #DDDDDD;
	border-radius: 4px 0 4px 0;
	color: #9DA0A4;
	content: "帐户 > 竞彩足球赛果查询(agent-A5004)";
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
				<label for="matchId" class="control-label">赛事ID</label>
				<div class="controls">
					<input type="text" id="matchId" name="matchId" >
				</div>
			</div>
		<div class="control-group">
				<label for="logicCode" class="control-label">玩法标识</label>
				<div class="controls">
					<input type="text" id="logicCode" name="logicCode" value="00000" >
				</div>
			</div>
		<div class="control-group">
			<label for="matchDate" class="control-label">开赛时间</label>
			<div class="controls date form_date" data-date="" data-date-format="yyyy-mm-dd" data-link-field="matchDate" data-link-format="yyyy-mm-dd">
                <input size="16" type="text" value="" readonly>
                <span class="add-on"><i class="icon-remove"></i></span>
				<span class="add-on"><i class="icon-th"></i></span>
               </div>
			<input type="hidden" id="matchDate" name="matchDate"/>
		</div>
		
		<div class="control-group">
			<div class="controls">
				<button class="btn btn-primary" type="button" onclick="$.ajaxSubmit('${ctx}/leagueDetail/submit');">提   交</button>
			</div>
		</div>
		
	</form>
	<%@ include file="/WEB-INF/views/simu/response.jsp"%>
</body>
</html>
