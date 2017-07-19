package com.scala.algorithm.stack

import java.util

/**
  * 仅用递归函数和栈操作逆序一个栈
  *
  * Created by Administrator on 2017/7/19.
  */
object ReverseStack extends App{

  var stack:util.Stack[Int] = new util.Stack[Int]
  stack.push(1)
  stack.push(4)
  stack.push(0)
  val reverseStack:ReverseStack = new ReverseStack
  reverseStack.reverse(stack)
  System.out.println(stack.peek())

}

class ReverseStack{
  def getAndRemoveLastElement(stack:util.Stack[Int]) :Int= {
    val result = stack.pop()
    if (stack.isEmpty) result else {
      val last = getAndRemoveLastElement(stack)
      stack.push(last)
      last
    }
  }
  def reverse(stack:util.Stack[Int]) :Unit= {
    if (!stack.isEmpty){
      val i :Int = getAndRemoveLastElement(stack)
      reverse(stack)
      stack.push(i)
    }
  }
}
