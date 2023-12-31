arr = []
arr_check = []
for x in range(30):
    arr_check.append(x+1)

for x in range(28):
    a = int(input())
    arr_check.remove(a)

a = arr_check[0]
b = arr_check[1]

print(a,b)

