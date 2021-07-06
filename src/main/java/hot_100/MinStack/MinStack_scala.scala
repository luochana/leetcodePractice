package hot_100.MinStack



import scala.collection.mutable.Stack

class MinStack_scala{


  // 数据栈
  private var data:Stack[Int] = Stack()
  // 辅助栈
  private var helper:Stack[Int]= new Stack()

  // 思路 1：数据栈和辅助栈在任何时候都同步
  def push(x: Int): Unit = { // 数据栈和辅助栈一定会增加元素
    data.push(x)
    if (helper.isEmpty || helper.top >= x) helper.push(x)
    else helper.push(helper.top)
  }

  def pop(): Unit = { // 两个栈都得 pop
    if (!data.isEmpty) {
      helper.pop
      data.pop
    }
  }

  def top: Int = {
    if (!data.isEmpty) return data.top
    throw new RuntimeException("栈中元素为空，此操作非法")
  }

  def getMin: Int = {
    if (!helper.isEmpty) return helper.top
    throw new RuntimeException("栈中元素为空，此操作非法")
  }



}
