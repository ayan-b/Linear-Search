#include <iostream>
using namespace std;

void linearSearch(const int myList[], int key)
{
	for (int i = 0; i < sizeof(myList); i++)
	{
		if (key == myList[i])
			cout << "Successful Search" << endl;
	}	
}
void main()
{
	int myList[6] = {1,2,3,8,9,12};
	int key = 2;
	linearSearch(myList, key);
}