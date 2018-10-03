const myArray = [1, 2, 3, 4, 5];
Array.prototype.linearSearch = function (target) {
	for (let i = 0; i < this.length; i++) {
		if (this[i] === target) return i;
	}
	return -1;
};
myArray.linearSearch(3);