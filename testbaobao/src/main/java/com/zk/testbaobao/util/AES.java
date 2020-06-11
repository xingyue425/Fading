package com.zk.testbaobao.util;



import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;

public class AES {
	private static java.lang.String algorithm = "AES";

	public static String asHex(byte[] bin) {
		StringBuffer bfHex = new StringBuffer(bin.length * 2);
		int i;
		for (i = 0; i < bin.length; i++) {
			if (((int) bin[i] & 0xff) < 0x10)
				bfHex.append("0");
			bfHex.append(Long.toString((int) bin[i] & 0xff, 16));
		}
		return bfHex.toString();
	}

	public static byte[] asBin(String hex) {
		if (hex.length() < 1)
			return null;
		byte[] bin = new byte[hex.length() / 2];
		for (int i = 0; i < hex.length() / 2; i++) {
			int high = Integer.parseInt(hex.substring(i * 2, i * 2 + 1), 16);
			int low = Integer.parseInt(hex.substring(i * 2 + 1, i * 2 + 2), 16);
			bin[i] = (byte) (high * 16 + low);
		}
		return bin;
	}

	public static byte[] getKey(int len) {
		try {
			KeyGenerator kgen = KeyGenerator.getInstance(algorithm);
			kgen.init(len); // 192 and 256 bits may not be available
			SecretKey skey = kgen.generateKey();
			return skey.getEncoded();
		} catch (Exception e) {
			return null;
		}
	}
	public static byte[] getKey(String key) {
		try {
			KeyGenerator kgen = KeyGenerator.getInstance(algorithm);
			kgen.init(128, new SecureRandom(key.getBytes()));
			SecretKey skey = kgen.generateKey();
			return skey.getEncoded();
		} catch (Exception e) {
			return null;
		}
	}
	public static byte[] doEncrypt(byte[] message, byte[] key) {
		try {
			SecretKeySpec skeySpec = new SecretKeySpec(key, algorithm);
			Cipher cipher = Cipher.getInstance(algorithm);// Cipher.getInstance("AES/ECB/NoPadding");//
			cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
			return cipher.doFinal(message);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static byte[] doDecrypt(byte[] encrypted, byte[] key) {
		try {
			SecretKeySpec skeySpec = new SecretKeySpec(key, algorithm);
			Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
//		    Cipher cipher = Cipher.getInstance(algorithm);
			cipher.init(Cipher.DECRYPT_MODE, skeySpec);
			return cipher.doFinal(encrypted);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	 

}
