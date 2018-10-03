<?php  
function search($arr, $n, $x) 
{ 
    $i; 
    for ($i = 0; $i < $n; $i++) 
        if ($arr[$i] == $x) 
        return $i; 
    return -1; 
} 
?> 
