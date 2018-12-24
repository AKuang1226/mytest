package com.itheima._01Object类的详细使用;
/*
*  Object类：
*     是Java中一切类的父类。
*     一个类要么默认继承了Object类,一个类要么间接继承了Object类。
*     所以Object类是Java中所有类的祖宗类。
*
*     所以学习Object类中的方法，那么一切类都可以使用这些方法。
*
*  Object类的中常用方法：
*      （1）toString方法。
*           -- public String toString()
*           默认是返回当前对象在堆内存中的地址。
*           返回的地址格式：当前类的全限名@内存地址
*           如果直接输出对象，对象默认会调用自己的toString()方法,此时可以省略调用toString()方法
*
*           如果直接输出对象，输出对象的地址意义是不大的。
*           开发的时候，输出对象大多时候并不希望看到的是对象在
*           堆内存中的地址，更多的时候希望看到该对象的具体数据。
*
*           所以toString()方法存在的意义是为了被重写，以便输出该对象的数据。
*
*      （2）equlas方法。
*           -- public boolean equals(Object obj)
*
*/
public class ObjectToString01  {
    public static void main(String[] args){
        // 1.创建一个学生对象
        Student cx = new Student("蔡欣",20,'男');

        /* String rs = cx.toString();
           System.out.println(rs);  */

       System.out.println(cx.toString());

       // 如果直接输出对象，对象默认会调用自己的toString()方法
        // 此时可以省略调用toString()方法
       System.out.println(cx);
    }
}
