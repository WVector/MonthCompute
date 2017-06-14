package com.example.vector.demo;

public class Demo7_Math {

    /**
     * �ṩ��һЩ����ѧ������صķ���,
     * static double PI  				//��ȡ��(��)��ֵ
     * static double floor(double a) 	//��С�ڵ���a���doubleֵ�����������Ӧ��doubleֵ
     * static double ceil(double a)  	//�Ǵ��ڵ���a���doubleֵ����С������Ӧ��doubleֵ
     * static long round(double a ) 	//��������,������һ��longֵ
     * static double sqrt(double a) 	//��ƽ��
     * static double pow(double a, double b) //a�ǵ���,b��ָ�����ص���a��b����
     * <p>
     * 16.0
     * 15.3
     * 15.0
     */
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.floor(15.6));
        System.out.println(Math.floor(15.3));
        System.out.println(Math.ceil(15.6));
        System.out.println(Math.ceil(15.3));
        System.out.println(Math.round(15.6));
        System.out.println(Math.round(15.3));
        System.out.println(Math.sqrt(2));
        System.out.println(Math.pow(2.0, 3.0));
    }

}
