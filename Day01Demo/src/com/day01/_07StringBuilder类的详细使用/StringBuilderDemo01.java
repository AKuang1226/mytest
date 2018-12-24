package com.itheima._07StringBuilder类的详细使用;
/*
* StringBuilder:
*    做字符串，拼接，插入 ，反转，删除等操作的。
*    StringBuilder做字符串运算的性能是比较好的，代码也比较优雅！
*
* String：不可变字符串
*    操作字符串的性能很差，会不断产生垃圾数据。
*
* */
public class StringBuilderDemo01 {
    public static void main(String[] args){
        String str = "itheima";
        str+="欢迎你"; // str = str + "欢迎你";
        str+="加入Java世界";
        System.out.println(str);

        // 创建一个StringBuilder对象
        StringBuilder sb = new StringBuilder();
        sb.append("ithiema"); // 拼接字符串
        sb.append("欢迎你"); // 拼接字符串
        sb.append("加入Java世界"); // 拼接字符串
        System.out.println(sb);

        // 简化写法！
        StringBuilder sb1 = new StringBuilder();
        // sb1 = sb1.append("ithiema"); // 拼接字符串又返回了sb1对象
        sb1.append("ithiema")
                .append("欢迎你")
                .append("加入Java世界")
                .append("！");// 拼接字符串
        //System.out.println(sb1);
        // 把StringBuilder对象sb1转成字符串rs
        String rs = sb1.toString();
        System.out.println(rs);
    }
}
