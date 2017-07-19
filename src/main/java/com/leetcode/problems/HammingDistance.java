package com.leetcode.problems;

/**
 *
 * 汉明距离是使用在数据传输差错控制编码里面的，汉明距离是一个概念，它表示两个（相同长度）字对应位不同的数量，
 * 我们以d（x,y）表示两个字x,y之间的汉明距离。对两个字符串进行异或运算，并统计结果为1的个数，那么这个数就是汉明距离。
 *
 *
 * Input: x = 1, y = 4

 Output: 2

 Explanation:
 1   (0 0 0 1)
 4   (0 1 0 0)
 ?   ?

 The above arrows point to positions where the corresponding bits are different.
 * Created by Administrator on 2017/7/18.
 */
public class HammingDistance {

    public int hammingDistance(int x, int y) {
        if (x >= 0 && y < Math.pow(2, 31)) {
            int result = x ^ y;
            String binary = Integer.toBinaryString(result);
            int num = 0;
            for (int i = 0; i < binary.length();i++) {
                if ((Integer.valueOf(binary.charAt(i)) & 1) == 1) {
                    num++;
                }
            }
            return num;
        }
        return 0;
//        return Integer.bitCount(x ^ y);
    }

    public static void main(String[] args) {
        System.out.println(new HammingDistance().hammingDistance(0,1) +"");
    }

}
