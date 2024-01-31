name_arr = []*20    # ObjectOrientedProgramming1
grade_arr = []*20   # 3.0
score_arr = []*20   # A+

hap = 0.0
esuhakjum = 0

for i in range(20):
    a,b,c = input().split()
    name_arr.append(a)
    grade_arr.append(float(b))
    score_arr.append(c)

for i in range(20):
    if score_arr[i] == "A+":
        hap += 4.5 * grade_arr[i]
        esuhakjum += grade_arr[i]
    elif score_arr[i] == "A0":
        hap += 4.0 * grade_arr[i]
        esuhakjum += grade_arr[i]
    elif score_arr[i] == "B+":
        hap += 3.5 * grade_arr[i]
        esuhakjum += grade_arr[i]
    elif score_arr[i] == "B0":
        hap += 3.0 * grade_arr[i]
        esuhakjum += grade_arr[i]
    elif score_arr[i] == "C+":
        hap += 2.5 * grade_arr[i]
        esuhakjum += grade_arr[i]
    elif score_arr[i] == "C0":
        hap += 2.0 * grade_arr[i]
        esuhakjum += grade_arr[i]
    elif score_arr[i] == "D+":
        hap += 1.5 * grade_arr[i]
        esuhakjum += grade_arr[i]
    elif score_arr[i] == "D0":
        hap += 1.0 * grade_arr[i]
        esuhakjum += grade_arr[i]
    elif score_arr[i] == "F":
        hap += 0.0 * grade_arr[i]
        esuhakjum += grade_arr[i]
    elif score_arr[i] == "P":
        continue

print(hap/esuhakjum)