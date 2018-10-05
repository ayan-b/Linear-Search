#include <iostream>
using namespace std;



void linearSearch(const int myList[], int key)
{
	for (int i = 0; i < sizeof(myList); i++)
	{
		if (key == myList[i])
		{ cout << "Successful Search" << endl;
		  break;
		}
	}	
}
int main()
{
	 ios_base::sync_with_stdio(false);          //for fast input & output
	 cin.tie(NULL);
    int num;
    cout << "Enter Number of Elements :"<< endl;
    cin >> num;
	int myList[num];
    for(int i = 0 ; i <  num  ;i++)
        cin >> myList[i];
    cout << "Enter Element to Search :"<< endl;
	int key;
    cin >> key;
	linearSearch(myList, key);
	return 0;
}
