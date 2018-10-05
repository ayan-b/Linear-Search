/*Linear search recursively
~By Ankush Singh (https://github.com/shad0w1947)~*/

//Header
#include<iostream>
using namespace std;

int linearSearch(int *arr,int find,int size,int i)
{
  if(i>=size)
  return -1;
  if(arr[0]==find)
  return i;
  else
  return linearSearch(arr+1,find,size,i+1);
}

//main Function
int main(){
//enter size of element
int n,x;
cout<<"enter number of element :- ";
cin>>n;

//create dynamic array
int *arr=new int[n];

for(int i=0;i<n;i++)
//enter elements
cin>>arr[i];

cout<<"enter element to be search :-";
cin>>x;

int ans=linearSearch(arr,x,n,0);
if(ans==-1)
cout<<x<<" is not found";
else
cout<<x<<" is found at "<<ans<<" index";
delete(arr);
}
