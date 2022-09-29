package Introduction
package basic

object HelloWorld {
  /**
   * 学习基本的scala语法: 输出hello语句
   *
   * @param args
   */

  def main(args: Array[String]): Unit = {
    val s = "hello"
    println(s)
    printString(name = "张珂", age = 25, job = "Research & Development")
    printSQL(name = "李四", age = 22, job = "Datamining")
  }

  def printString(name: String, age: Double, job: String): Unit = {
    println(s"${age}岁的${name}目前是一名${job}开发人员。")
  }

  def printSQL(name: String, age: Double, job: String): Unit = {
    val sql =
      s"""
         |select *
         |from student
         |where name != ${name} and age >= ${age}



       |""".stripMargin
    println(sql)
  }
}
