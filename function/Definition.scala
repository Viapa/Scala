package Introduction
package function

object Definition {
  def main(args: Array[String]): Unit = {
    // 1.无参数，无返回值
    def f1(): Unit = {
      println("这是一个无参数，无返回值的函数")
    }
    println(f1())

    println("================================")
    // 2.无参数，有返回值
    def f2(): Int = {
      println("这是一个无参数，有返回值的函数")
      return 3
    }
    print(f2())

    println("================================")
    // 3.有参数，无返回值
    def f3(name: String): Unit = {
      println("这是一个有参数，无返回值的函数")
    }
    println(f3("zhangke"))

    println("================================")
    // 4.有参数，有返回值
    def f4(name:String, age:Int): String = {
      println("这是一个有参数，有返回值的函数")
      return f"姓名为:${name}, 年龄为:${age}"
    }
    println(f4("zhangke", 25))
  }
}
