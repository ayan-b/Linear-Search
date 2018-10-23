#include<bits/stdc++.h>
using namespace std;
void lsearch(int a[],int s)
{
	int i,flag=0;
	for(i=0;i<sizeof(a);i++)
	{
		if(a[i]==s)
		{
			cout<<"Found";
			flag=1;
			break;
		}
	}
	if(flag!=1) cout<<"Not found";
}
int main()
{
	int i,a[10],n,s;
	cin>>n;
	for(i=0;i<n;i++) cin>>a[i];
	cin>>s;
	lsearch(a,s);
	return 0;
}
