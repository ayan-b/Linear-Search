println("Enter the array size ")
n = parse(Int32,readline())
a=[]
println("Enter the array values ")
for i = 1:n
          temp =  parse(Int32,readline())
          append!(a, temp)
       end
println("Enter the element to search ")
s =  parse(Int32,readline())
flag = 0
for i = 1:n
          if s == a[i]
              println(i)
              global flag += 1
              break
            end
       end
if flag == 0
    println("Not found")
    end
