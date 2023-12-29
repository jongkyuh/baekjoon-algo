input_hour,input_minute = map(int,input().split())
need_time = int(input())

hour = 0
minute = 0 

while True:
    if need_time>=60:
        hour+=1
        need_time = need_time-60
    else:
        break    

if need_time + input_minute >= 60:
    hour+=1
    minute = (need_time+input_minute) - 60
else:
    minute = need_time + input_minute
    

hour = input_hour + hour

if hour >= 24:
    hour = hour-24

print(f"{hour} {minute}")

       