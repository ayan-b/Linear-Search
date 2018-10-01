#!/bin/bash

#Function definition starts from here.

lsearch()
{
   status=-1

   for((i=0;i<count;i++))
   do
      Temp=$1

      if [ $Temp -eq ${ARRAY[i]} ]
       then

          status=0
          searches=$((i+1))
          return

        return $((i+1))

      fi

   done
}

#Variable Declaration                       

clear

echo "Enter the Array Elements : "

read -a ARRAY

count=${#ARRAY[@]}

search=y


#Main Script Starts Here

while [ "$search" == "y" -o "$search" == "Y" ]
do

     echo -n "Enter element to be searched : "
     read num
     lsearch $num

     if [ $status -eq 0 ]
     then
         echo "$num found after $searches searches"
     else
         echo "$num not found"
     fi

     echo -n "Do you want another search (y/n): "
     read search

done
