package com.zk.testbaobao.entity;

/**
 * 发送到中心请求的参数信息
 */
public class BetParam {

    //代销者编号
    private String agentNo;
    //1-竞彩   2-足彩   3-周期型   4-即开
    private String oneStepBetPdType;
    //代销者流水号
    private String betSn;
    //玩法编号
    private String logicCode;
    //投注账号
    private String bettingNo;
    //接入区域编号
    private String serverAreaCode;

    /**投注密码(数字) (MD5加密32位) (海南在线客户端可为空，其他接入方非空且代销者流水号非空)**/
    private String accPass;

    /**用户手机号，监控需要**/
    private String mobile;

    /**投注数量(即开：现在仅支持单张)**/
    private int betNum;

    /**投注倍数**/
    private int multiple = 1;

    /**投注总额(分)**/
    private long amount = -1L;

    /**是否使用奖金 flag_transfer**/
    private int flagTransfer;

    /**红包金额(分) bonus_amount**/
    private long bonusAmount = -1L;

    /**红包流水号 若红包金额非空，该字段也非空，仅供对账统计使用，无特殊意义 bonus_id**/
    private String bonusId;

    /**活动ID 若红包金额非空，该字段也非空，仅供对账统计使用，无特殊意义 activity_id**/
    private String activityId;

    /**数字、传统足彩一步投注信息 bet_item_sz**/
    private BetItemSz betItemSz;

    /**竞猜型彩票一步投注信息 bet_item_jc**/
    private BetItemJc betItemJc;

    public String getAgentNo() {
        return agentNo;
    }

    public void setAgentNo(String agentNo) {
        this.agentNo = agentNo;
    }

    public String getOneStepBetPdType() {
        return oneStepBetPdType;
    }

    public void setOneStepBetPdType(String oneStepBetPdType) {
        this.oneStepBetPdType = oneStepBetPdType;
    }

    public String getBetSn() {
        return betSn;
    }

    public void setBetSn(String betSn) {
        this.betSn = betSn;
    }

    public String getLogicCode() {
        return logicCode;
    }

    public void setLogicCode(String logicCode) {
        this.logicCode = logicCode;
    }

    public String getBettingNo() {
        return bettingNo;
    }

    public void setBettingNo(String bettingNo) {
        this.bettingNo = bettingNo;
    }

    public String getServerAreaCode() {
        return serverAreaCode;
    }

    public void setServerAreaCode(String serverAreaCode) {
        this.serverAreaCode = serverAreaCode;
    }

    public String getAccPass() {
        return accPass;
    }

    public void setAccPass(String accPass) {
        this.accPass = accPass;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getBetNum() {
        return betNum;
    }

    public void setBetNum(int betNum) {
        this.betNum = betNum;
    }

    public int getMultiple() {
        return multiple;
    }

    public void setMultiple(int multiple) {
        this.multiple = multiple;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public int getFlagTransfer() {
        return flagTransfer;
    }

    public void setFlagTransfer(int flagTransfer) {
        this.flagTransfer = flagTransfer;
    }

    public long getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(long bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    public String getBonusId() {
        return bonusId;
    }

    public void setBonusId(String bonusId) {
        this.bonusId = bonusId;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public BetItemSz getBetItemSz() {
        return betItemSz;
    }

    public void setBetItemSz(BetItemSz betItemSz) {
        this.betItemSz = betItemSz;
    }

    public BetItemJc getBetItemJc() {
        return betItemJc;
    }

    public void setBetItemJc(BetItemJc betItemJc) {
        this.betItemJc = betItemJc;
    }
}
