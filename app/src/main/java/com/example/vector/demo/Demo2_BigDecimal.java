package com.example.vector.demo;

import java.math.BigDecimal;

public class Demo2_BigDecimal {

    /**
     * 1.��������
     * BigDecimal(double);						//��������,����������ȷ
     * BigDecimal(String);						//����,����ÿ�ζ�Ҫ���ַ��������캯��
     * static BigDecimal valueOf(double)		//����,���ҿ���ֱ�Ӵ�double��
     * ��Ϊdouble���ǲ���ȷ,�����޽ӽ��Ǹ���,��BigDemal�����������侫ȷ
     */
    public static void main(String[] args) {
        demo1();
        demo2();
    }

    private static void demo2() {
        BigDecimal bi1 = new BigDecimal("100");
        BigDecimal bi2 = new BigDecimal("2");
        System.out.println(bi1.add(bi2));                //��
        System.out.println(bi1.subtract(bi2));            //��
        System.out.println(bi1.multiply(bi2));            //��
        System.out.println(bi1.divide(bi2));            //��
    }

    private static void demo1() {
        BigDecimal bi1 = new BigDecimal("2.0");
        BigDecimal bi2 = new BigDecimal("1.1");

        System.out.println(bi1.subtract(bi2));

        BigDecimal bi3 = BigDecimal.valueOf(2.0);
        BigDecimal bi4 = BigDecimal.valueOf(1.1);

        System.out.println(bi3.subtract(bi4));
    }

}
