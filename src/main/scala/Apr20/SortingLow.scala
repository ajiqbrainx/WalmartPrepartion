package Apr20

object SortingLow extends App {
  val array = Array(21, 2, 1, 3, 4, 5)
  for (i <- 0 until array.length - 1) {
    for (j <- 0 until array.length - 1) {
      if (array(j) < array(j + 1)) {
        var temp = array(j)
        array(j) = array(j + 1)
        array(j + 1) = temp
      }
    }
  }
  println(array.mkString(","))
//  println(array(1))
}
