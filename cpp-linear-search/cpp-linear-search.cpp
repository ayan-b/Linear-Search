#include <iostream>
using namespace std;

void linearSearch(const int myList[], int key)
{
	int flag=0;
	for (int i = 0; i < sizeof(myList); i++)
	{
		if (key == myList[i])
		{
			flag++;
			cout << "Successful Search, value was found at index  " << i << endl;
		}
		
	}
	if(flag==0)
	{
		cout<<"Value not present in the array \n";
	}
}
int main()
{
    int num;
    cout << "Enter Number of Elements :"<< endl;
    cin >> num;
	int myList[num];
    cout<<"Enter values for array one by one \n";
    for(int i = 0 ; i <  num  ;i++)
        cin >> myList[i];
    cout << "Enter Element to Search :"<< endl;
	int key;
    cin >> key;
	linearSearch(myList, key);
	return 0;
}
