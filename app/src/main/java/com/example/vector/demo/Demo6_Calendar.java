package com.example.vector.demo;

import java.util.Calendar;

public class Demo6_Calendar {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //demo1();
        Calendar c = Calendar.getInstance();

        //c.add(Calendar.MONTH, -1);				//add�������Խ������ֶ�,������ǰ����,����ڶ���������������,������,����ڶ��������Ǹ�������ǰ��
        //c.set(Calendar.YEAR, 2002);				//�޸�ָ���ֶ�
        c.set(2008, 7, 8);                            //����������
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        int week = c.get(Calendar.DAY_OF_WEEK);

        System.out.println(year + "��" + getNum(month + 1) + "��" + getNum(day) + "�� ����" + getWeek(week));
    }

    public static String getWeek(int week) {
        String[] arr = {"", "��", "һ", "��", "��", "��", "��", "��"};
        return arr[week];
    }

    public static String getNum(int num) {
        /*if(num > 9) {
			return num+"";
		}else {
			return "0"+num;
		}*/

        return num > 9 ? num + "" : "0" + num;
    }

    private static void demo1() {
        Calendar c = Calendar.getInstance();
        int x = c.get(Calendar.YEAR);
        int y = c.get(2);
        int z = c.get(3);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

}
