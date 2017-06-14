package com.example.vector.demo;

import java.math.BigInteger;

public class Demo1_BigInteger {

    /**
     * @param args
     */
    public static void main(String[] args) {
//		long x = 1234567890987654321123L;
        String str = "12345678909876543211234567890";
        BigInteger bi1 = new BigInteger(str);
        BigInteger bi2 = new BigInteger("2");
        System.out.println(bi1.add(bi2));
        System.out.println(bi1.subtract(bi2));
        System.out.println(bi1.multiply(bi2));
        System.out.println(bi1.divide(bi2));
    }

}
