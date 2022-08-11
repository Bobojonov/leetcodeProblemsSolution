import scala.collection.mutable

class MinStack() {

  private val stack = new mutable.Stack[(Int, Int)]
  def push(value: Int): Unit =  {
    stack.headOption match {
      case None         => stack.push((value, value))
      case Some((_, x)) => stack.push((value, value.min(x)))
    }
  }

  def pop() {
    stack.pop()
  }

  def top(): Int = {
    stack.head._1
  }

  def getMin(): Int = {
    stack.head._2
  }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = new MinStack()
 * obj.push(`val`)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */