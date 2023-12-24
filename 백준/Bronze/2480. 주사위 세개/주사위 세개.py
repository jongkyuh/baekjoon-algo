a,b,c=input().split()

num1 = int(a)
num2 = int(b)
num3 = int(c)

if num1==num2==num3:
    print(10000+num1*1000)
elif num1==num2 and num2!=num3:
    print(1000+num1*100) 
elif num2==num3 and num3!=num1:
    print(1000+num2*100)
elif num1==num3 and num3!=num2:   
    print(1000+100*num1) 
else:
    if num1>num2 and num1>num3:
        print(num1*100)
    elif num2>num1 and num2>num3:
        print(num2*100)
    else:
        print(num3*100)            
