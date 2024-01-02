t = int(input())
arr = []
for _ in range(t):
    s = input()
    plus = s[0]
    plus += s[len(s)-1]
    arr.append(plus)

for x in range(t):
    print(arr[x])