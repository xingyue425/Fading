<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/common/taglibs.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ include file="/WEB-INF/common/commonlib.jsp"%>
<script src="${ctx }/static/data/area.js" type="text/javascript"></script>
<style type="text/css">
#divTb {
	width: 1000px;
	border: 1px solid #aaa;
	margin: 0 auto;
}
</style>
<script type="text/javascript">
	$(function() {
		bindTypeAhead('#logicCode', logicCodes);
		if ("${sessionScope.agentNo}" == "3711") {
			bindTypeAhead('#serverAreaCode', areaCode37);
		}
		if ("${sessionScope.agentNo}" == "4611") {
			bindTypeAhead('#serverAreaCode', areaCode46);
		}
		$("#jk").hide();
		$("#jc").hide();
		$("#jc").find(":input").attr("disabled", true);
		$("#jk").find(":input").attr("disabled", true);
		//增加<tr/>
		$("#but").click(function() {
				var _len = $("#tab tr").length + 1;
				$("#tab").append("<tr id="+_len+" >"+ "<td><input type='text' id='matchId"+ _len+ "'  name='betItemJc.pickList["+ (_len - 1)+ "].matchId' ></td>"+ "<td><input type='text' id='poolLogicCode"+ _len+ "' name='betItemJc.pickList["+ (_len - 1)+ "].poolLogicCode' ></td>"+ "<td><input type='text' id='content"+ _len+ "'  name='betItemJc.pickList["+ (_len - 1)+ "].content' ></td>"+ "<td><a href=\'javascript:void(0)\' onclick=\'deltr("+ _len + ")\'>删除</a></td>"+ "</tr>");
		})
		//获取竞彩赛事对阵信息
		$("#show").click(function() {
			getModuleInfo();
			$("#divTb").show();
		})

		$("#button").click(function() {
			$("#divTb").hide();
			$.ajaxSubmit('${ctx}/bettingOneStep/submit');
		})
	});
	function choosePlatform(platform) {
		$("#divTb").hide();
		if (platform == 1) {
			$("#jc").show('slow');
			$("#jc").find(":input").attr("disabled", false);
		} else {
			$("#jc").hide('slow');
			$("#jc").find(":input").attr("disabled", true);
		}
		if (platform == 2 || platform == 3) {
			$("#sz").show('slow');
			$("#sz").find(":input").attr("disabled", false);
		} else {
			$("#sz").hide('slow');
			$("#sz").find(":input").attr("disabled", true);
		}
		if (platform == 4) {
			$("#jk").show('slow');
			$("#jk").find(":input").attr("disabled", false);
		} else {
			$("#jk").hide('slow');
			$("#jk").find(":input").attr("disabled", true);
		}
	}

	//删除<tr/>
	var deltr = function(index) {
		var _len = $("#tab tr").length + 1;
		$("tr[id='" + index + "']").remove();//删除当前行
		for (var i = index + 1, j = _len; i < j; i++) {
			var nextMatchIdVal = $("#matchId" + i).val();
			var nextPoolLogicCodeVal = $("#poolLogicCode" + i).val();
			var nextContentVal = $("#content" + i).val();
			$("tr[id=\'" + i + "\']").replaceWith("<tr id="+ (i - 1)+ " align='center'>"+ "<td><input type='text' id='matchId"+ (i - 1)+ "' value='"+ nextMatchIdVal+ "' name='betItemJc.pickList["+ (i - 2)+ "].matchId' ></td>"+ "<td><input type='text' id='poolLogicCode"+ (i - 1)+ "' value='"+ nextPoolLogicCodeVal+ "' name='betItemJc.pickList["+ (i - 2)+ "].poolLogicCode' ></td>"+ "<td><input type='text' id='content"+ (i - 1)+ "' value='"+ nextContentVal+ "' name='betItemJc.pickList["+ (i - 2)+ "].content' ></td>"+ "<td><a href=\'javascript:void(0)\' onclick=\'deltr("+ (i - 1) + ")\'>删除</a></td>" + "</tr>");
		}

	}
	//封装的一个JQuery小插件,合并单元格
	jQuery.fn.rowspan = function(colIdx) {
		return this.each(function() {
			var that;
			$('tr', this).each(function(row) {
				$('td:eq(' + colIdx + ')', this).filter(':visible').each(function(col) {
					if (that != null&& $(this).html() == $(that).html()) {
						rowspan = $(that).attr("rowSpan");
						if (rowspan == undefined) {
							$(that).attr("rowSpan",1);
							rowspan = $(that).attr("rowSpan");
						}
						rowspan = Number(rowspan) + 1;
						$(that).attr("rowSpan",rowspan);
						$(this).hide();
					} else {
						that = this;
					}
				});
			});
		});
	}
	//获取竞彩赛事对阵列表信息 
	function getModuleInfo() {
		$.ajax({
			type : "GET",
			dataType : "json",
			url : "${ctx}/matchesDetail/submit",
			data : {
				version : 0,
				matchesTimeStamp : 0,
				betRatTimeStamp : 0
			},
			success : function(json) {
				var matchesDataStr = json.body;
				var matchesData = eval('(' + matchesDataStr + ')');
				var matchesList = matchesData.jc_matches_list;
				$(matchesList).each(function(i, matches) {
					var matchList = matches.match_list;
					$(matchList).each(function(i, match) {
						var matchResultList = match.oodds_result_list;

						$(matchResultList).each(function(i,matchResult) {
							var oodds = matchResult.oodds_list;

							$(oodds).each(function(i,oodd) {
								var aaa = oodd.oodds.胜.status == "0" ? oodd.oodds.胜.odds+ "(无效)": oodd.oodds.胜.odds;
								var bbb = oodd.oodds.平.status == "0" ? oodd.oodds.平.odds+ "(无效)": oodd.oodds.平.odds;
								var ccc = oodd.oodds.负.status == "0" ? oodd.oodds.负.odds+ "(无效)": oodd.oodds.负.odds;

								var pass = oodd.is_pass_on_sell == true ? "是": "否";
								var single = oodd.is_single_on_sell == true ? "是": "否";
								var tbBody = "";
								tbBody += "<tr align='center' ><td>"+ match.match_no+ "</td>"+ "<td>"+ match.match_id+ "</td>"+ "<td>"+ match.home_team+ "</td>"+ "<td>"+ match.away_team+ "</td>"+ "<td>"+ pass+ "</td>"+ "<td>"+ single+ "</td>"+ "<td>"+ oodd.pool_logic_code+ "</td><td>"+ aaa+ "</td><td>"+ bbb+ "</td><td>"+ ccc+ "</td></tr>";
								$("#myTb").append(tbBody);
							});
						});

					});

				});
				$("#myTb").rowspan(0);//传入的参数是对应的列数从0开始
				$("#myTb").rowspan(1);
			},
			error : function(json) {
				alert("获取竞彩赛事对阵列表信息失败");
			}
		});
	}
