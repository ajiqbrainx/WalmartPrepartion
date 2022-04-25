package Apr21

object LeftRotateRecursion extends App {
  def rotaion(Rotation: Int): Any = {
    def tailRotate(array: Array[Int], Index: Int = 0): Any = {
      if (array(Index) < array(array.length - 1)) array(Index) = array(Index + 1)
      tailRotate(array, Index + 1)
    }
    tailRotate(array)
    rotaion(Rotation + 1)
  }

  val array = Array(1,2,3,4,5)
  rotaion(2)

}
