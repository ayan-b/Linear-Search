object ScalaLinearSearch {
  def main(args: Array[String]): Unit = {
    val input = Console.in
    val n = input.readLine().toInt
    val value = input.readLine().toInt
    val array = new Array[Int](n)
    var index = 0
    val argument = input.readLine().split(" ")
    while (index < n) {
      array(index) = argument(index).toInt
      index += 1
    }
    linearSearch(n, array, value)
  }

  def linearSearch(n: Int, array: Array[Int], value: Int): Unit = {
    var index = 0
    while (index < n) {
      if (array(index) == value) {
        println(index)
        return
      }
      index += 1
    }
    println("Not Found!")
  }
}
