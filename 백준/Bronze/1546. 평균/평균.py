a = int(input())
li = list(map(int,input().split()))
max_num = max(li)

hap = 0
avg = 0
for i in range(len(li)):
    li[i] = li[i] / max_num * 100

hap = sum(li)




print(hap / len(li))
