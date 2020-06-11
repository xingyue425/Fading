package com.zk.testbaobao.config;

import com.zk.testbaobao.util.SpringContextHolder;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.context.MessageSource;

import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 * User: swen
 * Date: 13-10-9
 * Time: 上午10:56
 * To change this template use File | Settings | File Templates.
 */
public class ResourceUtils {
    public static MessageSource messageSource = null;

    public static MessageSource getMessageSource() {
        if (messageSource != null) {
            return messageSource;
        }
        try {
            return SpringContextHolder.getBean("messageSource");
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }

    public static String getString(String key, Object... objects) {
        messageSource = getMessageSource();
        if (messageSource == null || key == null) {
            return "";
        }
        String result = messageSource.getMessage(key, objects, Locale.getDefault());
        if (key.equals(result)) {
            return "";
        }
        return result;
    }


    public static String getString(String key) {
        return getString(key, "");
    }

    public static int getInt(String key) {
        return NumberUtils.toInt(getString(key, ""));
    }

    public static int getInt(String key, int defaultValue) {
        return NumberUtils.toInt(getString(key, ""), defaultValue);
    }

    public static double getDouble(String key, double defaultValue) {
        return NumberUtils.toDouble(getString(key, ""), defaultValue);
    }

    public static double getDouble(String key) {
        return NumberUtils.toDouble(getString(key, ""));
    }

    public static long getLong(String key) {
        return NumberUtils.toLong(getString(key, ""));
    }

    public static long getLong(String key, long defaultValue) {
        return NumberUtils.toLong(getString(key, ""), defaultValue);
    }

    public static boolean getBoolean(String key) {
        return BooleanUtils.toBoolean(getString(key, ""));
    }

    public static String[] getStringArray(String key, String deim) {
        String ss = getString(key, "");
        if (deim == null) {
            deim = ",";
        }
        if (ss != null) return StringUtils.split(ss, deim);

        return new String[0];
    }

}
