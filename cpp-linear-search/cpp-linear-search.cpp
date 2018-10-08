#include <iostream>

void linearSearch(const int myList[], int key)
{
	for (int i = 0; i < sizeof(myList); i++)
	{
		if (key == myList[i])
			std::cout << "Element Found at index "<< i << std::endl;
	}	
}
int main()
{
	int num;
	std::cout << "Enter Number of Elements :" << std::endl;
	std::cin >> num;
	int myList[num];
	for (int i = 0; i < num; i++)
		std::cin >> myList[i];
	std::cout << "Enter Element to Search :" << std::endl;
	int key;
	std::cin >> key;
	linearSearch(myList, key);
	return 0;
}
