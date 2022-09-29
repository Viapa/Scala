package Introduction
package elements

object ImmutablArray {
  def main(args: Array[String]): Unit = {
    // 1.创建数组，指定大小
    val arr: Array[Int] = new Array[Int](5)
    println(arr) // 打印的是地址

    // 2.直接赋值Array创建
    val arr2: Array[Int] = Array(1,2,4,6,8)
    println(arr2)

    // 3.增删改查-查询元素（从0开始）
    println(arr2(2))

    // 4.增删改查-重新赋值
    arr2(2) = -1
    println(arr2(2))

    // 5.数组遍历
    for (i <- 0 until arr2.length){
      print(arr2(i) + ",")
    }

    println()
    println("使用arr.indices直接对数组遍历：")
    for (i <- arr2.indices) print(arr2(i) + ",")

    println()
    println("对数组元素进行遍历打印")
    for (ele <- arr2) println(ele)

    println()
    println("对数组元素进行迭代器遍历")
    val iter = arr2.iterator
    while (iter.hasNext){
      println(iter.next())
    }

    println()
    println("使用foreach方法，结合lambda表达式")
    arr2.foreach((ele:Int) => println(ele + 1))

    println()
    println("使用mkString,将元素连接成字符串,相当于join")
    println(arr2.mkString("*"))
  }
}
