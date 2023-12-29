a = int(input())

for x in range(a):
    sum = " "*(a-(x+1))
    sum += "*"*(x+1)
    print(sum)