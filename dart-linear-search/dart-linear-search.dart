import 'dart:io';
import 'dart:core';
import 'dart:collection';

main() {
  
  var list = [10,8,3,2,4];
  var target = 8;
  print(linearSearch(list, target));
  
  /*print("Enter number of elements: ");
  var input = stdin.readLineSync();
  var element = int.parse(input);

  List<int> list;

  for(var i = 0; i < element; i++){
    print("index: $i value: ");
    var inputVal = stdin.readLineSync();
    var value2 = int.parse(inputVal);
    list.add(value2);
  }

  print("which number would you like to search: ");
  var userVal = stdin.readLineSync();
  var userValue = int.parse(userVal);
  print("searching...");
  print(linearSearch(list, userValue));*/

}

String linearSearch(List<int> list, int x){
  for (var i = 0; i < list.length; i++) {
    if(x == list[i]){
      return "Found! index is: $i";
    }
  }

  return "Not found!";
}