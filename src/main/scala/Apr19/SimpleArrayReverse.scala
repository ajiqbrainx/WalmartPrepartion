package Apr19

object SimpleArrayReverse extends App {

  val array = Array(1, 2, 3, 4, 5)
  for (i <- array.length to 1 by -1) {
    print(i + " ")
  }

}
