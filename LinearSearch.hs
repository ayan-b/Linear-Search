search :: Eq a => [a] -> a -> Bool
search [] _ = False
search (x:xs) y = x==y || search xs y

main = do
  let input = [1, 2, 3, 8, 9, 12]
  print $ search input 2 -- True
  print $ search input 4 -- False