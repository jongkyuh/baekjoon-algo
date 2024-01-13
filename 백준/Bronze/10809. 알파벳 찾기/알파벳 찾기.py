a = list(input())
c = "abcdefghijklmnopqrstuvwxyz"

for i in c:
    if i in a:
        print(a.index(i), end=" ")
    else:
        print(-1,end=" ")    

