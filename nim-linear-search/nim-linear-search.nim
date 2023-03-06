import strutils

proc linear_search[T](collection: seq[T], item: T): T =
    for i in 0..(collection.len() - 1):
        if collection[i] == item:
            return i
    return -1
    
proc main() = 
    echo "Enter size of collection:"
    let sizeOfCollection = readLine(stdin).parseInt()
    
    # input elements of array
    echo "Enter ",sizeOfCollection, " numbers, with each number followed by enter"
    var collection = newSeq[int]()
    for i in 0 .. (sizeOfCollection-1):  
      collection.add(readLine(stdin).parseInt())
    
    # input no. to be serached
    echo "Enter no. to be searched:"
    let noToSearched = readLine(stdin).parseInt()
    
    # output index of searched no.
    var indexOfSearchedNo = linear_search(collection, noToSearched)
    if indexOfSearchedNo == -1:
        echo "No. not found!"
    else: 
        echo "Postion of searched no. : ", (indexOfSearchedNo+1)
    
main()