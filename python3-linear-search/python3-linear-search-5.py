n=int(input("Enter size of array : "))
arr=[]
flag=0
print('Enter array elements : ')
for i in range(n):
    n=arr.append(int(input()))
key=int(input("Enter element to be searched for : "))
for x in arr:
    if(x==key):
        print('Found at index : ',arr.index(x))
        flag=1
        break
    else:
        flag=0
if(flag==0):
    print('Not Found!')
