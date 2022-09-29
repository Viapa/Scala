package Introduction
package basic

object Astype {
  def main(args: Array[String]): Unit = {
    val intNumber: Int = 3
    val floatNumber: Double = 6.0
    val output: Double = intNumber.toFloat + floatNumber
    println(output)
    val n: Int = 130
    val n_byte: Byte = n.toByte
    println(n_byte) // 高精度转低精度，会溢出（符号变化+数值相反）
    val a: Double = 10.0
    val b: Int = 3
    val c: Double = a / b
    println(c.formatted("%5.2f"))
    val s1: String = "hello"
    val s2: String = new String("hello")
    println(s1 == s2)
    println(s1.equals(s2)) // scala 里面没有混淆，都是值的比较
    println(s1.eq(s2)) // 判断地址
  }
}
