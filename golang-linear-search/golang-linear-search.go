package main
import  "fmt"
func main() {
	var n int;
	var fg bool;
	fg=false;
	fmt.Print("Enter the number of element:  ")
	fmt.Scanf("%d",&n);
	data :=  make([]int, n, 2*n);
	for i :=0; i<n; i++ {
		fmt.Print("index ",i,": ")
		fmt.Scanf("%d",&data[i]);
	}
	fmt.Print("Enter element to search:  ");
	var element int;
	fmt.Scanf("%d", &element);
	for i := 0; i< n; i++ {
		if(data[i]==element){
			fmt.Println("FOUND Index is: ",i);
			fg = true;
			break;
		}
	}
	if(!fg){
		fmt.Println("Not FOUND");
	}
}
