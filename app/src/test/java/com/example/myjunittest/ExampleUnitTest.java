package com.example.myjunittest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("测试类开始前");
    }

    @Before
    public void before(){
        System.out.println("测试方法开始前");
    }

    @Ignore
    @Test
    public void testIgnore() {
        System.out.println("忽略的方法");
    }

    @Test
    public void test() throws Exception {
        System.out.println("测试方法");
    }

    @After
    public void after(){
        System.out.println("测试方法结束后");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("测试类结束后");
    }

}