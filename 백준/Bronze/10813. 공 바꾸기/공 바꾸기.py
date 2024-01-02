n,m = map(int,input().split())

basket = [0] * n
for x in range(n):
    basket[x] = x+1


for _ in range(m):
    i,j = map(int,input().split())
    
    c = basket[i-1]
    basket[i-1] = basket[j-1]
    basket[j-1] = c

for x in range(n):
    print(basket[x],end=" ")
    
    