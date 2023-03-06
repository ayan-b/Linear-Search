num = int(input("Type the number of elements: "))

elements = []
for i in range(num):
	elements.append(int(input("Type the " + str(i + 1) + "º element: ")))	
	
found = False
element = int(input("Type a element to search: "))
for e in elements:
	if element == e:
		found = True
		print("Successful search!")
		break

if not found:
	print("Not Found!")
