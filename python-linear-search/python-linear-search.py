num_array = list()                                              #Enter elements
num = raw_input("Enter how many elements you want:")
print 'Enter numbers in array: '
for i in range(int(num)):
    n = raw_input("num :")                                    #taking elements as input
    num_array.append(int(n))                                  #appending them to list
element_to_find = raw_input("Element to find :")    
for i in num_array:                                           #searching through the list
    if i==element_to_find:
        print ("Successful Search and element found at ")
        print (i)                                             #prints the index of element if found    
        break
