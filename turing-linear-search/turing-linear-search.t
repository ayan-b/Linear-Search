function linear_search(var arr : array 0 .. * of int, var key : int) : boolean
    for i : 0 .. upper(arr)-1
        if arr(i) = key then
            result true
        end if
    end for
    result false
end linear_search

var n : int
put "Please enter the number of elements: " ..
get n
var arr : array 0 .. n of int
put "Please enter the array elements: " ..
for i : 0 .. n-1
    get arr(i)
end for
put "Enter the key to search for: "..
var key : int
get key
if linear_search(arr, key) then
    put "Successful Search"
else
    put "Unsuccessful Search"
end if
