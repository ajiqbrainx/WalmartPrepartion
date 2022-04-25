package Apr21

object LeftRotate extends App {

  val array = Array(1, 2, 3, 4, 5)

  def leftRotate(array: Array[Int], Rotation: Int) = {
    for (i <- 0 until Rotation) {
      var index = array(0)
      for (j <- 0 until array.length - 1) {
        array(j) = array(j + 1)
      }
      array(array.length - 1) = index
    }
   array
  }

  leftRotate(array, 1)
  for (i <- array) {
    print(i + " ")
  }
}
