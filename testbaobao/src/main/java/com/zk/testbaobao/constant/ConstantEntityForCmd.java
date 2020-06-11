/**
 * <br>项目名: promotion
 * <br>文件名: ConstantEntityForCmd.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.constant;

/** 
 * <br>类 名: ConstantEntityForCmd 
 * <br>描 述: 命令字常量类 
 * <br>作 者: yufenghe 
 * <br>创 建： 2016年4月28日 
 * <br>版 本：v1.0.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
public final class ConstantEntityForCmd {
	
	private ConstantEntityForCmd() {}
	
	/**
	 * 注册
	 */
	public static final String REGISTER_CMD = "102";
	
	/**
	 * 登录
	 */
	public static final String LOGIN_CMD = "103";
	
	/**
	 * 数字彩投注
	 */
	public static final String DIGITAL_BET_CMD = "110";
	
	/**
	 * 竞彩投注
	 */
	public static final String JC_BET_CMD = "111";

	/**
	 * 即开投注
	 */
	public static final String BET_CMD = "160";
	
	/**
	 * 代销者登录
	 */
	public final static String BASE_LOGIN = "A0000";
	
	/**
	 * 代销者获取基础数据
	 */
	public final static String AGENT_BASE_INFO = "A0001";

	/**
	 * 代销者登出
	 */
	public final static String BASE_LOGOUT = "A0002";
	
	/**
	 * 获取代销者信息
	 */
	public final static String BASE_AGENT = "A0003";
	
	/**
	 * 开通投注账户
	 */
	public static final String OPEN_BET_ACCOUNT_CMD = "A0101";

	/**
	 * 注销投注账户
	 */
	public static final String ACCOUNT_CANCEL_CMD = "A0102";

	/**
	 * 充值
	 */
	public static final String RECHARGE_CMD = "A0103";

	/**
	 * 提现
	 */
	public static final String WITH_DRAW = "A0104";
	
	/**
	 * 验证投注密码
	 */
	public static final String CHECT_BET_PASS = "A0105";
	
	/**
	 * 修改投注密码获验证码
	 */
	public static final String GET_RESETPASS_PIN  = "A0106";
	/**
	 * 获取短信验证码
	 */
	public static final String GET_PIN  = "A4002";
	
	/**
	 * 修改投注密码
	 */
	public static final String GET_RESET_BETPASS  = "A0107";
	
	/***
	 * 修改手机号
	 */
	public final static String UPDATE_MOBILE_NUMBER = "A0108";
	
	/***
	 * 验证总账户
	 */
	public final static String OPEN_AB_ACCOUNT = "A0109";
	
	/**
	 * 订单详情查询
	 */
	public static final String ORDER_DETAIL = "A1001";
	
	/**
	 * 账户明细查询
	 */
	public static final String ACCOUNT_SUMMARY = "A1002";
	
	/**
	 * 红包充值
	 */
	public static final String BONUS_CMD = "A1004";
	
	/**
	 * 红包查询
	 */
	public static final String QUERY_BONUS_CMD = "A1005";
	
	/**
	 * 修改银行卡
	 */
	public static final String USER_BASEINFO_UPDATE = "A1006";
	
	/**
	 * 账户信息查询
	 */
	public static final String ACCOUNT_STATUS = "A1007";
	
	/**
	 * 提现订单查询
	 */
	public static final String WITH_DRAW_ORDER = "A1008";
	/**
	 * 注销状态查询
	 */
	public static final String ACCOUNT_CANCEL_STATUS = "A1009";
	
	/**
	 * 账户资金信息总览
	 */
	public static final String ACCOUNT_FUND_OVERVIEW = "A1011";
	
	/***
	 * 根据总账户(竞猜账户号码)查询投注账户信息
	 */
	public final static String FIND_MEMBER_ACC = "A1012";
	
	/**
	 * 查询生效产品、玩法列表
	 */
	public final static String LICENCED_GAME = "A2001";
	
	/**
	 * 在售数字彩奖期查询
	 */
	public static final String DIGITAL_AWARD_PERIOD_SALING = "A2002";
	
	/**
	 * 传统足彩对阵详情列表查询
	 */
	public static final String CUSTOM_MATCH_DETAIL = "A2003";
	
	/**
	 * 查询未开赛赛事（竞彩）
	 */
	public final static String MATCH_NO_START = "A2005";
	/**
	 * 查询指定赛事及赛果（竞彩）
	 */
	public final static String MATCH_RSULT = "A2006";
	/**
	 * 查询在售奖池（竞彩）
	 */
	public final static String POOL_SELLING = "A2007";
	/**
	 * 查询指定奖池及彩果（竞彩）
	 */
	public final static String POOL_RESULT = "A2008";
	
	/**
	 * 查询在售赔率（竞彩）
	 */
	public final static String ODDS_SELLING = "A2009";
	
	/**
	 * 查询指定奖池赔率（竞彩）
	 */
	public final static String ODDS = "A2010";
	
	/**
	 * 查询过关公式（竞彩）
	 */
	public final static String FORMULA = "A2011";
	
	/**
	 * 查询生效的赛事公告（竞彩）
	 */
	public final static String BULLETIN_BEGINNING = "A2012";

	/**
	 * 查询玩法销售限制时段
	 */
	public final static String COMMAND_HTTP_SALE_LIMIT = "A2013";

	/**
	 * 一步投注全彩种
	 */
	public static final String BETTING_ONE_STEP = "A3001";
	
	/**
	 * 投注记录详情查询
	 */
	public static final String QUERY_BET_RESULT_DETAIL_CMD = "A4001";
	
	/**
	 * 开奖公告信息查询
	 */
	public final static String QUERY_DRAW_RESULT = "A500101";
	
	/***
	 * 历史开奖信息查询
	 */
	public final static String LOTTERY_RESULT_HISTORY = "A5002";

	/**
	 * 即开批量刮开
	 */
	public static final String INSTANT_OPEN_BATCH_CMD = "A6002";


	/**
	 * 开奖公告信息查询
	 */
	public final static String GET_DRAW_RESULT = "A2014";
	
}
