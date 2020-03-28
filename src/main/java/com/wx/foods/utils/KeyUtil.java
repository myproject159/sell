package com.wx.foods.utils;

import java.util.Random;

/**
 * @author lwj
 * @date 2020/3/21 11:32
 */
public class KeyUtil {

    /**
     * 生成唯一主键
     * 格式： 时间+随机数
     * @return
     */
    public static String getUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
