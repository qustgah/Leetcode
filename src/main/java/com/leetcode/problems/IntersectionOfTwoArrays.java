package com.leetcode.problems;

import java.util.Arrays;

/**
 * Given two arrays, write a function to compute their intersection.

 Example:
 Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

 Note:
 Each element in the result must be unique.
 The result can be in any order.
 *
 *
 * Created by Administrator on 2017/7/19.
 */
public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
//        List<Integer> list1 = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//        for (int i = 0; i < nums1.length; i++) {
//            if (!list1.contains(nums1[i])) {
//                list1.add(nums1[i]);
//            }
//        }
//        for (int i = 0; i < nums2.length; i++) {
//            if (!list2.contains(nums2[i])) {
//                list2.add(nums2[i]);
//            }
//        }
//        Iterator iterator = list1.iterator();
//        while (iterator.hasNext()) {
//            int num = (int) iterator.next();
//            if (!list2.contains(num)) {
//                iterator.remove();
//            }
//        }
//        int[] result = new int[list1.size()];
//        for (int i = 0; i < list1.size(); i++) {
//            result[i] = list1.get(i);
//        }
//        return result;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] results = new int[Math.min(nums1.length, nums2.length)];
        int idx = -1;

        for (int i = 0, j = 0; i < nums1.length && j < nums2.length;) {
            if (nums1[i] < nums2[j]) i++;
            else if (nums2[j] < nums1[i]) j++;
            else {
                if (idx < 0 || results[idx] != nums1[i]) {
                    results[++idx] = nums1[i];
                }
                i++;
                j++;
            }
        }
        return Arrays.copyOfRange(results, 0, idx + 1);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1};
        int[] result = new IntersectionOfTwoArrays().intersection(a,b);
        System.out.println("Hello World!" + result.length);
    }
}
