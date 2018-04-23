-- Type main in ghci,
-- or call search function with valid inputs

main = do
    let array = [2, 4, 6, 8, 10, 3, 5]
    print $ search array 6  -- Returns true

-- This function recursively checks list
search :: Eq a => [a] -> a -> Bool
search [] _ = False
search (h:t) num = h == num || search t num

search :: Eq a => [a] -> a -> [Int]
search xs y = [ i | (i,x) <- zip [0..] xs, x==y]