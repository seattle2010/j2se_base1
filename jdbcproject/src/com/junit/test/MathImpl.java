package com.junit.test;

public class MathImpl implements IMath{

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int devide(int a, int b) {
        return a/b;
    }
}
