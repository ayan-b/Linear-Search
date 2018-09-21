
package linearSearch;


fun linearSearch (searchList: Array<Int>, key: Int) : Boolean {

    for(x in searchList.indices){
        if(x == key){
            return true
        }
    }

    return false
}

fun main(args : Array<String>) {

    var searchArr: Array<Int> = arrayOf(1,3,5,7,9,11)
    var searchKey = 3

    var isKeyPresent = linearSearch(searchArr, searchKey);

    when (isKeyPresent){

        true -> println("key found in list")
        false -> println("key not found in list")
    }
}


