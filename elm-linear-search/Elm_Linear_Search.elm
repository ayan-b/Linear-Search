module Elm_Linear_Search exposing (output)

import List exposing (head, length, drop, take)

search : String -> List String -> Int -> String
search query list index =
    case head list of
        Nothing -> "Not Found!"
        Just headElement ->
            if headElement == query then
                String.fromInt index
            else
                search query (drop 1 list) <| index + 1

output : List String -> String
output args =
    case length args of
        0 -> "Enter list to search in args, with last args as search query"
        1 -> "Enter list to search in args, with last args as search query. Having only one argument is invalid"
        _ ->
            let
                query = Maybe.withDefault "" <| head <| drop (length args - 1) args
                list = take ( length args - 1 ) args
            in
                search query list 0
