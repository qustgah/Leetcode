package com.leetcode.problems;

/**
 * https://leetcode.com/problems/regular-expression-matching/#/description
 *
 * Created by Administrator on 2016/11/25.
 */
public class RegulearExpressionMatching {

    /**
     *  Question :  '.' Matches any single character.
     '*' Matches zero or more of the preceding element.

     The matching should cover the entire input string (not partial).

     The function prototype should be:
     bool isMatch(const char *s, const char *p)
     Some examples:
     isMatch("aa","a") → false
     isMatch("aa","aa") → true
     isMatch("aaa","aa") → false
     isMatch("aa", "a*") → true
     isMatch("aa", ".*") → true
     isMatch("ab", ".*") → true
     isMatch("aab", "c*a*b") → true
     */
    public boolean isMatch(String s ,String p){

        char dot = ".".charAt(0);
        char star = "*".charAt(0);

        if (s == null && p == null){
            return true;
        }else {
            if (s == null || p == null){
                return false;
            }else {
                 if (p.contains("*")){

                 }else {
                     if (p.length() < s.length()){
                         return false;
                     }else{

                     }
                 }
            }
        }
        return false;
    }
/**char dot = ".".charAt(0);
 if (s.length() == p.length()){
 for (int i = 0; i < s.length() ; i++) {
 char a = s.charAt(i);
 char b = p.charAt(i);
 if (dot == a || b == dot){
 continue;
 }else {
 if (a != b){
 return false;
 }
 }
 }
 return true;
 }else {
 return false;
 }*/








}
