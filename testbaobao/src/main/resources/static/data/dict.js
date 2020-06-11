var logicCodes = [
{'id':'99101','value':'超级大乐透'},
{'id':'99108','value':'生肖乐'},
{'id':'99106','value':'排列3'},
{'id':'99107','value':'排列5'},
{'id':'99105','value':'七星彩'},
{'id':'81001','value':'年年有余'},
{'id':'81005','value':'心心相印'},
{'id':'81010','value':'黄金时代'},
{'id':'81002','value':'俱乐部台球'},
{'id':'81004','value':'俱乐部飞镖'},
{'id':'81003','value':'俱乐部保龄球'},
{'id':'81006','value':'乐翻番'},
{'id':'81007','value':'百宝箱'},
{'id':'81008','value':'财神到'},
{'id':'81009','value':'精彩奇妙5'},
{'id':'99201','value':'胜负彩'},
{'id':'99204','value':'任选9场'},
{'id':'99202','value':'6场半全场'},
{'id':'99203','value':'4场进球'},
{'id':'00000','value':'竞彩足球让球胜平负'},
{'id':'00001','value':'竞彩足球半全场'},
{'id':'00002','value':'竞彩足球比分'},
{'id':'00003','value':'竞彩足球总进球数'},
{'id':'00004','value':'竞彩足球上下盘单双'},
{'id':'00009','value':'竞彩足球胜平负'},
{'id':'00021','value':'竞彩足球冠军'},
{'id':'00022','value':'竞彩足球小组首名'},
{'id':'00023','value':'竞彩足球冠亚军'},
{'id':'00999','value':'竞彩足球混合过关'},
{'id':'01005','value':'竞彩篮球让分胜负'},
{'id':'01006','value':'竞彩篮球胜负'},
{'id':'01007','value':'竞彩篮球胜分差'},
{'id':'01008','value':'竞彩篮球大小分'},
{'id':'01021','value':'竞彩篮球冠军'},
{'id':'01022','value':'竞彩篮球小组首名'},
{'id':'01023','value':'竞彩篮球冠亚军'},
{'id':'01999','value':'竞彩篮球混合过关'}
];
var logicCodeJc = [
{'id':'00000','value':'竞彩足球让球胜平负'},
{'id':'00001','value':'竞彩足球半全场'},
{'id':'00002','value':'竞彩足球比分'},
{'id':'00003','value':'竞彩足球总进球数'},
{'id':'00009','value':'竞彩足球胜平负'},
{'id':'00999','value':'竞彩足球混合过关'}
];
var cmds = [
{'id':'A1001','value':'用户消息查询'},
{'id':'A1002','value':'账户明细查询'},
{'id':'A1004','value':'用户红包充值/失效'},
{'id':'A1005','value':'红包充值状态查询'},
{'id':'A1011','value':'账户资金信息总览'},
{'id':'A2001','value':'在售奖期查询'},
{'id':'A2002','value':'在售数字彩奖期查询'},
{'id':'A2003','value':'传统足彩对阵详情列表查询'},
{'id':'A2004','value':'竞彩足球对阵详情列表查询'},
{'id':'A2005','value':'获取竞彩浮动赔率'},
{'id':'A2006','value':'获取竞彩固定赔率'},
{'id':'A2007','value':'获取竞彩所有奖池'},
{'id':'A2008','value':'获取竞彩可售奖池'},
{'id':'A2009','value':'获取竞彩所有赛事'},
{'id':'A2010','value':'获取竞彩可售赛事'},
{'id':'A2011','value':'获取竞彩可售投注比例'},
{'id':'A2012','value':'获取竞彩赛事公告(暂不开放使用)'},
{'id':'A4001','value':'投注记录详情查询'},
{'id':'A400101','value':'投注记录详情查询(新)'},
{'id':'A5001','value':'开奖公告及详情查询'},
{'id':'A5002','value':'历史开奖信息查询'},
{'id':'A5003','value':'足彩赛果查询'},
{'id':'A5004','value':'竞彩赛果查询'},
{'id':'A5005','value':'竞彩对阵信息查询'},
{'id':'A5006','value':'获取竞彩奖池结果'},
{'id':'A5007','value':'获取竞彩比赛结果'},
{'id':'A6001','value':'即开彩票单张刮开兑奖'},
{'id':'A6002','value':'即开彩票批量刮开兑奖'},
{'id':'P1001','value':'红包到账/失效通知（消息推送）'},
{'id':'P1002','value':'充值消息通知（消息推送）'},
{'id':'P1003','value':'提现消息通知（消息推送）'},
{'id':'A0001','value':'代销者获取基础数据(暂不开放使用)'},
{'id':'A0101','value':'开通投注账户(暂不开放使用)'},
{'id':'A1003','value':'用户基本信息查询'},
{'id':'A1006','value':'用户基本信息修改'},
{'id':'A1007','value':'投注账户状态查询'},
{'id':'100','value':'客户端初始化'},
{'id':'101','value':'上传设备标示'},
{'id':'109','value':'客户端联通性能'},
{'id':'139','value':'关于我们'},
{'id':'142','value':'帮助中心'},
{'id':'143','value':'玩法规则'},
{'id':'147','value':'开奖公告'},
{'id':'148','value':'开奖公告详情（乐透型、传统足彩）'},
{'id':'1481','value':'竞彩对阵详情'},
{'id':'149','value':'开奖历史'},
{'id':'700','value':'中奖播报'},
{'id':'701','value':'新闻资讯'},
{'id':'702','value':'轮播图'},
{'id':'703','value':'获取活动轮播图'},
{'id':'102','value':'注册登录账号'},
{'id':'103','value':'登录'},
{'id':'1031','value':'快速登录'},
{'id':'108','value':'验证短信验证码(找回密码)'},
{'id':'112','value':'获取系统阈值'},
{'id':'114','value':'在售奖期查询'},
{'id':'124','value':'找回密码(身份验证）'},
{'id':'125','value':'找回密码(设置新密码)'},
{'id':'127','value':'查询注册用户协议'},
{'id':'128','value':'查询最近上传玩法模版地址'},
{'id':'129','value':'客户端检查更新'},
{'id':'130','value':'找回密码(验证用户名是否存在)'},
{'id':'131','value':'获取UUID设备唯一标识'},
{'id':'105','value':'提现申请'},
{'id':'106','value':'提现申请二次确认'},
{'id':'1070','value':'修改登录密码'},
{'id':'1071','value':'修改投注密码'},
{'id':'110','value':'数字彩传统足彩一步投注'},
{'id':'111','value':'竞猜一步投注'},
{'id':'112','value':'获取系统阈值'},
{'id':'113','value':'用户消息查询'},
{'id':'115','value':'账户总览查询'},
{'id':'116','value':'登出'},
{'id':'117','value':'用户消息删除'},
{'id':'118','value':'获取短信验证码(修改登录/投注密码)'},
{'id':'119','value':'心跳协议'},
{'id':'120','value':'验证投注密码'},
{'id':'121','value':'修改账户密码开关'},
{'id':'122','value':'修改个人资料'},
{'id':'123','value':'意见反馈'},
{'id':'126','value':'获取开户行名称'},
{'id':'135','value':'销户申请二次确认'},
{'id':'138','value':'销户申请'},
{'id':'140','value':'设置密保'},
{'id':'141','value':'获取密保集合和用户信息'},
{'id':'144','value':'修改联系方式'},
{'id':'152','value':'即开彩票单张刮开兑奖'},
{'id':'153','value':'即开彩票全部刮开兑奖'},
{'id':'154','value':'即开彩票投注记录详情查询'},
{'id':'155','value':'即开彩票查询刮开统计'},
{'id':'157','value':'查询玩法列表(包括已失效的)'},
{'id':'158','value':'获取投注账户状态和错误阈值范围提示信息'},
{'id':'160','value':'即开彩票一步投注'},
{'id':'161','value':'账户明细查询'},
{'id':'163','value':'充值(支付宝/银联/中行/建行)'},
{'id':'164','value':'支付宝验签'},
{'id':'1670','value':'传统足彩对阵详情列表查询'},
{'id':'1671','value':'竞彩足球对阵详情列表查询'},
{'id':'168','value':'投注记录查询（传统足彩、竞彩）'},
{'id':'169','value':'投注记录最近八条查询（乐透、传统足彩、竞彩）'},
{'id':'1700','value':'投注记录详情查询（数字彩、传统足彩）'},
{'id':'1701','value':'竞彩足球投注记录详情查询'},
{'id':'202','value':'开通投注账户'},
{'id':'203','value':'开通总账户'},
{'id':'704','value':'获取赛事公告'},
{'id':'800','value':'微博认证链接'},
{'id':'801','value':'微博分享'},
{'id':'301','value':'查询在售数字彩奖期信息'},
{'id':'302','value':'查询竞彩对阵信息'},
{'id':'303','value':'投注记录未决查询'},
{'id':'304','value':'获取历史开奖信息'},
{'id':'305','value':'竞彩赛果查询'}          
];
var agents = [
{'id':'3711','value':'山东代销者编号'},
{'id':'4611','value':'海南代销者编号'}                        
];
var payType = [
{'id':'0','value':'充值'},
{'id':'1','value':'奖金派送'},
{'id':'2','value':'投注退款'},
{'id':'3','value':'充值冲正'},
{'id':'4','value':'提现退款'},
{'id':'5','value':'投注扣款'},
{'id':'6','value':'提现扣款'},
{'id':'9','value':'注销退款'},
{'id':'10','value':'奖金转预存金'},
{'id':'11','value':'奖金扣款'},
{'id':'12','value':'注销扣款'},
{'id':'97','value':'支出'},
{'id':'98','value':'收入'},
{'id':'99','value':'全部'}
];
var proType = [
{'id':'1','value':'竞彩型'},
{'id':'2','value':'传足型'},
{'id':'3','value':'周期型'},
{'id':'4','value':'即开型'}
];
var threshold = [
{'id':'bigmaney','value':'大奖阈值(乐透彩票)'},
{'id':'bigmaneyjk','value':'大奖阈值(即开彩票)'},
{'id':'bigmoneyjc','value':'大奖阈值(竞猜彩票)'},
{'id':'warningbetmax','value':'大额投注阈值(乐透彩票)'},
{'id':'warningbetmaxjc','value':'大额投注阈值(竞猜彩票)'},
{'id':'taxmaney','value':'税收阈值(乐透彩票)'},
{'id':'taxmaneyjk','value':'税收阈值(即开彩票)'},
{'id':'taxmoneyjc','value':'税收阈值(竞猜彩票)'},
{'id':'gainmoney','value':'领奖阈值(乐透彩票)'},
{'id':'gainmoneyjk','value':'领奖阈值(即开彩票)'},
{'id':'gainmoneyjc','value':'领奖阈值(竞猜彩票)'},
{'id':'taxpercent','value':'扣税百分比阈值(乐透彩票)'},
{'id':'taxpercentjk','value':'扣税百分比阈值(即开彩票)'},
{'id':'taxpercentjc','value':'扣税百分比阈值(竞猜彩票)'},
{'id':'autoOpenupTime','value':'自动刮开时间(即开彩票)'},
{'id':'bettingTime','value':'投注时段阈值'},
{'id':'amountNoPass','value':'小额免投注密码确认阈值'},
{'id':'congratsPriz','value':'即开刮开财神显示阈值'},
{'id':'totalBetAmountOfDay','value':'日总投注金额阈值'},
{'id':'totalBetNumberOfDay','value':'日总投注次数阈值'},
{'id':'totalBetNumberOfTime','value':'最大投注次数(含)阈值'}
];
var bankCode = [
{'id':'0030','value':'支付宝（山东海南）'},
{'id':'0031','value':'银联（海南）'},
{'id':'0012','value':'建行总行（山东,暂未上线）'},
{'id':'0013','value':'中行支付（海南）'},
{'id':'0014','value':'招行支付（山东,暂未上线）'},
];