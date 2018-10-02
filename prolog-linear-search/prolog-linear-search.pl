/*Linear Search in Prolog*/
linearSearch([Key|_], Key).

linearSearch([], _) :- fail. 
linearSearch([_|Tail], Key) :- linearSearch(Tail, Key).

go :- 
	write('Enter List : '),
	read(List),
	write('Enter Key : '),
	read(Key),
	linearSearch(List, Key),	
	write('Element Found');write('Element not found').

:-initialization(go).	
