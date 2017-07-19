package com.scala.algorithm.stack

import java.util
import java.util.Stack


/**
  * 求最小值
  *
  * Created by Administrator on 2017/7/19.
  */
object MinStack extends App{

  val stack = new MinStack

  stack.push(3)
  stack.push(4)
  stack.push(2)
  stack.push(5)
  System.out.print(stack.pop)

}

class MinStack{
  val stackData:Stack[Int] = new util.Stack[Int]
  val stackMin :Stack[Int] = new Stack[Int]
  def push(newNum : Int) = {
    if(this.stackMin.isEmpty){
      this.stackMin.push(newNum)
    }else if (newNum < this.getMin){
      this.stackMin.push(newNum)
    }else{
      val newMin = this.stackMin.peek()
      stackMin.push(newMin)
    }
    this.stackData.push(newNum)
  }
  def pop :Int = {
    if (this.stackData.isEmpty) {
      throw new RuntimeException("Your Stack is empty")
    }
    this.stackData.pop()
    this.stackMin.pop()
  }

  def getMin : Int = {
    if(this.stackMin.isEmpty) {
      throw new RuntimeException("your stack is empty")
    }
    this.stackMin.peek()
  }
}