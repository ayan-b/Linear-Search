import util.control.Breaks._

object LinearSearch {
    def main(args: Array[String]) {
        var a = List(1,2,3,8,9,12)
        val elementToFind = 2

        breakable {
            for (i <- a){
                if (i ==  elementToFind) {
                    println("Successful Search!")
                    break
                }
            }
        }
    }
}