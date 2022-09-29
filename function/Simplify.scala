package Introduction
package function

object Simplify {
  def main(args: Array[String]): Unit = {
    // 1.return可以省略不写，scala会默认使用函数体中最后一行作为返回
    def f1(name:String): String = {
      name
    }
    println(f1("zhangke"))

    println("================================")
    // 2.如果函数中只有一行代码，可以省略花括号
    def f2(name:String): String = name
    println(f2("huahua"))

    println("================================")
    // 3.如果函数类型能被编译器推断，则连同冒号一起可以省略
    def f3(name:String) = name
    println(f3("via"))

    println("================================")
    // 4.如果函数体中保留了return，则必须在定义中写明返回类型
    def f4(name:String): String = {
      return name
    }
    println(f4("test"))

    println("================================")
    // 5.如果函数声明返回Unit，则return语句失效
    def f5(name:String): Unit = {
      return name
    }
    println(f5("unit return"))

    println("================================")
    // 6.如果函数期望返回unit，则声明中的等号可以省略
    def f6(name:String) {
      println("None")
    }
    println(f6("test no equals"))

    println("================================")
    // 7.如果函数没有参数，则可以省略函数声明的括号，以及必须省略调用时的括号
    def f7: Unit ={
      println("this is a no param function")
    }
    println(f7)

    println("================================")
    // 8.如果不关心函数名而在意逻辑，则函数名也可以省略，反过来使用 => 号，称为匿名函数
    var cal = (x:Int) => x + 2
    var x1 = 10
    var x2 = cal(x1) - 3
    println(x2)
  }
}
