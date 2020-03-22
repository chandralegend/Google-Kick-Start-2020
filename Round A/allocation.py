from itertools import combinations

ntest = int(input())
def solve(arr,n,k):
    maxLen = 0
    i = 1
    while i > maxLen and i <= n:
        for subarr in combinations(arr,i):
            if sum(subarr) <= k and len(subarr) > maxLen:
                maxLen = len(subarr)
        if i < maxLen:
            i = maxLen +1
        else:
            i += 1
    return maxLen
for x in range(ntest):
    n, maximum = list(map(int,input().strip().split()))
    arr = list(map(int,input().strip().split()))
    answer = solve(arr,n,maximum)
    print("Case #" + str(x+1) + ": " + str(answer))
    


