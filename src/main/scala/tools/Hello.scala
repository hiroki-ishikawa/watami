package tools

import java.util.Calendar

/**
 * @author Kota Mizushima
 * Date: 2013/01/18
 * Time: 0:06
 */
object Hello {
  def main(args: Array[String]): Unit = {
    val calendar: Calendar = Calendar.getInstance()
    println(calendar.toString)

  }

}
