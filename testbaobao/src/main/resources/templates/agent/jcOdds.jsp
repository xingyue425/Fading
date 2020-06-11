<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/common/taglibs.jsp"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ include file="/WEB-INF/common/commonlib.jsp"%>
<title>查询竞彩指定奖池赔率</title>

<style>
.bs-docs-example:after {
	background-color: #F5F5F5;
	border: 1px solid #DDDDDD;
	border-radius: 4px 0 4px 0;
	color: #9DA0A4;
	content: "游戏 > 查询竞彩指定奖池赔率(agent-A2010)";
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
	bindTypeAhead('#gameCode1', logicCodes);
	
	//增加<tr/>
	$("#but").click(function() {
			var _len = $("#tab tr").length + 1;
			$("#tab").append("<tr id="+_len+" >"+ "<td><input type='text' value='0' id='matchId"+ _len+ "'  name='jcPoolKeys["+ (_len - 1)+ "].matchId' ></td>"+ "<td><input type='text' id='gameCode"+ _len+ "' name='jcPoolKeys["+ (_len - 1)+ "].gameCode' ></td>"+ "<td><input type='text' value='0' id='poolId"+ _len+ "' name='jcPoolKeys["+ (_len - 1)+ "].poolId' ></td>"+ "<td><a href=\'javascript:void(0)\' onclick=\'deltr("+ _len + ")\'>删除</a></td>"+ "</tr>");
	});
	
});
//删除<tr/>
	var deltr = function(index) {
		var _len = $("#tab tr").length + 1;
		$("tr[id='" + index + "']").remove();//删除当前行
		for (var i = index + 1, j = _len; i < j; i++) {
			var nextMatchIdVal = $("#matchId" + i).val();
			var nextGameCodeVal = $("#gameCode" + i).val();
			var nextPoolIdVal = $("#poolId" + i).val();
			$("tr[id=\'" + i + "\']").replaceWith("<tr id="+ (i - 1)+ " align='center'>"+ "<td><input type='text' id='matchId"+ (i - 1)+ "' value='"+ nextMatchIdVal+ "' name='jcPoolKeys["+ (i - 2)+ "].matchId' ></td>"+ "<td><input type='text' id='gameCode"+ (i - 1)+ "' value='"+ nextGameCodeVal+ "' name='jcPoolKeys["+ (i - 2)+ "].gameCode' ></td>"+"<td><input type='text' id='poolId"+ (i - 1)+ "' value='"+ nextPoolIdVal+ "' name='jcPoolKeys["+ (i - 2)+ "].poolId' ></td>"+ "<td><a href=\'javascript:void(0)\' onclick=\'deltr("+ (i - 1) + ")\'>删除</a></td>" + "</tr>");
		}

	}
	
</script>
<body>
	<%@ include file="/WEB-INF/views/simu/simu_memu.jsp"%>
	<form class="bs-docs-example form-horizontal" id="inputForm">
		<div class="row">
			<div class="span5 control-group">
				<label for="paramType" class="control-label">入参类别</label>
				<div class="controls">
					<select id="paramType" name="paramType">
						<option value="1">1-赛事ID+游戏编号</option>
						<option value="2">2-奖池ID</option>
					</select>
				</div>
			</div>
			<div class="span5 control-group">
				<label for="oddsType" class="control-label">赔率类型值</label>
				<div class="controls">
					<select id="oddsType" name="oddsType">
						<option value="P">P-浮动赔率</option>
						<option value="F">F-固定赔率</option>
					</select>
				</div>
			</div>
		</div>
		<div id="param1" class="control-group">
			<table class="table table-striped table-bordered table-hover "
				style="font-size: 14px;">
				<thead>
					<tr>
						<th>赛事ID</th>
						<th>游戏编号</th>
						<th>奖池ID</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody id="tab" class="nth-child">
					<tr>
						<td><input type="text" id="matchId1" name=jcPoolKeys[0].matchId value="0"></td>
						<td><input type="text" id="gameCode1" name="jcPoolKeys[0].gameCode"  value="00000"></td>
						<td><input type="text" id="poolId1" name="jcPoolKeys[0].poolId" value="0" ></td>
						<td><input type="button" class="btn btn-primary" id="but" value="增加" /></td>
					</tr>
				</tbody>
			</table>
		</div>
		<div class="control-group">
			<div class="controls">
				<button class="btn btn-primary" type="button"
					onclick="$.ajaxSubmit('${ctx}/jcOdds/submit');">查询</button>
			</div>
		</div>
	</form>
	<%@ include file="/WEB-INF/views/simu/response.jsp"%>
</body>
</html>
