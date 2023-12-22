c,d=input().split(' ')
a=int(c)
b=int(d)

if a>0:
    if b>=45:
        print(f"{a} {b-45}")
    else:
        print(f"{a-1} {60-(45-b)}")
else:
    if b>=45:
        print(f"0 {b-45}")    
    else:
        print(f"23 {60-(45-b)}")            