</script>
<title>一步投注</title>
<style>
.bs-docs-example:after {
	background-color: #F5F5F5;
	border: 1px solid #DDDDDD;
	border-radius: 4px 0 4px 0;
	color: #9DA0A4;
	content: "投注 > 一步投注(agent-A3001)";
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
			<div class="span5 control-group">
				<label for="oneStepBetPdType" class="control-label"><span style="color: red;">*</span>彩种类型</label>
				<div class="controls">
					<select id="oneStepBetPdType" name="oneStepBetPdType" onchange="choosePlatform(this.value)">
						<option value="3" selected="selected">周期型</option>
						<option value="1">竞彩</option>
						<option value="2">足彩</option>
						<option value="4">即开</option>
					</select>
				</div>
			</div>
			<div class="span5 control-group">
				<label for="logicCode" class="control-label"><span style="color: red;">*</span>玩法唯一标识</label>
				<div class="controls">
					<input type="text" id="logicCode" name="logicCode" value="00000">
				</div>
			</div>
			<div class="span5 control-group">
				<label for="betSn" class="control-label"><span style="color: red;">*</span>代销者流水号</label>
				<div class="controls">
					<input type="text" id="betSn" name="betSn" value="<%=System.currentTimeMillis()%>">
				</div>
			</div>
		</div>
		<div class="row">
			<div class="span5 control-group">
				<label for="mobile" class="control-label"><span style="color: red;">*</span>手机号</label>
				<div class="controls">
					<input type="text" id="mobile" name="mobile" value="${sessionScope.mobile }">
				</div>
			</div>
			<div class="span5 control-group">
				<label for="accPass" class="control-label"><span style="color: red;">*</span>投注密码</label>
				<div class="controls">
					<input type="password" id="accPass" name="accPass">
				</div>
			</div>
			<div class="span5 control-group">
				<label for="serverAreaCode" class="control-label"><span style="color: red;">*</span>接入区域代码</label>
				<div class="controls">
					<input type="text" id="serverAreaCode" name="serverAreaCode" value="${sessionScope.areaCode eq null?"":sessionScope.areaCode}">
				</div>
			</div>
		</div>
		<div class="row">
			<div class="span5 control-group">
				<label for="bettingNo" class="control-label"><span style="color: red;">*</span>投注账号</label>
				<div class="controls">
					<input type="text" id="bettingNo" name="bettingNo" value="${sessionScope.accountNo}">
				</div>
			</div>
			<div class="span5 control-group">
				<label for="selectedType" class="control-label">选注方式</label>
				<div class="controls">
					<select id="selectedType" name="betItemSz.selectedType">
						<option value="10">自选</option>
						<option value="20">机选</option>
					</select>
				</div>
			</div>
			<div class="span5 control-group">
				<label for="flagTransfer" class="control-label"><span style="color: red;">*</span>是否使用奖金</label>
				<div class="controls">
					<select id="flagTransfer" name="flagTransfer">
						<option value="1">使用</option>
						<option value="0">不使用</option>
					</select>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="span5 control-group">
				<label for="multiple" class="control-label"><span style="color: red;">*</span>投注倍数</label>
				<div class="controls">
					<input type="text" id="multiple" name="multiple" value="1">
				</div>
			</div>
			<div class="span5 control-group">
				<label for="betNum" class="control-label"><span style="color: red;">*</span>投注数量</label>
				<div class="controls">
					<input type="text" id="betNum" name="betNum" value="1">
				</div>
			</div>
			<div class="span5 control-group">
				<label for="amount" class="control-label"><span style="color: red;">*</span>投注总额</label>
				<div class="controls">
					<div class="input-prepend input-append">
						<span class="add-on">分</span>
						<input class="span2" id="amount" name="amount" value="200" type="text" maxlength="12">
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="span5 control-group">
				<label for="activityId" class="control-label">活动编号</label>
				<div class="controls">
					<input type="text" id="activityId" name="activityId" value="200">
				</div>
			</div>
			<div class="span5 control-group">
				<label for="bonusAmount" class="control-label">红包金额</label>
				<div class="controls">
					<div class="input-prepend input-append">
						<span class="add-on">分</span>
						<input class="span2" id="bonusAmount" name="bonusAmount" type="text" maxlength="12" value="0">
					</div>
				</div>
			</div>
			<div class="span5 control-group">
				<label for="bonusId" class="control-label">红包流水</label>
				<div class="controls">
					<input type="text" id="bonusId" name="bonusId" value="">
				</div>
			</div>
		</div>
		<div class="row">
			<div class="span5 control-group">
				<label for="pin" class="control-label">短信验证码（大额必填）</label>
				<div class="controls">
					<input type="text" id="pin" name="pin">
				</div>
			</div>
			<div class="span5 control-group">
				<label for="pinType" class="control-label">验证码类型（大额必填）</label>
				<div class="controls">
					<input type="text" id="pinType" name="pinType" placeholder="投注金额大于1万填写30001">
				</div>
			</div>
			<div class="span5 control-group">
				<label for="selectedType" class="control-label">选注方式</label>
				<div class="controls">
					<select id="selectedType" name="selectedType">
						<option value="10">自选</option>
						<option value="20">机选</option>
					</select>
				</div>
			</div>
		</div>
		<hr />
		<div id="jc" class="row">
			<h4 align="center" style="color:red ">竞彩投注信息</h4><br>
			<div class="control-group" style="margin-left: 100px;">
				<div class="span3 control-group">
					<input type="button" class="btn btn-primary" id="show" value="赛事信息" />
				</div>
				<div class="span3 control-group">
					<label for="aupType" class="control-label"><span style="color: red;">*</span>过关方式</label>
					<div class="controls">
						<input type="text" id="aupType" name="betItemJc.aupType" value="2#1">
					</div>
				</div>
				<table class="table table-striped table-bordered table-hover " style="font-size: 14px;">
					<thead>
						<tr>
							<th>赛事ID</th>
							<th>奖池玩法标识</th>
							<th>投注内容(0-胜 1-负 2-平)</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody id="tab" class="nth-child">
						<tr>
							<td>
								<input type="text" id="matchId1" name=betItemJc.pickList[0].matchId>
							</td>
							<td>
								<input type="text" id="poolLogicCode1" name="betItemJc.pickList[0].poolLogicCode" value="00000">
							</td>
							<td>
								<input type="text" id="content1" name="betItemJc.pickList[0].content" value="0">
							</td>
							<td>
								
							</td>
						</tr>
						<tr>
							<td>
								<input type="text" id="matchId2" name="betItemJc.pickList[1].matchId">
							</td>
							<td>
								<input type="text" id="poolLogicCode2" name="betItemJc.pickList[1].poolLogicCode" value="00000">
							</td>
							<td>
								<input type="text" id="content2" name="betItemJc.pickList[1].content" value="2">
							</td>
							<td>
								<input type="button" class="btn btn-primary" id="but" value="增加" />
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		<div id="jk">
				<div class="row">
				<h4 align="center" style="color:red ">即开彩票投注信息</h4><br>
					<div class="span5 control-group">
						<label for="tmpUrl" class="control-label">模板地址</label>
					<div class="controls">
						<input type="text" id="tmpUrl" name="betItemJk.tmpUrl" value="/template/1446791382077_f9a203cbf935ac3c8a3da4a3eeab5cf8_81001_0004.uz&123456">
					</div>
				</div>
				</div>
			</div>
		<div id="sz">
		<h4 align="center" style="color:red ">足彩，周期型彩票投注信息</h4><br>
			<div class="row">
				<div class="span5 control-group">
					<label for="drawNo" class="control-label"><span style="color: red;">*</span>期号</label>
					<div class="controls">
						<input type="text" id="drawNo" name="betItemSz.drawNo">
					</div>
				</div>
				<div class="span5 control-group">
					<label for="flagAdd" class="control-label"><span style="color: red;">*</span>是否追加</label>
					<div class="controls">
						<select id="flagAdd" name="betItemSz.flagAdd">
							<option value="0">否</option>
							<option value="1">是</option>
						</select>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="span5 control-group">
					<label for="pick" class="control-label"><span style="color: red;">*</span>投注内容</label>
					<div class="controls">
						<input type="text" id="pick" name="betItemSz.pick" value="1,2,3,4,5|1,2">
					</div>
				</div>
				<div class="span5 control-group">
					<label for="betWay" class="control-label"><span style="color: red;">*</span>投注方式</label>
					<div class="controls">
						<select id="betWay" name="betItemSz.betWay">
							<option value="1">超级大乐透_单式</option>
							<option value="2">超级大乐透_复式</option>
							<option value="3">超级大乐透_胆拖</option>
							<option value="1009">排列5_直选单式</option>
							<option value="1010">排列5_直选复式</option>
							<option value="1027">排列5_直选组合复式</option>
							<option value="1016">七星彩_单式</option>
							<option value="1015">七星彩_复式</option>
							<option value="2001">传足胜负14_单式</option>
							<option value="2002">传足胜负14_复式</option>
							<option value="2003">传足任选9_场单式</option>
							<option value="2004">传足任选9_场复式</option>
							<option value="2007">传足6场半全场_单式</option>
							<option value="2008">传足6场半全场_复式</option>
							<option value="2005">传足4场进球_单式</option>
							<option value="2006">传足4场进球_复式</option>
							<option value="1004">排列3_直选单式</option>
							<option value="1005">排列3_直选复式</option>
							<option value="1018">排列3_直选组合复式</option>
							<option value="1019">排列3_直选组合胆拖</option>
							<option value="1020">排列3_直选和值</option>
							<option value="1021">排列3_直选跨度</option>
							<option value="1017">排列3_组三单式</option>
							<option value="1006">排列3_组三复式</option>
							<option value="1022">排列3_组三胆拖</option>
							<option value="1023">排列3_组三跨度</option>
							<option value="1007">排列3_组六单式</option>
							<option value="1008">排列3_组六复式</option>
							<option value="1024">排列3_组六胆拖</option>
							<option value="1025">排列3_组六跨度</option>
							<option value="1026">排列3_组选和值</option>
							<option value="0101">海南4+1_单式</option>
							<option value="0102">海南4+1_定位4单式</option>
							<option value="0103">海南4+1_定位3单式</option>
							<option value="0104">海南4+1_定位2单式</option>
							<option value="0105">海南4+1_定位1单式</option>
							<option value="0201">海南4+1_复式</option>
							<option value="0202">海南4+1_定位4复式</option>
							<option value="0203">海南4+1_定位3复式</option>
							<option value="0204">海南4+1_定位2复式</option>
							<option value="0205">海南4+1_定位1复式</option>
							<option value="0301">海南4+1_组合复式</option>
							<option value="0401">海南4+1_胆拖复式</option>
							<option value="0501">海南4+1_任选4单式</option>
							<option value="0502">海南4+1_任选4复式</option>
							<option value="0503">海南4+1_任选4胆拖</option>
							<option value="0601">海南4+1_任选3单式</option>
							<option value="0602">海南4+1_任选3复式</option>
							<option value="0603">海南4+1_任选3胆拖</option>
							<option value="0701">海南4+1_任选2单式</option>
							<option value="0702">海南4+1_任选2复式</option>
							<option value="0703">海南4+1_任选2胆拖</option>
							<option value="0801">海南4+1_任选4 3重</option>
							<option value="0802">海南4+1_任选4 2重</option>
							<option value="0803">海南4+1_任选4 1重</option>
							<option value="0804">海南4+1_任选3 3重</option>
							<option value="0805">海南4+1_任选3 2重</option>
							<option value="0806">海南4+1_任选2 2重</option>
						</select>
					</div>
				</div>
			</div>
			</div>
			<div class="control-group">
				<div class="controls">
					<button class="btn btn-primary" type="button" id="button">提 交</button>
				</div>
			</div>
			<hr style="height: 3px; border: none; border-top: 3px double red;" />
			<div id="divTb" style="display: none;">
				<h4>
					<center>竞彩赛事对阵信息</center>
				</h4>
				<table id="myTb" style="width: 100%" border="1">
					<thead>
						<tr>
							<th>赛事编号</th>
							<th>赛事ID</th>
							<th>主队</th>
							<th>客队</th>
							<th>过关是否可售</th>
							<th>单关是否可售</th>
							<th>奖池玩法标识</th>
							<th>胜(赔率)</th>
							<th>平(赔率)</th>
							<th>负(赔率)</th>
						</tr>
					</thead>
				</table>
			</div>
	</form>
	<%@ include file="/WEB-INF/views/simu/response.jsp"%>
</body>
</html>
