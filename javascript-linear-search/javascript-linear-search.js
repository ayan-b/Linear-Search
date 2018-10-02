function linear()
{
    var n=parseInt(prompt("Enter the size of an array"));
    var a=new Array(n);                                         //Number of elements in the search
    var t=0;
    for(var i=0; i<a.length; i++)
    {
        a[i]=parseInt(prompt("Enter array elements"));          //Input elements
    }
    var k=parseInt(prompt("Enter the key element to search: "));        //Search element
    for(var i=0; i<a.length; i++)
    {
        if(k==a[i])
        {
            t=1;
            break;
        }
    }
    if(t==1)
    {
        document.writeln("Element "+a[i]+ " Found at Position:"+i);                 //Prints the index of element if found
    }
    else
    {
        document.writeln("Element Not Found");                                      //Else if not found
    }
}
const nums = [1, 2, 3, 8, 9, 12];
const target = 2;
for (const num of nums) {
  if (num === target) {
    console.log('Successful Search!');                                              //Writes the output to console if found
    break;
  }
}
