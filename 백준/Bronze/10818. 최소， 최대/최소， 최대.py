#풀이1

# a = int(input())

# list = list(map(int,input().split()))

# print(min(list),max(list))

#풀이2

a = int(input())

list = list(map(int,input().split()))

min = list[0]
max = list[0]


for x in range(a): 
    
    if min<list[x]:
        min = min
    else:
        min = list[x]

for x in range(a):
    if max>list[x]:
        max = max
    else:
        max = list[x]    

print(min,max)
