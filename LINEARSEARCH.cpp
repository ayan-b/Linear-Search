#include<bits/stdc++.h>
using namespace std;
int main(){
	int n;
	cout<<"enter the no of nos in the array";
	cin>>n;
	int a[n];
	int i;
	cout<<"enter the nos"<<endl;
	for(i=0;i<n;i++)
	cin>>a[i];
	cout<<"enter no to search";
	int s;
	cin>>s;
	int flag=0;
	for(i=0;i<n;i++){
		if(a[i]==s){
			cout<<"FOUND";
			flag=1;
			break;
			}
	}
	
	if(flag==0)
	cout<<"NOT FOUND";
		
	return 0;
	}
