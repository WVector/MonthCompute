package com.example.vector.demo;

import java.text.DateFormat;
import java.util.Date;

public class Demo4_DateFormat {

    /**
     * @param args
     */
    public static void main(String[] args) {
//		demo1();
        demo2();
    }

    private static void demo2() {
        Date d = new Date();
        DateFormat df1 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
        DateFormat df2 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        System.out.println(df1.format(d));
        System.out.println(df2.format(d));
    }

    private static void demo1() {
        Date d = new Date();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL);//2014��8��2�� ������
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG);//2014��8��2��
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.MEDIUM);//2014-8-2
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.SHORT);//14-8-2
        System.out.println(df1.format(d));
        System.out.println(df2.format(d));
        System.out.println(df3.format(d));
        System.out.println(df4.format(d));
    }

}
