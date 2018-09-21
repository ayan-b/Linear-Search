def linear_search (arr,  num)
	for i in arr
		if(i == num)
			return i
		end
	end
	return -1
end
arr = [1,2,34,77]
print linear_search(arr,7)
