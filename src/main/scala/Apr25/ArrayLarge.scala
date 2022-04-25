package Apr25


import scala.collection.mutable._

import scala.io._


object ArrayLarge extends App {
  println("Enter operation: ")

  var operation = StdIn.readLine().toInt

  for (i <- 1 to operation) {
    var array = ArrayBuffer[Int]()
    var operator = StdIn.readLine().toInt
    operator match {
      case 1 => println("Enter value :")
        var value = StdIn.readLine().toInt;
        array += value
      case 2 => array.remove(array.last)
      case 3 => println(s"${
        for (i <- array) {
          print(array(i) + " ")
        }
      }")
    }

  }


}



