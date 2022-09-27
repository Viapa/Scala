package Introduction

import scala.util.control.Breaks

/**
 * 目标：学会scala语法中的for循环基本写法
 */

object ForLoop {
  def main(args: Array[String]): Unit = {
    // 1.基础写法
    println("To:")
    for (i <- 1 to 10){
      println(i)
    }

    // 2.range写法: 不包含右侧边界
    println("Range:")
    for (i <- Range(1, 10)){
      println(i)
    }

    // 3.until写法：不包含右侧边界
    println("Unti:")
    for (i <- 1 until 10){
      println(i)
    }

    // 4.多种集合选择
    println("Gain:")
    for (i <- List(10, 20, 30)){
      println(i)
    }

    // 5.条件变量：类似列表推导式
    println("Conditional variable:")
    for (i <- 1 to 10 if i % 2 != 0) {
      println(i)
    }

    // 6.by用法：步长控制
    println("By control:")
    for (i <- 1 to 20 by 3){
      println(i)
    }

    for (i <- 30 to 20 by -2){
      println(i)
    }

    // 7.reverse用法：倒序
    println("Reverse:")
    for (i <- 1 to 10 reverse){
      println(i)
    }

    // 8.by小数：间隔为小数
    println("By for double:")
    for (i <- 1.0 to 5.0 by 0.5){
      println(i)
    }

    // 9.嵌套循环
    println("NestedLoop:")
    for (i <- 1 to 3){
      for (j <- 5 to 8) {
        println(i, j)
      }
    }

    for (i <- 1 to 5; j <- 2 to 6){
      println("i = " + i, "j = " + j)
    }

    // 10.打印九九乘法表
    for (i <- 1 to 9; j <- 1 to i){
      print(s"$j * $i = ${i * j} \t")
      if (i == j) {
        println()
      }
    }

    // 11.九层妖塔实现
    for (i <- 1 to 9; space_num = 9 - i; place_num = 2 * i - 1){
      println(" " * space_num + "$" * place_num + " " * space_num)
    }

    // 12.返回值: 默认返回空
    val b = for (i <- 1 to 10) yield i
    println(b)

    // 13.终止循环：使用loop.breakable
    var loop = Breaks;
    loop.breakable(
      for (i <- 1 to 10){
        if (i != 6){
          println(i)
        } else{
          loop.break();
        }
      }
    )

    // 14.终止循环：使用try-catch语句
    println("try-catch:")
    try{
      for (i <- -5 to 5) {
        var res = 10 / i
        println(res)
      }
    } catch {
      case e: ArithmeticException => println(e)
    }
    println("this is outside of for-loop")
  }
}
