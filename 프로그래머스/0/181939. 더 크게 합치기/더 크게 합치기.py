def solution(a, b):
    n = str(a)
    m = str(b)
    num = int(n + m)    
    num2 = int(m + n)
    if num < num2 : 
        return num2
    else :
        return num
    