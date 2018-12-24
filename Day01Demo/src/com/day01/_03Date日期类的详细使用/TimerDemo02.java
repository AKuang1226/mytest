package com.itheima._03Date日期类的详细使用;

import java.util.Date;

/*
* 时间毫秒值的应用：做代码执行性能的统计
* */
public class TimerDemo02 {
    public static void main(String[] args){
        // 先得到系统当前此刻日期对象
        Date d = new Date();
        // 得到当前此刻时间的时间毫秒值
        long startTimer = d.getTime();

        for(int i = 0 ; i < 10000 ; i++ ) {
            System.out.println("输出："+i);
        }

        // 先得到系统当前此刻日期对象
        Date d1 = new Date();
        // 得到当前此刻时间的时间毫秒值
        long endTimer = d1.getTime();
        System.out.println(endTimer - startTimer);
    }
}
