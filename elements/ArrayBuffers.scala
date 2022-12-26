package Introduction
package elements

import scala.collection.mutable.ArrayBuffer

object ArrayBuffers {
  def main(args: Array[String]): Unit = {
    // 1.创建可变数组
    val arr1: ArrayBuffer[Int] = new ArrayBuffer[Int]()
    val arr2 = ArrayBuffer(25, 36, 72)
    println(arr1)
    println(arr2)

    // 2.访问元素
    println(arr2(0))
    arr2(1) = 58
    println(arr2(1))

    // 3.添加元素
    val newArr1 = arr2 :+ 15 // 不可变数组，需要新建
    println(newArr1)
    println("==================")

    arr2 += 33
    println(arr2)
    val newArr2 = arr1 += 35
    println(newArr2)
    println(newArr2 == arr1) // 二者地址一样

    println("=========")
    arr1 += 100
    println(arr1)
    println(newArr2)

    println("=============")
    // 向前加
    77 +=: arr1
    println(arr1)

    arr1.append(200, 250)
    arr1.prepend(300, 100)
    println(arr1)

    // 指定位置添加
    println(arr2)
    arr2.insert(2, 49, 59) // 第三个位置开始向后依次添加
    println(arr2)

    // 添加数组
    println(arr1)
    arr1.appendAll(arr2)
    println(arr1)

    // 4.删除元素
    arr1.remove(3) // 索引
    println(arr1)
    arr1.remove(0, 5)
    println(arr1)
    arr1 -= 33
    println(arr1)

    // 5.可变数组转为不可变数组
    val varArr = ArrayBuffer(10, 20, 30)
    val valArr = varArr.toArray
    println(varArr)
    println(valArr.mkString(","))

    // 6.不可变数组转为可变数组
    val newVarArr = valArr.toBuffer
    println(newVarArr)

  }
}
