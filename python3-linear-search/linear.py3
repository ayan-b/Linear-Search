#Uses python3
def linear(data, seq):
	for i in range(len(data)):
		if data[i] == seq:
			return i
	return -1

if __name__ == '__main__':
    data = input('Enter the array of numbers or letters : ').split()
    seq = input('Enter the sequence to be searched : ')
    res = linear(data,seq)
    if res == -1:
    	print(seq + ' ' + "didn't match in "+str(' '.join(data)))
    else:
    	print(seq + ' ' + 'found at position %d'%(res+1) + ' in ' + str(' '.join(data)))