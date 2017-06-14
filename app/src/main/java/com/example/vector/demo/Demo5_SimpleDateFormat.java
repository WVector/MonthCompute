package com.example.vector.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Demo5_SimpleDateFormat {

    /**
     * @param args
     * @throws ParseException
     */
    public static void main(String[] args) throws ParseException {
        demo1();
//		String time = "2014��8��2�� 16:22:30";
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
//		Date d = sdf.parse(time);					//��ʱ���ַ���ת��Ϊ����
//		System.out.println(d);
    }

    private static void demo1() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(System.currentTimeMillis()));
    }

}
