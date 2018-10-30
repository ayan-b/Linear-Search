#!/bin/bash

# number of elements. I'll not need it.
echo "Type the number of elements: "
read num_of_elements
echo "Type all elements separated by spaces (example: 1 2 3 4): "
read all_elements;
echo "Type the element you want to search: "
read element;

FOUND="NOTFOUND"
for e in $all_elements 
do
	if [ $element == $e ]; 
	then
		echo "Successful search!";
		FOUND="FOUND";
		break;
	fi
done

if [ $FOUND == "NOTFOUND" ];
then
	echo "Not Found!";
fi
