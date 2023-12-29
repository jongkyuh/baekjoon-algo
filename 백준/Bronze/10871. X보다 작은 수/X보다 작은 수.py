import sys

a,b= map(int,sys.stdin.readline().split())

data = list(map(int,sys.stdin.readline().split()))

result = ""
for x in range(a):
    if data[x] < b:
        print(data[x],end=" ",flush=False)


