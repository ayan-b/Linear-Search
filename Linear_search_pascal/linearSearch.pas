program LinearSearch;
  {$Apptype Console}
const
  UPPER_BOUND = 9;

  arr : array[1 .. UPPER_BOUND ] of string = ('Mohit', 'Yadav', 'Yooo',
                   'You', 'are', 'Going', 'to', 'win', 'hacktoberfest');
var
  l, c : integer;
  f : Boolean;
  name : string;
begin
  c := 1;
  f := false;
  write('Enter the name');
  readln(name);
  while (c <= UPPER_BOUND) and (not f) do
    begin
      if arr[c] = name then
        begin
          writeln(name, ' is in position ', c);
          f := true;
        end
      else
         c := c + 1;
    end;
    if not f then
      begin
        writeln(name, ' is not in the list.');
      end;
    readln;
end.
