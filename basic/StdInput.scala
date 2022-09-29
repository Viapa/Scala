package Introduction
package basic

import scala.io.StdIn

object StdInput {
  def main(args: Array[String]): Unit = {
    // 输入信息
    println("请输入您的姓名:")
    val name: String = StdIn.readLine()
    println("请输入您的芳龄:")
    val age: Int = StdIn.readInt()

    // 控制台打印输出
    println(s"欢迎 ${name} 来到奇妙世界! 您的年龄为: ${age} ")
    if (age > 60) {
      println("经系统判断，您是老年人，请注意游戏时间~")
    } else if (age >= 18 && age < 60) {
      println("您是成年人，祝您玩的开心！")
    } else {
      println("您是未成年人，不能进行上机！")
    }
  }
}
