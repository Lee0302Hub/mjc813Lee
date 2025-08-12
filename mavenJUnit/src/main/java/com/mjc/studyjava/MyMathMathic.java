package com.mjc.studyjava;

public class MyMathMathic {
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a - b;
    }
    public long mul(int a, int b){
        return (long)a * b;
    }
    public int divM(int a, int b){
        return a / b;
    }
    public int divN(int a, int b){
        return a % b;
    }
    public boolean same(int a,int b){
        return a == b;
    }
    public boolean same(String a, String b){
        return a.equals(b);
    }
    public boolean notSame(int a, int b){
        return a != b;
    }
    public boolean big(int a,int b){
        return a > b;
    }
    public boolean small(int a,int b){
        return a < b;
    }
    public int shiftLeft(int a,byte b){
        return a << b;
    }
    public int shiftRight(int a, byte b){
        return a >> b;
    }
    public int shiftRight0(int a, byte b){
        return a >>> b;
    }
    public long square(int a, byte n) {
        long result = 1;
        for (int i = 0; i < n; i++) result *= a;
        return result;
    }

    public int absolute(int a) {
        return (a >= 0) ? a : -a;
    }

    public String toHex(int a) { return Integer.toHexString(a); }
    public String toBin(int a) { return Integer.toBinaryString(a); }
    public String toOct(int a) { return Integer.toOctalString(a); }

    public int toDec(String s) {
        if (s == null || s.isEmpty()) throw new IllegalArgumentException("null or empty");
        if (s.startsWith("0x") || s.startsWith("0X"))
            return Integer.parseInt(s.substring(2), 16);
        if (s.startsWith("0b") || s.startsWith("0B"))
            return Integer.parseInt(s.substring(2), 2);
        if (s.startsWith("0") && s.length() > 1)
            return Integer.parseInt(s.substring(1), 8);
        return Integer.parseInt(s);
    }
}

