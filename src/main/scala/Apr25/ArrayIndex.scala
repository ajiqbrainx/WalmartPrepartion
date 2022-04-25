package Apr25

import scala.annotation.tailrec

object ArrayIndex extends App {

  @tailrec
  def check(array: Array[Int], index: Int = 0): Any = {
    if (array(index) == 5)println(index)
    else check(array, index + 1)
  }

  val array = Array(1, 2, 3, 5, 6, 88, 45)

  check(array)

}
