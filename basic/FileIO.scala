package Introduction
package basic

import java.io.{File, PrintWriter}
import scala.io.Source

object FileIO {
  def main(args: Array[String]): Unit = {
    // 1. 从文件中读取数据
    Source.fromFile("src/main/resources/test").foreach(print)

    // 2. 将数据写入文件
    val writer = new PrintWriter(new File("src/main/resources/write.txt"))
    writer.write("hello scala from java writer!")
    writer.close()
  }
}
