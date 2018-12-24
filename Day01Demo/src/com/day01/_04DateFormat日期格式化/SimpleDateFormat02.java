package com.itheima._04DateFormat日期格式化;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* 解析字符串的时间: parse(String s)
*       //  把字符串时间解析成一个Date日期对象。
        // 注意点：简单日期格式化对象的参数格式必须与被解析时间的格式完全一致，否则解析出错。
        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 通过简单日期格式化对象把字符串时间解析成Date日期对象
        Date d = sdf.parse(timeStr);
*
* 面试题：
*    随便给你一个时间“2018-09-09 10:48:21”请问
*    23小时12分54s后是什么时间？请格式化输出。
* 解题思路：
*    (1)先定义一个字符串时间“2018-09-09 10:48:21”。
*    (2)把字符串时间解析成一个Date日期对象。
*    (3)得到当前日期对象的时间毫秒值。
*    (4)把时间毫秒值往后走 23小时12分54s。
*    (5)把时间毫秒值格式化成标准时间格式输出即可。
*
* */
public class SimpleDateFormat02 {
    public static void main(String[] args) throws ParseException {
        // (1)先定义一个字符串时间“2018-09-09 10:48:21”。
        String timeStr = "2018-09-09 10:48:21";

        // (2)把字符串时间解析成一个Date日期对象。
        // 注意点：简单日期格式化对象的参数格式必须与被解析时间的格式完全一致，否则解析出错。
        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 通过简单日期格式化对象把字符串时间解析成Date日期对象
        Date d = sdf.parse(timeStr);
        System.out.println(d);

        // (3)得到当前日期d对象的时间毫秒值。
        long t = d.getTime();
        System.out.println(t);

        // (4)把时间毫秒值往后走 23小时12分54s。
        t+=(23*60*60*1000 + 12*60*1000 + 54*1000);

        // (5)把时间毫秒值格式化成标准时间格式输出即可。
        System.out.println(sdf.format(t));
    }
}
