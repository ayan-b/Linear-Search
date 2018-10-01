<?php

function Search($list, $data) {
  $count = count($list);
  for ($i = 0; $i < $count; $i++) {
    if ($data == $list[$i]) return $i;          //if element is found return index of element
  }
  return -1;                                    //else return -1
}

$list = array(153, 26, 364, 72, 321);
$index = Search($list, 0);

if($index == -1) {                              //If the returned value is -1 then not found
  echo "Element not found!"; 
} else {
  echo "Element found in position " . ($index + 1) . "!";   //Else element found and prints the index of element
}

?>
