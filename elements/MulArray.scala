package Introduction
package elements

object MulArray {
  def main(args: Array[String]): Unit = {
    // 1.创建二维数组
    var twoDimArr: Array[Array[Int]] = Array.ofDim(2, 3)

    // 2.赋值
    twoDimArr(1)(2) = 30
    twoDimArr(0)(1) = 25
    println(twoDimArr(0)) // 还是引用地址

    // 3.遍历
    for (i <- 0 until twoDimArr.length; j <- 0 until twoDimArr(i).length) {
      print(twoDimArr(i)(j) + ",")
      if (j == twoDimArr(i).length - 1) println()
    }

    // 简便写法
    twoDimArr.foreach(line => line.foreach(println))

  }

}
