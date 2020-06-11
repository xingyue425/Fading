package com.zk.testbaobao.entity;

public class PickContentReq {

    /**赛事ID match_id**/
    private String matchId;
    /**奖池玩法标示 pool_logic_code**/
    private String poolLogicCode;
    /**投注内容**/
    private String content;
    public String getMatchId() {
        return matchId;
    }
    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }
    public String getPoolLogicCode() {
        return poolLogicCode;
    }
    public void setPoolLogicCode(String poolLogicCode) {
        this.poolLogicCode = poolLogicCode;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
