package com.zk.testbaobao.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecurityUtil {

	private static final Logger log = LoggerFactory
			.getLogger(SecurityUtil.class);

	public static String doDecrypt(String encrypted, String key)
			throws Exception {
		return doDecrypt(AES.asBin(encrypted), key);
	}
	
	public static String doDecrypt(byte[] encrypted, String key) throws Exception {
		if (encrypted == null || encrypted.length<=0|| key==null) {
			return null;
		}
		try {
			byte[] byteKey = AES.asBin(key);
			byte[] byteDecrypted = AES.doDecrypt(encrypted, byteKey);
			return new String(byteDecrypted).trim();
		}catch(Exception e) {
			log.error(e.getMessage(), e);
			throw new Exception("解密异常");
		}
	}

	public static byte[] doEncrypt(String original, String key)
			throws Exception {
		try {
			byte[] byteKey = AES.asBin(key);
			if (original != null && original.trim().length() > 0) {
				byte[] byteEncrypted = AES.doEncrypt(
						original.getBytes("UTF-8"), byteKey);
				return byteEncrypted;
			}
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new Exception("加密异常");
		}
		return null;
	}

	public static String encrypt(String original, String key) throws Exception {
		try {
			byte[] encrypted = doEncrypt(original, key);
			return AES.asHex(encrypted);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			e.printStackTrace();
			throw new Exception("加密异常");
		}
	}
	

}
