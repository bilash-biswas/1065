a = Array.new()
for j in 1..5
  a[j] = gets().chomp().to_i
end
count = 0
for j in 1..5
  if a[j] % 2 == 0
    count = count + 1
  end
end
printf("%d valores pares\n", count);
