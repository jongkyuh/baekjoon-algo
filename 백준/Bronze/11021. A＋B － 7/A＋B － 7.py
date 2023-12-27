a = int(input())

for x in range(a):
    b,c = input().split(' ')
    print(f"Case #{x+1}: {int(b)+int(c)}")
