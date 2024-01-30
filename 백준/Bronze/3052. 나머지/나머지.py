user_input = [0]*10
for i in range(10):
    user_input[i] = int(input())

dic = {}

for i in user_input:
    a = i%42
    if a in dic.keys():
        dic[a] += 1
    else:
        dic[a] = 1

print(len(dic))