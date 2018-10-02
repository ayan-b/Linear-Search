-- tested with GHC 8.4.3

-- linearSearch takes an array of items, and a key of the same type.
--  If the key is in the array, it will return the key itself.
linearSearch :: Eq a => [a] -> a -> Maybe a
linearSearch [] _   = Nothing
linearSearch (x:xs) key
    | x == key  = Just x
    | otherwise = linearSearch xs key

-- linearSearch' takes an array of items, and a key of the same type.
--  If the key is in the array, it will return the index of the key.
linearSearch' :: Eq a => [a] -> a -> Maybe Int
linearSearch' (x:xs) key = accSearch (x:xs) key 0 
    where accSearch :: Eq a => [a] -> a -> Int -> Maybe Int
          accSearch [] _ _       = Nothing
          accSearch (x:xs) key i  
              | x == key = Just i
              | otherwise = accSearch xs key (i+1)  

