package com.scala.leetcode.problems

/**
  * Created by Administrator on 2017/7/18.
  */
object HammingDistance extends App{

  def hammingDistance(x:Int,y:Int) : Int = {
    Integer.bitCount(x ^ y)
  }

  System.out.println(""  + hammingDistance(0,1))

}
