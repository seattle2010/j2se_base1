package com.junit.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathImplTest {
    private IMath math = new MathImpl();
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {
        int ret = math.add(1, 2);
        System.out.println(ret);
        //断言方法返回的结果是否和某一个值相等
        Assert.assertEquals("断言失败信息",3,ret);
    }

    @Test
    public void devide() {
        int ret = math.devide(4, 2);
        Assert.assertEquals("断言失败信息",2,ret);
    }

}