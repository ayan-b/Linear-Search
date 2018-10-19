import std.stdio;
int main(){
	
	int n,x;
	int arr[1000];
	
	writeln("Enter the number of elements in array: ");
	readf("%d",&n);
	
	writefln("Enter %d integer(s): ",n);	// writefln is used to write according to the format of arguments
	for(int i = 0; i < n; i++ ){
		scanf("%d",&arr[i]);
	}

	writeln("Enter a number to search");
	scanf("%d",&x);
	
	int pos,flag=0;
	
	for( int i = 0; i < n; i++ ){
		if( x == arr[i] ){
			flag = 1;
			pos = i;
			break;
		}
	}
	
	if ( flag == 1 )
		writefln("Number found at index: %d",pos);
	else	
		writeln("Number not found");
	
	return 0;
}
