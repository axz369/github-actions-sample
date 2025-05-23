package com.example.tdd;

public class ExerciseMath {

    public static final int MAX_VALUE = 13;

    public static int factorial(int n) {

        if(lessThan0(n)){
            throw new IllegalArgumentException("0以下の値は不正です。");
        }
        if(n >= MAX_VALUE){
            throw new IllegalArgumentException("13以上の値は不正です。");
        }

        return kaizyou(n);
    }

    private static boolean lessThan0(int n) {
        return n <= 0;
    }

    private static int kaizyou(int n) {
        int ans = 1;
        for(int i = 2; i<= n; i++){
            ans *= i;
        }
        return ans;
    }
}
