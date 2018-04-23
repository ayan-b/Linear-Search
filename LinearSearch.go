package main
  
import "fmt"
 
func linearSearch(myList []int, key int) bool {
    for _, item := range myList {
        if item == key {
            return true
        }
    }
    return false
} 
  
func main() {
    items := []int{1,2,3,8,9,12}
    fmt.Println(linearSearch(items,2))
}
