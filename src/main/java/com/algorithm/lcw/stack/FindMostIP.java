package com.algorithm.lcw.stack;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * 查找出现次数最多的IP.
 * https://www.lintcode.com/problem/highest-frequency-ip/description
 */
public class FindMostIP {

    public static void main(String[] args) {
        Date date = new Date(System.currentTimeMillis()); // 2014-1-31 21:20:50
        //String dateStr = "2019-11-25 11:07:50";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));
        String dateStrTmp = dateFormat.format(date);
        System.out.println(dateStrTmp);
        try {
            Date dateTmp = dateFormat.parse(dateStrTmp);
            System.out.println(dateTmp);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
