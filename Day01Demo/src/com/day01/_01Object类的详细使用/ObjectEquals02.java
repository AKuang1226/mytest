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
 *           默认是用于比较两个变量指向的是否是同一个对象。
 *           默认是比较两个对象的地址是否一样。
 *
 *           如果只是比较两个对象的地址是否一样，完全没有必要用
 *           equals，因为==完全可以替代它。
 *
 *           所以equals存在的意义也是为了被子类重写，以便自己
 *           来指定比较的规则。
 *
 *           需求：
 *              只要学生的名字，年龄，性别一样就认为是同一个对象。
 *
 *           字符串的比较（特例）：
 *              字符串的比较应该使用equals来进行比较，这是最好的方式。
 *              equals比较字符串，只关心字符串的内容是否一样。
 */
public class ObjectEquals02 {
    public static void main(String[] args){
        // 创建一个学生对象
        Student swk  = new Student("孙悟空",1000,'雄');
        Student swk1 = new Student("孙悟空",1000,'雄');
        // 创建一个学生对象
        Student zzj = new Student("紫霞仙子",1111,'女');

        // 默认比较两个对象的地址是否一样，一样返回true ,反之
        //System.out.println(swk.equals(zzj));
        System.out.println(swk.equals(swk1));
       // System.out.println(swk == zzj);

        String name = "itheima";
        System.out.println(name.equals("itheima"));

        String name1 = new String("itheima");
        String name2 = new String("itheima");
        // System.out.println(name1 == name2);
        System.out.println(name1.equals(name));


    }
}
