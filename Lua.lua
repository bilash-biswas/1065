array = {}
count = 0
sum = 0
for i = 1,5 do
    array[i] = io.read("*n")
end
for i = 1,5 do
    if array[i] % 2 == 0 then
        count = count + 1
    end
end
print(count.." valores pares")
