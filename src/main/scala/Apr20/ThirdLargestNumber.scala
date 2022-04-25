package Apr20

import scala.annotation.tailrec

object ThirdLargestNumber extends App {
    val arr = Array(1, 22, 33, 45, 6)
    val size = arr.length
    val max = 0
    var temp = 0
    for (i <- 0 until arr.length) {
      for (j <- i + 1 until arr.length) {
        if (arr(i) < arr(j)) {
          temp = arr(i)
          arr(i) = arr(j)
          arr(j) = temp
        }
      }
    }
    println("Third Largest Number is :" + arr(1))

}