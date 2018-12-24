package com.itheima._02Objects类的使用;

import java.util.Objects;

/*
* Objects类：
*   属于JDK 1.7以后的新技术。
*
*   (1) equals
*       public static boolean equals(Object a, Object b)
*   (2) hash(后面讲！)
*
*/
public class ObjectsDemo01 {
    public static void main(String[] args){

        Student swk = new Student();
        Student swk1 = new Student();
        // 默认也是比较两个对象的地址是否一样！
        System.out.println(Objects.equals(swk,swk1));

       /*
        public static Object requireNonNull(Object obj):
        判断obj是否为null，如果不为null，则不抛异常，将对象obj作为返回值返回。
        如果obj为null则抛出异常。
        */
       String name = "itheima" ;
       Object rs = Objects.requireNonNull(name);
       System.out.println(rs);

       /*
        *public static boolean isNull(Object obj)
        * 从JDK 1.8以后才可以使用
        * 判断对象是否为null ,为null返回true
        */
       String name1 = null ;
       System.out.println(Objects.isNull(name1));

    }
}
