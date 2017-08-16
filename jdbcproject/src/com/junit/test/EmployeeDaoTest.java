package com.junit.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmployeeDaoTest {
    @After
    public void destroy() throws Exception {
    System.out.println("销毁");
    }

    @Before
    public void init() throws Exception {
        System.out.println("初始化");
    }
    @Test
    public void testSave() throws Exception {
    System.out.println("save"); 
    }
    @Test
    public void testDelete() throws Exception {
    System.out.println("del");

    }
    
}
