package Apr21

import scala.collection.mutable.ArrayBuffer

object Negative extends App {

  val array = Array(12, 3, -1, -33, -21, 45, 212)
  var negative = ArrayBuffer[Int]()
  var positive = ArrayBuffer[Int]()
  for (i <- array) {
    if (i < 0) negative += i
    else if (i > 0) positive += i
  }

  println(positive)
  println(negative)
}
