package Apr19

object LeftRotate extends App {
  def leftRotate(arr: Array[Int], rotation: Int, length: Int): Unit = {
    for (i <- 0 until rotation) {
      leftRotatebyOne(arr, length)
    }
  }
  def leftRotatebyOne(arr: Array[Int], length: Int): Unit = {
    var i = 0
    var temp = 0
    temp = arr(0)
    while (i < length - 1) {
      arr(i) = arr(i + 1)
      i += 1
    }
    arr(i) = temp
  }
  val arr = Array(1, 2, 3, 4, 5, 6, 7)
  val no_of_rotations = 2
  val length = arr.length
  println("Array Elements before rotating : ")
  for (i <- 0 until length) {
    print(arr(i) + " ")
  }
  leftRotate(arr, no_of_rotations, length)
  println("\nArray Elements after rotating : ")
  for (i <- 0 until length) {
    print(arr(i) + " ")
  }
}
