package com.example;

public class MathUtil {

    /**
     * num1のnum2城を求める.
     *
     * @param num1 ベースになる数
     * @param num2 指数
     * @return num1のnum2乗
     * @throws IllegalArgumentException num1またはnum2が100以上の時に発生する (この時例外オブジェクトには「100以上の値は不正です」と含める)
     */
    public static double power(int num1, int num2)  {
        if(num1 >= 100 || num2 >= 100){
            throw new IllegalArgumentException("100以上の値は不正です");
        }
        //return Math.pow(num1, num2);
        return 0;
    }
}
