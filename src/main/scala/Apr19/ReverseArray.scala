package Apr19

object ReverseArray extends App {

  def view(array: Array[Int]) = {
    for (i <- array) {
      print(i + " ")
    }
    println()
  }

  def reverseFun(array: Array[Int], first: Int, last: Int): Any = {
    if (first < last) {
      var temp = array(first)
      array(first) = array(last)
      array(last) = temp

      reverseFun(array, first + 1, last - 1)
    }
  }

  val array = Array(1, 2, 3, 4, 5)


  view(array)
  println("AFTER")
  reverseFun(array, 0, array.length - 1)
  view(array)

}
