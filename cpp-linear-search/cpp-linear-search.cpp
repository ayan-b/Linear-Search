#include <iostream>
using namespace std;

void linearSearch(const int myList[], int key,int num)
{
	for (int i = 0; i < num; i++)
	{
		if (key == myList[i])
		{
			cout << "Element found" << endl;
			return;
		}
	}	
	cout<<"Element not found";
}
int main()
{
    int num;
    cout << "Enter Number of Elements : ";
    cin >> num;
	int myList[num];
    for(int i = 0 ; i <  num  ;i++)
        cin >> myList[i];
    cout << "Enter Element to Search : ";
	int key;
    cin >> key;
	linearSearch(myList, key,num);
	return 0;
}
