<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/common/taglibs.jsp"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ include file="/WEB-INF/common/commonlib.jsp"%>
<script src="${ctx }/static/data/area.js" type="text/javascript"></script>
<script type="text/javascript">
	$(function() {
		if ("${sessionScope.agentNo}" == "3711") {
			bindTypeAhead('#districtCode', areaCode37);
		}
		if ("${sessionScope.agentNo}" == "4611") {
			bindTypeAhead('#districtCode', areaCode46);
		}
	});
</script>
<title>修改手机号</title>
<style>
.bs-docs-example:after {
	background-color: #F5F5F5;
	border: 1px solid #DDDDDD;
	border-radius: 4px 0 4px 0;
	color: #9DA0A4;
	content: "账户 > 修改手机号(agent-A0108)";
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
		<div class="row">
			<div class="span9">
				<div class="span5 control-group">
					<label for="betNo" class="control-label">投注账号</label>
					<div class="controls">
						<input type="text" id="betNo" name="betNo"
							value="${sessionScope.accountNo}">
					</div>
				</div>
				<div class="span3 control-group">
					<label for="password" class="control-label">投注账号密码</label>
					<div class="controls">
						<input type="password" id="password" name="password">
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="span9">
				<div class="span5 control-group">
					<label for="certnum" class="control-label">身份证号</label>
					<div class="controls">
						<input type="text" id="certnum" name="certnum">
					</div>
				</div>
				<div class="span3 control-group">
					<label for="mobileNo" class="control-label">新手机号</label>
					<div class="controls">
						<input type="text" id="mobileNo" name="mobileNo">
					</div>

				</div>

			</div>
		</div>
		<div class="row">
			<div class="span9">
				<div class="span5 control-group">
					<label for="verifyCode" class="control-label">短信验证码</label>
					<div class="controls">
						<input type="text" id="verifyCode" placeholder="第一次请求时为空" name="verifyCode" >
					</div>
				</div>

			</div>
		</div>

		<div class="control-group">
			<div class="controls">
				<button class="btn btn-primary" type="button"
					onclick="$.ajaxSubmit('${ctx}/updateMobileNumber/submit');">提交</button>
			</div>
		</div>
	</form>
	<%@ include file="/WEB-INF/views/simu/response.jsp"%>
</body>
</html>
