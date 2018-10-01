num_array = list() #Enter elements
num = raw_input("Enter how many elements you want: ")
print "Enter numbers in array: "

for i in range(int(num)):
    n = raw_input("num: ")
    num_array.append(int(n))

element_to_find = raw_input("Element to find: ")    
for i in num_array: #searching through the list
    if i == int(element_to_find):
        print "Successful search!"
        break
else:
    print "Element not found!"
