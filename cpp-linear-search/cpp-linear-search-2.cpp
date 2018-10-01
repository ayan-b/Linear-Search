/* STL IMPLEMENTATION OF LINEAR SEARCH IN C++ 
~By Rahul Suresh (http://github.com/icy-meteor)~*/

//Header Files
#include <iostream>
#include <vector>
using namespace std;

//Main Function
int main()
{
    int a,n,key;
    vector<int> vec;
    vector<int>::iterator it;
    cout<<"Enter number of elements : ";
    cin>>n;
    cout<<"Enter element to search : ";
    cin>>key;
    for(int i=0;i<n;i++) //Pushing elements to vector
    {
        cin>>a;
        vec.push_back(a);
    }
    for(it=vec.begin();it!=vec.end();it++) //Comparing each element with key
    {
        if((*it)==key)
        {
            
            cout<<"Element "<<key<<" found at "<<(it-vec.begin())+1<<" position!";
            return 0;
        }
    }
    
    cout<<"Element not found!";
    return 0;
}
