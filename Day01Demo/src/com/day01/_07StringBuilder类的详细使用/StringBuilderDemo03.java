package com.itheima._07StringBuilder类的详细使用;
/*
* 插入，删除，反转等
*
* StringBuilder :
* StringBuffer :
*    功能是完全一样的！
*    性能不一样：StringBuilder是线程不安全的性能好
*              StringBuffer是线程安全的性能好
*
* */
public class StringBuilderDemo03 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        sb.append("itheima");
        sb.append("欢迎你");

        //sb.reverse(); // 反转内容
        // 从第2个索引位置开始插入java.
        sb.insert(2,"java");
        // 从第一个开始删除到第二个位置的前一个位置
       sb.delete(0,2); // 包前不包后！
        System.out.println(sb);
    }
}
