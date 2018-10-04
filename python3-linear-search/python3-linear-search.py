#Linear search using python in few lines:

num=[5,3,6,8,6,22,5,89,84,4,2,1,6,9,5,3,59,1,33] #you can apppend your own list
seachnum = int(input("Enter the number you want to search"))
def linear_search(num,searchnum):
    counter=0;
    for i in range (len(num)):
        if(searchnum==num[i]):
            print("Found!",searchnum,"at",i)
            counter=counter+1
    if(counter==0):
        print(searchnum,'Not Found!')

linear_search(num,searchnum)
