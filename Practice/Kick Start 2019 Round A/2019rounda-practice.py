n_test = int(input())
for x in range(n_test):
    n,p = list(map(int,input().strip().split()))
    scores = list(map(int,input().strip().split()))
    scores.sort()
    min_time = float('inf')
    for i in range(n-p+1):
        div = scores[i:i+p]
        time = p * div[-1] - sum(div)
        if min_time > time:
            min_time = time

    print("Case #" + str(x+1) + ": " + str(min_time))
