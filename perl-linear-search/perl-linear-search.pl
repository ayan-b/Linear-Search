# populate @array with integers from 0 to 99
for ( $i = 0; $i < 100; ++$i ) {
   $array[ $i ] = $i;
}

print "Enter an integer number: ";
chomp ( $number = <STDIN> );

$found = 0;

for ( $i = 0; $i < @array && !$found; ++$i ) {

   if ( $array[ $i ] == $number ) {
      $index = $i;
      $found = 1;
   }
}

if ( $found ) {
   print "Found $number ! \n";
}
else {
   print "$number not found \n";
}
