package com.leetcode.problems;

/**
 * Created by Administrator on 2016/12/21.
 */
public class IntegerBreak {
    public int integerbreak(int n){
        int i = n / 3 + 2 ;
        int j = n % 3 + 1;
        int result = 1;
        for (int i1 = 0; i1 < i; i1++) {
            result = j * result;
        }
        return result;
    }

    public static void main(String[] args) {
        int i = new IntegerBreak().integerbreak(3);
        System.out.println("Hello World!" + i);
    }
}
