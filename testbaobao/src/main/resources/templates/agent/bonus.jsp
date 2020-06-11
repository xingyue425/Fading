<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/common/taglibs.jsp"%>
<html>
<head>
<%@ include file="/WEB-INF/common/commonlib.jsp"%>
<title>红包充值/失效</title>
<style>
.bs-docs-example:after {
	background-color: #F5F5F5;
	border: 1px solid #DDDDDD;
	border-radius: 4px 0 4px 0;
	color: #9DA0A4;
	content: "资金 > 红包充值/失效(agent-A1004)";
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
		if("${sessionScope.agentNo}"=="3711"){
			$("#activityId").val("3716090501");
		}
		if("${sessionScope.agentNo}"=="4611"){
			$("#activityId").val("4616090501");
		}
		
	});
</script>
<body>
	<%@ include file="/WEB-INF/views/simu/simu_memu.jsp"%>
	<form class="bs-docs-example form-horizontal" id="inputForm">
		<div class="row">
			<div class="span4 control-group">
				<label for="bettingNo" class="control-label">投注账号</label>
				<div class="controls">
					<input type="text" id="bettingNo" name="bettingNo" value="${sessionScope.accountNo }">
				</div>
			</div>
		</div>
		<div class="row">
			<div class="span4 control-group">
				<label for="activityId" class="control-label">活动编号</label>
				<div class="controls">
					<input type="text" id="activityId" name="activityId" >
				</div>
			</div>
			<div class="span4 control-group">
				<label for="bonusId" class="control-label">外部流水号</label>
				<div class="controls">
					<input type="text" id="bonusId" name="bonusId" value="${bonusId}" >
				</div>
			</div>
		</div>
		<div class="row">
			<div class="span4 control-group">
				<label for="amount" class="control-label">红包金额</label>
				<div class="controls">
					<div class="input-prepend input-append">
				      <span class="add-on">分</span>
				      <input class="span2" id="amount" name="amount" type="text" value="200" maxlength="12">
				    </div>
					
				</div>
			</div>
			<div class="span4 control-group">
				<label for="opType" class="control-label">推送类型</label>
				<div class="controls">
					<select id="opType" name="opType">
						<option value="1">派送</option>
						<option value="2">失效</option>
					</select>
				</div>
			</div>
		</div>
		<div class="control-group">
				<label for="bonusPayId" class="control-label">省平台流水号</label>
				<div class="controls" >
					<input type="text" id="bonusPayId" name="bonusPayId" style="width:500px;">
				</div>
			</div>	
		<div class="control-group">
				<label for="url" class="control-label">回调地址</label>
				<div class="controls" >
					<input type="text" id="url" name="url" style="width:500px;" value="http://10.0.3.41:8180/promotion/msg/call">
				</div>
			</div>
		<div class="control-group">
				<label for="description" class="control-label">红包描述</label>
				<div class="controls" >
					<input type="text" id="description" name="description" style="width:500px;" value="红包描述">
				</div>
			</div>	
			
		<div class="control-group">
			<div class="controls">
				<button class="btn btn-primary" type="button" onclick="$.ajaxSubmit('${ctx}/bonus/submit');">提   交</button>
			</div>
		</div>
		
	</form>
	<%@ include file="/WEB-INF/views/simu/response.jsp"%>
</body>
</html>
