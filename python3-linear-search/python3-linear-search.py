num_array = []
num = int(input("Enter how many elements you want:"))
print('Enter numbers in array: ')
for i in range(0, num):
    n = int(input("num :"))
    num_array.append(n)
element_to_find = int(input("Element to find :"))
element_found = False    
for i in num_array:
    if i==element_to_find:
        element_found = True
        print("Successful Search!")
if not element_found:
    print("Unsuccessful Search!")