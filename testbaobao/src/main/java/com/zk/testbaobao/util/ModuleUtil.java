/**
 * <br>项目名: promotion
 * <br>文件名: ModuleUtil.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.util;

import com.zk.testbaobao.constant.ConstantEntityForCmd;

/** 
 * <br>类 名: ModuleUtil 
 * <br>描 述: cmd与模块号匹配 
 * <br>作 者: zhaowei 
 * <br>创 建： 2016年8月4日 
 * <br>版 本：v1.0.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
public class ModuleUtil {
	public static String getModuleNoByCmd(String cmd){
		String module = "L1002";
		if (cmd.equals(ConstantEntityForCmd.BET_CMD)||cmd.equals(ConstantEntityForCmd.JC_BET_CMD)||cmd.equals(ConstantEntityForCmd.DIGITAL_BET_CMD)) {
			module = "L1001";
		}
		return module;
	}
}