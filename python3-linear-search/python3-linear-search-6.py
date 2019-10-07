ellen = int(input("Enter number of elements: "))

def linearSearch():
    myel = [] 
    for num in range(0,ellen): 
        el = input(f"{(num) + 1}. Element: ")
        try: 
            myel.append(int(el))
        except:  
            raise Exception("Enter only numbers!")
    print(f"This is your list: {myel}")

    value = input("Search a value: ")
    #searching value 
    for pos,num in enumerate(myel):
        print(num, myel)
        print(pos)
        if num == int(value): 
            print(f"Value found! It's the {pos+1}. value in your list")
            break
        if pos+1 == len(myel): 
            print("Value not found!")

linearSearch()

