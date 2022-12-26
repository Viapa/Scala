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

    println("================================")
    // 5.可变参数的使用（传入若干个值，一般放在最后）
    def f5(age: Int, name: String*): Unit = {
      println("这是一个包含可变参数的函数")
      println(s"您输入的年龄为:${age}, 您输入的字符为:${name}")
    }
    print(f5(25,"zhangke", "lizhenhua"))

    println("================================")
    // 6.带有默认值的参数（放在必填项后面）
    def f6(age:Int, name:String = "zhangke"): Unit = {
      println("这是一个带默认值参数的函数")
      println(s"姓名${name}, 年龄${age}")
    }
    println(f6(25))
    println(f6(18, name="lizhenhua"))

    println("================================")
    // 7.带上参数名称，可以在任意位置放置

    def f7(age:Int, name:String): Unit = {
      println("这是一个函数参数名称的测试")
      println(s"姓名-${name}, 年龄-${age}")
    }
    print(f7(name="zhangke", age=25))

  }
}
