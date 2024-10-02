def solution(arr, n):
    for i, a in enumerate(arr) :
        if len(arr) % 2 != 0 and i % 2 == 0 :
            arr[i] += n
        elif len(arr) % 2 == 0 and i % 2 != 0 :
            arr[i] += n
    return arr