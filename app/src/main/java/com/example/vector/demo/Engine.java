package com.example.vector.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Vector
 * on 2017/6/14.
 */

public class Engine {

    private int billDay;
    private int repaymentDay;
    private SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMddHHmmss");
    private SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMM");


    public Engine(int billDay, int repaymentDay) {
        this.billDay = billDay;
        this.repaymentDay = repaymentDay;
    }

    public void compute(long currentTime, Callback callback) {

        if (callback == null) {
            return;
        }
        long billTime = monthPlusDay(billDay, currentTime);
        long repaymentTime = monthPlusDay(repaymentDay, currentTime);

        long monthEnd = computeMonth(currentMonth(currentTime), 1);
        long monthStart = currentMonth(currentTime);


        System.out.println("账单日：" + sdf1.format(billTime));
        System.out.println("还款日：" + sdf1.format(repaymentTime));
        System.out.println("月初：" + sdf1.format(monthStart));
        System.out.println("月末：" + sdf1.format(monthEnd));

        //隔月
        if (billDay >= repaymentDay) {

            //当前大于  上个月的还款日


            if (currentTime >= repaymentTime && currentTime < billTime) {
                //过了还款日  没有过出账日  出账期


                callback.billTime();


//            }

//            else if (currentTime >= billTime && currentTime < monthEnd) {
//                //过了出账日  没有过 下一次的还款日  也就是还款期
//
//                callback.repaymentTime();
//
            } else

            {
                callback.repaymentTime();
            }


        } else {



            //一个月内


            if (currentTime >= billTime && currentTime < repaymentTime) {
                //过了出账日  没有过 下一次的还款日  也就是还款期

                callback.repaymentTime();


            }
//            else if (currentTime >= repaymentTime && currentTime < monthEnd) {
//
////过了还款日  没有过出账日  出账期
//
//                callback.billTime();
//
//            }

            else {
                callback.billTime();
            }


        }

    }

    private long monthPlusDay(int day, long currentTime) {
        return currentMonth(currentTime) + (long) (day - 1) * TimeConstants.DAY;
    }

    private long currentMonth(long currentTime) {
        try {
            return sdf2.parse(sdf1.format(currentTime).substring(0, 6)).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return currentTime;
    }

    private long computeMonth(long currentTime, int months) {
        Date date = new Date(currentTime);
        date.setMonth(date.getMonth() + months);
        return date.getTime();
    }


    interface Callback {
        void billTime();

        void repaymentTime();
    }

}
