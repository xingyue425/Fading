package com.zk.testbaobao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetItemSz {
	/**期号**/
 	@JsonProperty("period")
	private String drawNo;

	/**投注内容   **/
	@JsonProperty("pick")
	private String pick;

 	/**是否追加 **/
 	@JsonProperty("is_add")
	private int flagAdd;

 	/**投注方式   **/
 	@JsonProperty("bet_way")
	private String betWay;

	/**选注方式 默认自选 详见附录[字典项]**/
	@JsonProperty("selected_type")
	private String selectedType;

	public String getSelectedType() {
		return selectedType;
	}

	public void setSelectedType(String selectedType) {
		this.selectedType = selectedType;
	}

	public String getDrawNo() {
		return drawNo;
	}
	public void setDrawNo(String drawNo) {
		this.drawNo = drawNo;
	}
	public int getFlagAdd() {
		return flagAdd;
	}
	public void setFlagAdd(int flagAdd) {
		this.flagAdd = flagAdd;
	}
	public String getPick() {
		return pick;
	}
	public void setPick(String pick) {
		this.pick = pick;
	}
	public String getBetWay() {
		return betWay;
	}
	public void setBetWay(String betWay) {
		this.betWay = betWay;
	}
 	
}
