<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/common/taglibs.jsp"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"> 
<%@ include file="/WEB-INF/common/commonlib.jsp"%>
<title>充值</title>
<style>
.bs-docs-example:after {
	background-color: #F5F5F5;
	border: 1px solid #DDDDDD;
	border-radius: 4px 0 4px 0;
	color: #9DA0A4;
	content: "资金 > 充值(agent-A0103)";
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
				<label for="betingNo" class="control-label">投注账号</label>
				<div class="controls">
					<input type="text" id="bettingNo" name="betingNo" value="${sessionScope.accountNo}">
				</div>
			</div>
			<div class="control-group">
				<label for="money" class="control-label">充值金额</label>
				<div class="controls">
					<div class="input-prepend input-append">
				      <span class="add-on">分</span>
				      <input class="span2" id="money" name="money" type="text" value="10000" maxlength="12">
				    </div>
				</div>
			</div>
			<div class="control-group">
				<label for="paytype" class="control-label">充值渠道</label>
				<div class="controls">
					<select id="paytype" name="paytype">
					  	<option value="003001">003001-支付宝安全充值</option>
					  	<option value="003002">003002-支付宝储蓄卡充值</option>
					  	<option value="003003">003003-支付宝无线安全支付 </option>
					  	<option value="003101">003101-银联支付</option>
					  	<option value="001201">001201-建行本行支付</option>
					  	<option value="001202">001202-建行他行支付</option>
					  	<option value="0013">0013-海南中行充值</option>
					</select>
				</div>
			</div>
			<div class="control-group">
				<label for="callbackUrl" class="control-label">回调url</label>
				<div class="controls">
					<textarea id="callbackUrl" name="callbackUrl" ></textarea>
				</div>
			</div>
			<div class="control-group">
				<label for="agentRefillSid" class="control-label">代销者充值流水号</label>
				<div class="controls">
					<textarea id="agentRefillSid" name="agentRefillSid" ></textarea>
				</div>
			</div>
			<div class="control-group">
				<div class="controls">
					<button class="btn btn-primary" type="button" onclick="$.ajaxSubmit('${ctx}/recharge/submit');">充值</button>
				</div>
			</div>
	</form>
	<%@ include file="/WEB-INF/views/simu/response.jsp"%>
</body>
</html>
