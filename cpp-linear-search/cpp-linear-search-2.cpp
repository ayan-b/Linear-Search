#include <iostream>
#include <vector>

int main()
{
	int a,n,key;
	std::vector<int> vec;
	std::cout << "Enter number of elements : ";
	std::cin >> n;
	for(int i = 0; i < n; i++) //Pushing elements to vector
	{
		std::cin >> a;
		vec.push_back(a);
	}
	std::cout << "Enter element to search : ";
	std::cin >> key;
	for(auto it = vec.begin(); it != vec.end(); it++) //Comparing each element with key
	{
		if((*it) == key)
		{
			
			std::cout << "Element " << key << " found at " << (it-vec.begin())+1 << " position!";
			return 0;
		}
	}
	
	std::cout << "Element not found!";
	return 0;
}
