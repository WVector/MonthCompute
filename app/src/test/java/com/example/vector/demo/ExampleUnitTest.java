package com.example.vector.demo;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMddHHmmss");
    private SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMM");

    @Test
    public void addition_isCorrect() throws Exception {


        new Engine(28, 1).compute(new Date().getTime(), new Engine.Callback() {
            @Override
            public void billTime() {
                System.out.println("ExampleUnitTest.billTime");
            }

            @Override
            public void repaymentTime() {
                System.out.println("ExampleUnitTest.repaymentTime");

            }
        });

//        long currentTime = new Date().getTime();
//
//        System.out.println(sdf1.format(monthPlusDay(30, currentTime)));


        assertEquals(4, 2 + 2);
    }

    private long monthPlusDay(int day, long currentTime) {
        long currentMonth = currentMonth(currentTime);

        System.out.println("当月 ：" + currentMonth);

        long time = (long) (day - 1) * TimeConstants.DAY;

        System.out.println("毫秒数 " + time);

        return currentMonth + time;
    }

    private long currentMonth(long currentTime) {
        try {
            String substring = sdf1.format(currentTime).substring(0, 6);

            return sdf2.parse(substring).getTime();
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

}