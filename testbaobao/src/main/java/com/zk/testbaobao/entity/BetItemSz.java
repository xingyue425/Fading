package com.zk.testbaobao.entity;

public class BetItemSz {

    /**期号**/
    private String drawNo;

    /**投注内容   **/
    private String pick;

    /**是否追加 is_add**/
    private int flagAdd;

    /**投注方式   bet_way**/
    private String betWay;

    /**选注方式 默认自选 详见附录[字典项] selected_type**/
    private String selectedType;

    public String getDrawNo() {
        return drawNo;
    }

    public void setDrawNo(String drawNo) {
        this.drawNo = drawNo;
    }

    public String getPick() {
        return pick;
    }

    public void setPick(String pick) {
        this.pick = pick;
    }

    public int getFlagAdd() {
        return flagAdd;
    }

    public void setFlagAdd(int flagAdd) {
        this.flagAdd = flagAdd;
    }

    public String getBetWay() {
        return betWay;
    }

    public void setBetWay(String betWay) {
        this.betWay = betWay;
    }

    public String getSelectedType() {
        return selectedType;
    }

    public void setSelectedType(String selectedType) {
        this.selectedType = selectedType;
    }
}
