inputfirst = int(input())
inputsecond = int(input())

first = (inputsecond%100)%10
second = (inputsecond%100)//10
third = inputsecond//100

print(inputfirst*first)
print(inputfirst*second)
print(inputfirst*third)
print(inputfirst*inputsecond)