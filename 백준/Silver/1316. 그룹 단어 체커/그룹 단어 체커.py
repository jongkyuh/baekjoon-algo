num = int(input())
answer = num
for i in range(num):
    b = input()
    for j in range(len(b)-1):
        if b[j] == b[j+1]:
            continue
        elif b[j] in b[j+1:]:
            answer -= 1
            break

print(answer)

    
