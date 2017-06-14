package com.example.vector.demo;

import java.util.Date;

public class Demo3_Date {

    /**
     * @param args 1406964816091
     */
    public static void main(String[] args) {
        //demo1();
        Date d = new Date(1406964816091L);        //ͨ������ֵ��ȡʱ�����
        System.out.println(d);

        Date d2 = new Date();                    //�ȴ���ʱ�����
        d2.setTime(1406964816091L);                //�޸�ʱ�����
        System.out.println(d2);
    }

    private static void demo1() {
        Date d = new Date();
        long time1 = d.getTime();                //ͨ��ʱ������ȡ��Ӧ�ĺ���ֵ
        System.out.println(time1);

        long time2 = System.currentTimeMillis();//��ȡ��ǰʱ��ĺ���ֵ
        System.out.println(time2);
    }

}
