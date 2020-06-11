package com.zk.testbaobao.util;

import org.springframework.util.StringUtils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
	
	public synchronized static final byte[] toMd5(String data,
                                                  String encodingType) {
		MessageDigest digest = null;
		if (digest == null) {
			try {
				digest = MessageDigest.getInstance("MD5");
			} catch (NoSuchAlgorithmException nsae) {
				System.err.println("Failed to load the MD5 MessageDigest. ");
				nsae.printStackTrace();
			}
		}
		if (StringUtils.isEmpty(data)) {
			return null;
		}
		try {
			digest.update(data.getBytes(encodingType));
		} catch (UnsupportedEncodingException e) {
			digest.update(data.getBytes());
		}
		return digest.digest();
	}

	public static String mD5Encode(String origin) {
		byte[] md5Bytes = toMd5(origin,"UTF-8");
		return asHex(md5Bytes);
	}

	public static String asHex(byte buf[]) {
		if (buf == null) {
			return "";
		}
		// buf.length * 2 字节数组转化为16进制需乘以2
		StringBuffer strbuf = new StringBuffer(buf.length * 2);
		int i;
		for (i = 0; i < buf.length; i++) {
			if (((int) buf[i] & 0xff) < 0x10)
				strbuf.append("0");// 若buf[i] & 0xff在10以内加0
			strbuf.append(Long.toString((int) buf[i] & 0xff, 16));
		}
		return strbuf.toString();
	}

}
