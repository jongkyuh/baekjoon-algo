total=int(input())
checknum=int(input())

sum = 0

for x in range(1,checknum+1):
    a,b = input().split(' ')
    c=int(a)
    d=int(b)
    sum+=c*d

if total==sum:
    print("Yes")
else:
    print("No")    
