package Introduction
package function

object Lambda {
  def main(args: Array[String]): Unit = {
    // 1.定义匿名函数，并作为参数传入一个新的函数中
    var func = (name:String) => {println(name)}
    def f1(function: String => Unit): Unit ={
      println("这是一个新的函数")
      function("Zhangke")
    }
    f1(func)

    // 2.案例应用：二元函数的简单运算,通过具体函数进行传参
    def BinaryOperator(func: (Int, Int) => Int): Int = {
      func(1, 3)
    }
    val add = (a: Int, b: Int) => a + b
    val sub = (a: Int, b: Int) => a - b

    println("两数相加:", BinaryOperator(add))
    println("两数相减:", BinaryOperator(sub))
  }
}
