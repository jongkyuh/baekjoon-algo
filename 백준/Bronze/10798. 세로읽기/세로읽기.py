st = []
for i in range(5):
    st.append(input())

for j in range(15):
    for i in range(5):
        if len(st[i])>=j+1:
            print(st[i][j],end="")
        else:
            continue
        


