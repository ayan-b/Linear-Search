fun linsearch(x : int, ls : int list) =
  let 
    val ctr : int ref = ref 0
    fun recsearch(x : int, ls : int list) =
      case ls of
          [i] => if i = x then print(Int.toString(!ctr) ^ "\n") else print("Not Found!\n")
        | (h::t) => (ctr := !ctr + 1; if h = x then print(Int.toString(!ctr) ^ "\n") else recsearch (x, t))
  in 
    recsearch(x,ls)
  end
