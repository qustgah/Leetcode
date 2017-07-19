package com.leetcode.problems;

/**
 * Created by Administrator on 2017/7/19.
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
//        if (ransomNote != null && magazine != null) {
//            if (ransomNote.length() > magazine.length()) {
//                return false;
//            } else {
//                char[] a = ransomNote.toCharArray();
//                Arrays.sort(a);
//                char[] b = magazine.toCharArray();
//                Arrays.sort(b);
//                int index = 0;
//                for (int i= 0 , j = 0; i<a.length&& j < b.length;) {
//                    if (a[i] == b[j]){
//                        i++ ;
//                        j++ ;
//                        index = i;
//                    }else if (a[i] != b[j]){
//                        j++;
//                    }
//                }
//                if (index == a.length) {
//                    return true;
//                }
//            }
//        }
//        return false;
        int[] count = new int[26];
        for(char x: ransomNote.toCharArray()){
            if(magazine.indexOf(x,count[x-'a'])==-1) return false;
            count[x-'a']=magazine.indexOf(x,count[x-'a'])+1;
        }
        return true;
    }

    public static void main(String[] args) {

//        "fffbfg"
//        "effjfggbffjdgbjjhhdegh"
        String a = "a";
        String b = "aab";
        System.out.println("Hello World!" + new RansomNote().canConstruct(a,b));
    }
}
