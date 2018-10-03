#!/usr/bin/env bash

echo -n "Enter size of data: "
read data_size

for ((i = 0; i < $data_size; i++)); do
    printf "Adding item (%d/%d): " $((i+1)) $data_size
    read array[$i]
done

for ((i = 0; i < ${#array[@]}; i++)); do
    echo -n ${array[$i]}
    if [ $i -lt $((data_size - 1)) ]; then
        echo -n ", "
    else
        echo ""
    fi
done

echo -n "Perform sequential search for: "
read target

for ((i = 0; i < ${#array[@]}; i++)); do
    if [ ${array[$i]} -eq $target ]; then
        printf "Item found at: %d\n" $i
        exit
    fi
done

echo "Item not found."
