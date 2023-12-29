n = int(input())

data = list(map(int,input().split()))

v = int(input())

count = 0

for x in range(n):
    if data[x] == v:
        count+=1

print(count)