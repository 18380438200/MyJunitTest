package com.example.myjunittest;

import android.util.Log;
import android.widget.Toast;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by apple on 18/2/9.
 */

public class DateTest {
    private String time;

    @Before
    public void beforeTest(){
        time = "2018-2-9 20:13:14";
        System.out.println("测试开始");
    }

    @Test
    public void dateToStamp(){
        long timeStamp = DateUtil.dateToTimestamp(time);
        System.out.println(timeStamp);
    }

    @After
    public void afterTest(){
        System.out.println("测试结束");
    }

}
