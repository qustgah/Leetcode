package com.scala.algorithm.stack

import java.util

/**
  * 两个栈组成的队列
  *
  * Created by Administrator on 2017/7/19.
  */
object TwoStackQueue extends App{

  val queue = new TwoStackQueue
  queue.add(1)
  queue.add(3)
  queue.add(6)
  queue.add(2)
  System.out.println(queue.poll)

}

class TwoStackQueue{
  val stackPush = new util.Stack[Int]
  val stackPop = new util.Stack[Int]
  def add(pushInt :Int) : Unit = {
    stackPush.push(pushInt)
  }
  def poll : Int = {
    if (stackPop.empty() && stackPush.isEmpty) {
      throw new RuntimeException("Queue is Empty")
    }else if (stackPop.empty()) {
      while (!stackPush.empty()) {
        stackPop.push(stackPush.pop())
      }
    }
    stackPop.pop()
  }

  def peek :Int = {
    if (stackPop.empty() && stackPush.isEmpty) {
      throw new RuntimeException("Queue is Empty")
    }else if (stackPop.empty()) {
      while (!stackPush.empty()) {
        stackPop.push(stackPush.pop())
      }
    }
    stackPop.peek()
  }
}
