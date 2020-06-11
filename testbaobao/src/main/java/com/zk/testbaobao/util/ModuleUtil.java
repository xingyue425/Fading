/**
 * <br>项目名: promotion
 * <br>文件名: ModuleUtil.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.util;

import com.zk.testbaobao.constant.ConstantEntityForCmd;


public class ModuleUtil {
	public static String getModuleNoByCmd(String cmd){
		String module = "L1002";
		if (cmd.equals(ConstantEntityForCmd.BET_CMD)||cmd.equals(ConstantEntityForCmd.JC_BET_CMD)||cmd.equals(ConstantEntityForCmd.DIGITAL_BET_CMD)) {
			module = "L1001";
		}
		return module;
	}
}