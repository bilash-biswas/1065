var 
s:int64;
i:integer;
a:int64;
begin
   s := 0;
   for i := 1 to 5 do
   begin
      read(a);
      if((a mod 2) = 0)then
      begin
         s := s + 1;
      end;
   end;
   writeln(s ,' valores pares');
end.
