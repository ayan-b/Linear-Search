program LinearSearchDemo;
const
  UPPER_BOUND = 11;
  WimMultiChamps : array[1 .. UPPER_BOUND ] of string = ('Ram', 'Shyam', 'Chintu',
                   'Pintu', 'Bali', 'Gudiya', 'Ramesh', 'Suresh', 'Mahesh', 'Nadala', 'Mandala');
var
  Last, Count : integer;
  Found : Boolean;
  Name : string;
begin
  Count := 1;
  Found := false;
  write('Enter the name to be found using the correct case e.g. Ram. ');
  readln(Name);
  while (Count <= UPPER_BOUND) and (not Found) do
    begin
      if WimMultiChamps[Count] = Name then
        begin
          writeln(Name, ' is in position ', Count);
          Found := true;
        end
      else
         Count := Count + 1;
    end;
    if not Found then
      begin
        writeln(Name, ' is not in the list.');
      end;
    readln;
end.