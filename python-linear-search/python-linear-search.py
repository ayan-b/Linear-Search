print ("Enter numbers in array seperated by spaces")
num_array = input().split(" ")                   #In this way of storing, elements are of char data type.
element_to_find = input("Element to find: ")
for i in num_array:                              #Searching through the num_array.
    if i == element_to_find:
        print("Element Found. Congratulations!")
        break
