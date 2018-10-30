linearSearch :: [Int] -> Int -> Bool
linearSearch [] key = False
linearSearch (head:tail) key = if head == key then True
                      else linearSearch tail key
                      
main = do
    let array = [1,2,3,4,6]
    print $ linearSearch array 5 --Return false
    print $ linearSearch array 6 --Return true
