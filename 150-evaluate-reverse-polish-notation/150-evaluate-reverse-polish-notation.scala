import scala.collection.mutable

object Solution {
    def evalRPN(tokens: Array[String]): Int = {
    val stack = new mutable.Stack[String]()
    for (i <- 0 until tokens.length){
      if (tokens(i).last.isDigit) stack.push(tokens(i))
      else {
        val num1 = stack.pop()
        val num2 = stack.pop()
        val result = operator(tokens(i), num1, num2)
        stack.push(result)
      }
    }
    def operator(op: String, num1: String, num2: String): String = op match {
      case x =>
        val number1 = if (num1.contains('-')) -num1.tail.toInt else num1.toInt
        val number2 = if (num2.contains('-')) -num2.tail.toInt else num2.toInt
        if (x == "+") (number1 + number2).toString
        else if (x == "-")  (number2 - number1).toString
        else if (x == "/")  (number2 / number1).toString
        else (number2 * number1).toString
    }
    stack.head.toInt
  }
}