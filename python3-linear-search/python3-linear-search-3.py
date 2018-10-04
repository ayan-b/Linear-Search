#!/usr/bin/env python3

data_size = int(input("Enter size of data: "))
data = list()

for i in range(0, data_size):
    new_item = int(input("Adding item (%d/%d): " % (i+1, data_size)))
    data.append(new_item)
print(data)

target = int(input("Perform sequential search for: "))
result = [item for item in data if item == target]
print(result)
