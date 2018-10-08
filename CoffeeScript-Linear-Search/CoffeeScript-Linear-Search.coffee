#n = prompt 'Enter number of elements'
n = 4  #number of elements in array
a = [1,2,3,4] #elements in array
x = 0
###
while x < n
  a[x] = prompt 'Enter element'
  x++
###
#f = prompt 'Enter element to search'
f = 4 #element to search
x = 0
while x < n
  if a[x]==f then break
  x++
if x<n
  console.log x
else
  console.log "Not Found!"
