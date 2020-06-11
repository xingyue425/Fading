<%@ page language="java" pageEncoding="UTF-8"%>

<h4>&nbsp;&nbsp;电话彩票销售管理系统-代销者接入协议模拟器_Ver:1.8.0</h4>

<span style="color: red;">&nbsp;&nbsp;注：1、本模拟器页面中有token字时，需要先登录然后再进行操作，该值不需要手动处理，模拟器会自动获取。2、日期选择插件暂不支持FireFox浏览器，请使用其他浏览器代替。</span>
<div class="navbar">
    <div class="navbar-inner">
        <div class="container">
        	<div class="btn-group">
                <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                	账户
                    <span class="caret"></span>
                </a>
                <ul class="dropdown-menu">
               	 	<li><a href="${ctx}/baseLogin/init">代销者登录(A0000)</a></li>
                	<li><a href="${ctx}/agentBaseInfo/init">代销者获取基础数据(A0001)</a></li>
                	<li><a href="${ctx}/baseAgent/init">获取代销者信息(A0003)</a></li>
                	<li><a href="${ctx}/baseLogout/init">代销者登出(A0002)</a></li>
                	<li><a href="${ctx}/openbet/init">开通投注账号(A0101)</a></li>
                	<li><a href="${ctx}/openAbAccount/init">验证总账户(A0109)</a></li>
                	<li><a href="${ctx}/accCancel/init">注销投注账户(A0102)</a></li>
                	<li><a href="${ctx}/accCancelStatus/init">注销状态查询(A1009)</a></li>
                	<li><a href="${ctx}/accStatus/init">根据投注账户查询用户信息(A1007)</a></li>
                	<li><a href="${ctx}/findMemberAcc/init">根据总账户查询投注账户信息(A1012)</a></li>
                	<li><a href="${ctx}/getResetpassPin/init">修改投注密码获取验证码(A0106)</a></li>
                	<li><a href="${ctx}/resetBetPass/init">修改投注密码(A0107)</a></li>
                	<li><a href="${ctx}/checkBetPass/init">验证投注密码(A0105)</a></li>
                	<li><a href="${ctx}/updateBank/init">修改银行卡(A1006)</a></li>
                	<li><a href="${ctx}/updateMobileNumber/init">修改手机号(A0108)</a></li>
                	<li><a href="${ctx}/getPin/init">获取短信验证码(A4002)</a></li>
                </ul>
            </div>
            <div class="btn-group">
                <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                	资金
                    <span class="caret"></span>
                </a>
                <ul class="dropdown-menu">
                	<li><a href="${ctx}/recharge/init">充值(A0103)</a></li>
                	<li><a href="${ctx}/orderDetail/init">充值订单查询(A1001)</a></li>
                	<li><a href="${ctx}/withDraw/init">提现(A0104)</a></li>
                	<li><a href="${ctx}/withDrawOrder/init">提现订单查询(A1008)</a></li>
                	<li><a href="${ctx}/bonus/init">红包充值/失效(A1004)</a></li>
                	<li><a href="${ctx}/query/init">红包查询(A1005)</a></li>
                	<li><a href="${ctx}/accountOverview/init">账户资金总览(A1011)</a></li>
                	<li><a href="${ctx}/accountSummary/init">账户明细查询(A1002)</a></li>
                </ul>
            </div>
            <div class="btn-group">
                <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                	投注
                    <span class="caret"></span>
                </a>
                <ul class="dropdown-menu">
                	<li><a href="${ctx}/bettingOneStep/init">一步投注(A3001)</a></li>
                	<li><a href="${ctx}/queryBetResult/init">投注记录查询(A4001)</a></li>
                	<li><a href="${ctx}/instantbatch/init">即开批量刮开(A6002)</a></li>
                </ul>
            </div>
            <div class="btn-group">
                <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                	游戏
                    <span class="caret"></span>
                </a>
                <ul class="dropdown-menu">
                	<li><a href="${ctx}/licencedGame/init">查询生效产品、玩法列表(A2001)</a></li>
                	<li><a href="${ctx}/productListSaling/init">在售数字彩奖期查询(A2002)</a></li>
                	<li><a href="${ctx}/jcMatchNoStart/init">查询竞彩未开赛赛事(A2005)</a></li> 
                	<li><a href="${ctx}/jcMatchResult/init">查询竞彩指定赛事及赛果(A2006)</a></li> 
                	<li><a href="${ctx}/jcPoolSelling/init">查询竞彩在售奖池(A2007)</a></li> 
                	<li><a href="${ctx}/jcPoolResult/init">查询竞彩指定奖池及彩果(A2008)</a></li> 
                	<li><a href="${ctx}/jcOddsSelling/init">查询竞彩在售赔率(A2009)</a></li> 
                	<li><a href="${ctx}/jcOdds/init">查询竞彩指定奖池赔率(A2010)</a></li> 
                	<li><a href="${ctx}/jcFormula/init">查询竞彩过关公式(A2011)</a></li> 
                	<li><a href="${ctx}/jcBulletinBeginning/init">查询竞彩生效的赛事公告(A2012)</a></li>
					<li><a href="${ctx}/saleLimit/init">查询玩法销售限制时段(A2013)</a></li>
					<li><a href="${ctx}/getDrawResult/init">查询指定奖期及开奖公告(A2014)</a></li>
                </ul>
            </div>
             <div class="btn-group">
                <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                	推送消息查询
                    <span class="caret"></span>
                </a>
                <ul class="dropdown-menu">
                	<li><a href="${ctx}/showmsg/init">消息查询</a></li>
                </ul>
            </div>
            <div class="btn-group">
                <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                	报文调试
                    <span class="caret"></span>
                </a>
                <ul class="dropdown-menu">
                	<li><a href="${ctx}/json/init">JSON请求</a></li>
                </ul>
            </div>
		</div>
	</div>
</div>