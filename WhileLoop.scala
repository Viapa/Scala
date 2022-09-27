package Introduction

/**
 * 目标：学会scala语法中的while循环基本写法
 */

object WhileLoop {
  def main(args: Array[String]): Unit = {
    // 1.while基础写法
    println("while:")
    var a = 10
    while (a >=1 ){
      println("this is a while loop." + a)
      a -= 1
    }

    // 2.do-while写法
    println("do..while..")
    var b = 10
    do{
      println("this is a do-while loop." + b)
      b -= 1
    } while (b >= 1)
  }
}
