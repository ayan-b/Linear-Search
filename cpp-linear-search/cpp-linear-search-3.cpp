#include<iostream>
using namespace std;
void lsearch(int a[],int s,int n)
{
	for(int i=0;i<n;i++)
		if(a[i]==s)
		{
			cout<<"Found";
			return;
		}
	cout<<"Not Found";
}

int main()
{
	int i,n,s;
	cout<<"Size of search space: ";
	cin>>n;
	int a[n];
	for(i=0;i<n;i++) 
		cin>>a[i];
	cout<<"Search element: ";
	cin>>s;
	lsearch(a,s,n);
}
