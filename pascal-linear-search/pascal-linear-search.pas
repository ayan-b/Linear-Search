program linearSearch;
var
	N, i, X, flag, pos : integer;
	arr : array[1..1000] of integer;
begin
	writeln('Enter the number of elements in array');
	readln(N);
	writeln('Enter ',N,' integer(s) :');
	for i := 1 to N do
		readln(arr[i]);
	writeln('Enter a number to search');
	readln(X);
	flag := 0;
	for i := 1 to N do
	begin
		if X = arr[i] then
		begin
			flag := 1;
			pos := i;
			break;
		end;
	end;
	if flag = 1 then
		writeln('Number found at ',pos,' position')
	else	
		writeln('Number not found');
end.
