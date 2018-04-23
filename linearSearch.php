<?php

function Search($list, $data) {
  $count = count($list);
  for ($i = 0; $i < $count; $i++) {
    if ($data == $list[$i]) return $i;
  }
  return -1;
}

$list = array(153, 26, 364, 72, 321);
$index = Search($list, 0);

if($index == -1) {
  echo "Element not found!"; 
} else {
  echo "Element found in position " . ($index + 1) . "!";
}

?>
