#linear-search
n = input("Enter number of elements to search: ")
arr = [0]*n #creating a list of size n
some_inp = raw_input("Enter the space seperated list of numbers to search: ")
f = 0
for i in some_inp.split():
    arr[f] = int(i)
    f = f+1
x = input("Enter the element to find: ")
count = 0
for i in range(n):
    if(arr[i]==x):
        ans = i #to return the index as answer
        count = 1 #to count if the element is found or not
        break 
if(count==0):
    print "Not Found!"
else:
    print "Location of the element is: ", ans
