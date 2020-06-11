<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/common/taglibs.jsp"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"> 
<%@ include file="/WEB-INF/common/commonlib.jsp"%>
<script src="${ctx }/static/data/area.js" type="text/javascript"></script>
<script type="text/javascript">
	$(function() {
		bindTypeAhead('#agentNo', agents);
		if("${sessionScope.agentNo}"=="3711"){
			bindTypeAhead('#districtCode', areaCode37);
		}
		if("${sessionScope.agentNo}"=="4611"){
			bindTypeAhead('#districtCode', areaCode46);
		}
		
	});
</script>
<title>开通投注账户</title>
<style>
.bs-docs-example:after {
	background-color: #F5F5F5;
	border: 1px solid #DDDDDD;
	border-radius: 4px 0 4px 0;
	color: #9DA0A4;
	content: "账户 > 开通投注账户(agent-A0101)";
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
					<label for="mobile" class="control-label">手机号码</label>
					<div class="controls">
						<input type="text" id="mobile" name="mobile" value="${sessionScope.mobile }">
					</div>
				</div>
				<div class="span3 control-group">
					<label for="accPass" class="control-label">投注账号密码</label>
					<div class="controls">
						<input type="password" id="accPass" name="accPass" >
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="span9">
				<div class="span5 control-group">
					<label for="name" class="control-label">真实姓名</label>
					<div class="controls">
						<input type="text" id="name" name="name" value="张三">
					</div>
				</div>
				<div class="span3 control-group">
					<label for="idCard" class="control-label">身份证号</label>
					<div class="controls">
						<input type="text" id="idCard" name="idCard" value="110221193507137658">
					</div>
				</div>
				
			</div>
		</div>
		<div class="row">
			<div class="span9">
				<div class="span5 control-group">
					<label for="bankAbbr" class="control-label">银行英文简写</label>
					<div class="controls" >
						<select id="bankAbbr" name="bankAbbr">
						  	<option value="CCB">中国建设银行-CCB</option>
						  	<option value="ABC">中国农业银行-ABC</option>
						  	<option value="BCOM">交通银行-BCOM</option>
						  	<option value="BOC">中国银行-BOC</option>
						  	<option value="CEB">中国光大银行-CEB</option>
						  	<option value="CITIC">中信银行-CITIC</option>
						  	<option value="CMB">招商银行-CMB</option>
						  	<option value="CMBC">中国民生银行-CMBC</option>
						  	<option value="GDB">广发银行-GDB</option>
						  	<option value="ICBC">中国工商银行-ICBC</option>
						  	<option value="POST">中国邮政储蓄银行-POST</option>
						</select>
					</div>
				</div>
				
				<div class="span3 control-group">
					<label for="loginName" class="control-label">登录账号</label>
					<div class="controls">
						<input type="text" id="loginName" name="loginName" value="agentsim" >
					</div>
				</div>
				
			</div>
		</div>
		<div class="row">
			<div class="span9">
				<div class="span5 control-group">
					<label for="bankAccNo" class="control-label">银行卡号</label>
					<div class="controls">
						<input type="text" id="bankAccNo" name="bankAccNo" value="6227005010708918542" >
					</div>
				</div>
				<div class="span3 control-group">
					<label for="districtCode" class="control-label">市区编号</label>
					<div class="controls">
						<input type="text" id="districtCode" name="districtCode" value="${sessionScope.areaCode eq null?"":sessionScope.areaCode}" >
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="span9">
				<div class="span5 control-group">
					<label for="innerAccType" class="control-label">是否内部账户</label>
					<div class="controls">
						<select id="innerAccType" name="innerAccType">
							<option value="0">否</option>
							<option value="1">是</option>
						</select>
					</div>
				</div>
				<div class="span3 control-group">
					<label for="innerFlag" class="control-label">值列表</label>
					<div class="controls">
						<select id="innerFlag" name="innerFlag">
							<option value="0">小数据量账户</option>
							<option value="1">大数据量账户</option>
						</select>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="span9">

			</div>
		</div>
		<div class="row">
			<div class="span9">
				<div class="span5 control-group">
					<label for="flagChildaccount" class="control-label">是否二级账户</label>
					<div class="controls">
						<select id="flagChildaccount" name="flagChildaccount">
							<option value="0">否</option>
							<option value="1">是</option>
						</select>
					</div>
				</div>
				<div class="span3 control-group">
					<label for="flagAutotran" class="control-label">是否同意自动转账协议</label>
					<div class="controls">
						<select id="flagAutotran" name="flagAutotran">
							<option value="0">否</option>
							<option value="1">是</option>
						</select>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="span9">
				<div class="span5 control-group">
					<label for="flagChildaccount" class="control-label">一级账户银行卡号</label>
					<div class="controls">
						<input type="text" id="seniorBankAccNo" name="seniorBankAccNo" value="" >
					</div>
				</div>
			<div class="span3 control-group">
					<label for="pin" class="control-label">验证码</label>
					<div class="controls">
						<input type="text" id="pin" name="pin" value="1234" >
					</div>
			</div>
			</div>
		</div>
			<div class="control-group">
				<div class="controls">
					<button class="btn btn-primary" type="button" onclick="$.ajaxSubmit('${ctx}/openbet/submit');">提交</button>
				</div>
			</div>
	</form>
	<%@ include file="/WEB-INF/views/simu/response.jsp"%>
</body>
</html>
