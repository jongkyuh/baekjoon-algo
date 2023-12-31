arr = []

for x in range(9):
    a = int(input())
    arr.append(a)

max = max(arr)
max_index = arr.index(max)

print(max)
print(max_index+1)
