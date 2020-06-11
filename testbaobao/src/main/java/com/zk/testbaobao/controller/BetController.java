package com.zk.testbaobao.controller;

import com.zk.testbaobao.entity.BetParam;
import com.zk.testbaobao.util.MD5;
import com.zk.testbaobao.util.SecurityUtil;

public class BetController {

    private static String secretKey="";
    private static String requestUrl="";
    //agent/bettingOneStep
    private static String requestPrefix="agent";

    public String bet(BetParam param){

        String pass=param.getAccPass();
        param.setAccPass(MD5.mD5Encode(pass));
        //首先需要将param转化成json 不能为空
        String jsonParam="";
        //获取secretKey 不能为空
        //获取url 不能为空
        //agentNo不能为空
        try {
            byte[] encrptOutJson = SecurityUtil.doEncrypt(jsonParam, secretKey);
            String token="";//会话产生的一个东东
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
