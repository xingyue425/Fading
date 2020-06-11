<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/common/taglibs.jsp"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"> 
<%@ include file="/WEB-INF/common/commonlib.jsp"%>
<title>在售数字彩奖期查询</title>

<style>
.bs-docs-example:after {
	background-color: #F5F5F5;
	border: 1px solid #DDDDDD;
	border-radius: 4px 0 4px 0;
	color: #9DA0A4;
	content: "游戏 > 在售数字彩奖期查询(agent-A2002)";
	font-size: 12px;
	font-weight: bold;
	left: -1px;
	padding: 3px 7px;
	position: absolute;
	top: -1px;
}
</style>

<script type="text/javascript">
function addGameCode(){
	var gameCodes = $("#gameCodes").val();
	if(gameCodes == null){
		return ;
	}
	var gameCode = $("#gameCode").val();
	if(gameCode == null || gameCode == ''){
		$("#gameCode").val(gameCodes);
	}else{
		$("#gameCode").val(gameCode + "," + gameCodes);
	}
}
</script>
</head>

<body>
	<%@ include file="/WEB-INF/views/simu/simu_memu.jsp"%>
	<form class="bs-docs-example form-horizontal" id="inputForm">
			<div class="row">
				<div class="span5">
					<label for="gameCode" class="control-label">玩法唯一标识</label>
					<div class="controls">
						<textarea rows="6" id="gameCode" name="gameCode" width="100"></textarea>
					</div>
				</div>
				<div class="span2">
					<button class="btn" type="button" style="margin:30px;" onclick="addGameCode();">&lt;&lt;&lt;</button>
				</div>
				<div class="span3">
						<select multiple="multiple" style="height:106px;" id="gameCodes" >
							<option value="99101">99101-超级大乐透</option>
							<option value="99108">99108-生肖乐</option>
							<option value="99106">99106-排列3</option>
							<option value="99107">99107-排列5</option>
							<option value="99105">99105-七星彩</option>
							<option value="81001">81001-年年有余</option>
							<option value="81005">81005-心心相印</option>
							<option value="81010">81010-黄金时代</option>
							<option value="81002">81002-俱乐部台球</option>
							<option value="81004">81004-俱乐部飞镖</option>
							<option value="81003">81003-俱乐部保龄球</option>
							<option value="81006">81006-乐翻番</option>
							<option value="81007">81007-百宝箱</option>
							<option value="81008">81008-财神到</option>
							<option value="81009">81009-精彩奇妙5</option>
							<option value="99201">99201-胜负彩</option>
							<option value="99204">99204-任选9场</option>
							<option value="99202">99202-6场半全场</option>
							<option value="99203">99203-4场进球</option>
							<option value="00000">00000-竞彩足球让球胜平负</option>
							<option value="00001">00001-竞彩足球半全场</option>
							<option value="00002">00002-竞彩足球比分</option>
							<option value="00003">00003-竞彩足球总进球数</option>
							<option value="00009">00009-竞彩足球胜平负</option>
							<option value="00999">00999-竞彩足球混合过关</option>
						</select>
				</div>
			</div>
			<br/>
			<div class="control-group">
				<div class="controls">
					<button class="btn btn-primary" type="button" onclick="$.ajaxSubmit('${ctx}/productListSaling/submit');">查询</button>
				</div>
			</div>
	
	</form>
	<%@ include file="/WEB-INF/views/simu/response.jsp"%>
</body>
</html>
