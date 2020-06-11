/**
 * <br>项目名: promotion
 * <br>文件名: BaseLogout.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * <br>类 名: BaseAgent 
 * <br>描 述: 获取代销者信息
 * <br>作 者: fanweilong 
 * <br>创 建： 2017年1月17日 
 * <br>版 本：v1.8.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
@JsonIgnoreProperties({"agentNo"})
public class BaseAgent extends RequestModel{

}
