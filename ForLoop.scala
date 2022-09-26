package Introduction

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
    for (i <- 1 to 10 if i % 2 != 0){
      println(i)
    }
  }
}
