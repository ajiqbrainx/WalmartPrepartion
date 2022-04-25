package Apr20

object LargestArray extends App {

  val array = Array(1, 2, 3, 45, 5)
    var max = array(0)
    for (i <- 0 to array.length - 1) {
      if (array(i) > max) max = array(i)
    }
    println(max)


}
