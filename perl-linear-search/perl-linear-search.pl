#Take the input for the array
print "Enter the no of elements in the array ";
chomp ( $size = <STDIN> );
print "Enter the values: ";
for ( $i =0; $i <$size; ++$i){
	my $num = <STDIN>;
    chomp $num;
    push @array, $num;
}

# prompt the user for a search key
print "Enter an integer search key: ";
chomp ( $searchKey = <STDIN> );

$found = 0;   # $found is initially false

for ( $i = 0; $i < @array && !$found; ++$i ) {

   if ( $array[ $i ] == $searchKey ) {
      $index = $i;   
      $found = 1;    
   }
}

if ( $found ) {      # $found == 1
   print "Found $searchKey at subscript $index \n";
}
else {               # $found == 0
   print "$searchKey not found \n";
}
