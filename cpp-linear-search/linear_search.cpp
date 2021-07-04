// By Umar Salman (https://github.com/umarsalman)
// Linear Search which will work fine even for big numbers(of long long type)

#include<bits/stdc++.h>
using namespace std;
typedef long long int ll;
int main()
{
	ll n,key,i,f=0,pos=0;                    // n=number of elements in the array;   key=number to be searched;   pos=Position at which the key is found;
	cin>>n;
	ll arr[n];
	
	for(i=0;i<n;i++)
	{
		cin>>arr[i];                   //accepting n numbers from the user and storing them in array arr;
	}
	
	cin>>key;                           // accepting the number from the user which is to be searched ;
	
	for(i=0;i<n;i++)                   // Comparing each number with the key
	{
		if(arr[i]==key)
		{
			f=1;
			pos=i;
			break;
		}
		
	}
	
	if(f==0)                              // If key is not found
	   cout<<key<<" is not present \n";
	else                                                             // If the key is found.
	   cout<<key<<" is present at position "<<pos+1<<'\n';
	return 0;
}
