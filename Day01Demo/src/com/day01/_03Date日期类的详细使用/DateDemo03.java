package com.itheima._03Date日期类的详细使用;

import java.util.Date;

/*
*  （2）Date(long time)
*       可以把时间毫秒值又转换成日期对象。
*
*/
public class DateDemo03 {
    public static void main(String[] args){
        // 需求： 121s后的时间是多少。
        Date d1 = new Date();
        System.out.println(d1);
        long cTime = d1.getTime();

        cTime+=121*1000;

        // 把时间毫秒值转换成日期对象
        Date d = new Date(cTime);
        System.out.println(d);

    }
}
