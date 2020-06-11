<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/common/taglibs.jsp"%>
<html>
<head>
<%@ include file="/WEB-INF/common/commonlib.jsp"%>
<script type="text/javascript">
	$(function() {
		bindTypeAhead('#payType', payType);
	});
</script>
<title>账户明细查询</title>
<style>
.bs-docs-example:after {
	background-color: #F5F5F5;
	border: 1px solid #DDDDDD;
	border-radius: 4px 0 4px 0;
	color: #9DA0A4;
	content: "帐户 > 账户明细查询(agent-A1002)";
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
			<label for="startDate" class="control-label">起始日期</label>
			<div class="controls date form_date" data-date="" data-date-format="yyyy-mm-dd" data-link-field="startDate" data-link-format="yyyy-mm-dd">
                <input size="16" type="text" value="" readonly>
                <span class="add-on"><i class="icon-remove"></i></span>
				<span class="add-on"><i class="icon-th"></i></span>
               </div>
			<input type="hidden" id="startDate" name="startDate"/>
		</div>
		<div class="control-group">
			<label for="endDate" class="control-label">截止日期</label>
			<div class="controls date form_date" data-date="" data-date-format="yyyy-mm-dd" data-link-field="endDate" data-link-format="yyyy-mm-dd">
                <input size="16" type="text" value="" readonly>
                <span class="add-on"><i class="icon-remove"></i></span>
				<span class="add-on"><i class="icon-th"></i></span>
               </div>
			<input type="hidden" id="endDate" name="endDate"/>
		</div>
		<div class="control-group">
			<label for="payType" class="control-label">交易类型</label>
			<div class="controls">
				<input type="text" id="payType" name="payType" value="99">
			</div>
		</div>
		<div class="control-group">
			<label for="betingNo" class="control-label">投注账号</label>
			<div class="controls">
				<input type="text" id="betingNo" name="betingNo" value="${sessionScope.accountNo}">
			</div>
		</div>
		<div class="control-group">
			<label for="timetamp" class="control-label">时间戳</label>
			<div class="controls">
				<input type="text" id="timetamp" name="timetamp" value="0">
			</div>
		</div>
		<div class="control-group">
			<div class="controls">
				<button class="btn btn-primary" type="button" onclick="$.ajaxSubmit('${ctx}/accountSummary/submit');">提   交</button>
			</div>
		</div>
		
	</form>
	<%@ include file="/WEB-INF/views/simu/response.jsp"%>
</body>
</html>
