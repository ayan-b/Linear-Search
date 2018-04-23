func readInt() -> Int {
	while true {
		if let str = readLine() {			
			if let num = Int(str) {
				return num
			} else {
				print("\(str) is not a number.")
			}
		}
	}
}

func linearSearch(in haystack: [Int], for needle: Int) -> Int {
	for i in 0 ..< haystack.count {
		if haystack[i] == needle {
			return i
		}
	}

	return -1
}

let haystack = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

let index = linearSearch(in: haystack, for: 2)
print("2 was found at index \(index)")