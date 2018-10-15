package linearSearch;


class LinearSearch<T> (searchList: Array<T>) {
    var searchList = searchList
    fun exists (key: T) : Boolean {

        for(x in this.searchList){
            if(x == key){
                return true
            }
        }

        return false
    }
}

fun main(args : Array<String>) {

    var searchArr: Array<Int> = arrayOf(1,3,5,7,9,11)
    var searchKey = 3

    var isKeyPresent = LinearSearch<Int>(searchArr).exists(searchKey);

    when (isKeyPresent){

        true -> println("key found in list")
        false -> println("key not found in list")
    }
}
