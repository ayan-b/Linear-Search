# prompt the user for number of elements
print "Enter number of Elements: ";
chomp($num = <STDIN>);
# prompt the user for entering the elements
print "Enter the Elements: ";
for ( $i = 0; $i < $num; ++$i ) {
   $array[ $i ] = <STDIN>;   
}

# prompt the user for a search key ot the element to search
print "Enter an integer search key: ";
chomp ( $searchKey = <STDIN> );

$flag = 0;   # $flag is initially false

for ( $i = 0; $i < @array && !$flag; ++$i ) {

   if ( $array[ $i ] == $searchKey ) {
      $index = $i;   
      $flag = 1;    
   }
}

if ( $flag ) {      # $flag == 1
   print "Found $searchKey at index $index \n";
}
else {               # $flag == 0
   print "Not Found! \n";
}
