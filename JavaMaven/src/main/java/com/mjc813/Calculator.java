package com.mjc813;

public class Calculator {

    public int add(int x, int y) {
        return x+y;
    }
    public int sub(int x, int y) {
        return x - y;
    }
    public int mul(int x, int y) {
        return x*y;
    }
    public int div(int x, int y) {
        return x/y;
    }
    public int suq(int x, int y) {
        int suqare = 0;
        for(int i = 0; i < y; i++) {
            suqare += x*y;
        }
        return suqare;
    }
    public int SumArr(int[] x) {
        int sum = 0;
        for(int i  : x) {
            sum += x[i];
        }
        return sum;
    }
}
