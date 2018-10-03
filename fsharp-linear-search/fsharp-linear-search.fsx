// function to be curried:
// takes in the where in the iteration of the list an item is, and what its value is (x)
// the item being searched for, desired, is curried in inside the search function
let findin i x desired = 
        match x with
            | (v) when v = desired -> printfn "%s found at index %d" v i
                                      exit 0
            | _ -> ()

// search function, takes in value and list
// curries value into the findin function and iterates through each element
// if it gets through the whole list, it prints not found, because otherwise the code would have exited
let search value list = 
    Seq.iteri (fun i x -> findin i x value |> ignore) list 
    printfn "Not Found!"

// Parse the command line arguments such that the first argument is the desired value and the rest are the list of elements
let args = Array.toSeq fsi.CommandLineArgs
let s = Seq.tail args
let search_value = Seq.head s
let elements = Seq.tail s

// call the search function with the value we are looking for and the list of elements
search search_value elements
