elements = {}
print("Enter number of elements:")
number_of_elements = io.read("*number")
for i = 1, number_of_elements do
    print("Enter element: ")
    element = io.read("*number")
    table.insert(elements, element)
end

print("Enter element to find:")
element_to_find = io.read("*number")
for i = 1, number_of_elements do
    if elements[i] == element_to_find then
        print("Element found!")
        break
    end
    if i == number_of_elements then
        print("Element not found!")
    end
end
