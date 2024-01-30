a = input()
a = a.upper()
a = list(a)
dic = {}

# 딕셔너리에 알파벳키와 나온 횟수를 저장
for i in a:
    if i in dic.keys():
        dic[i] += 1
    else:
        dic[i] = 1

# 가장 많이 나온 알파벳 추출
dic_keys = dic.keys()
dic_values = dic.values()

dic_max_key = max(dic,key = dic.get)
dic_max_value = dic[dic_max_key]


dic_change = [key for key,value in dic.items() if value == dic_max_value]

if len(dic_change) == 1:
    print(dic_max_key)
else:
    print("?")

