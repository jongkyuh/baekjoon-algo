a,b = list(input().split())

a = a[::-1]
b = b[::-1]

a = ''.join(a)
a = int(a)

b = ''.join(b)
b = int(b)

if a > b:
    print(a)
else:
    print(b)