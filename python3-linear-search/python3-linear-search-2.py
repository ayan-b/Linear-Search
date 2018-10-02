
# Python-3 Code for linear search in a list

def LinearSearch(l, x):

	length = len(l)
	flag = False

	for i in range(length):
		if l[i] == x:
			print("Element found at index", i)
			flag = True
			return flag

	print("Element not found in array")
	return flag

array = list(map(int,input("Enter array as space-separated integers: ").split()))

num = int(input("Enter element to be found: "))

LinearSearch(array, num)


