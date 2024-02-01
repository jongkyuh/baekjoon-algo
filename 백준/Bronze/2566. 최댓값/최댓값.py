

arr = [list(map(int,input().split())) for i in range(9)]

max_value = 0
maxarr = [[0,0]]

for i in range(len(arr)):
    for j in range(len(arr)):
        if arr[i][j] >= max_value:
            max_value = arr[i][j]
            maxarr[0] = [i,j]

print(max_value)
print(maxarr[0][0]+1,maxarr[0][1]+1)



