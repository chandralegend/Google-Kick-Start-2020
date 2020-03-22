from itertools import permutations
ntest = int(input())
def solve(stacks,n,k,p):
    maximum = 0
    for perm in permutations(range(0,k+1),n):
        if sum(perm) == p:
            max_temp = 0
            for x in range(n):
                max_temp +=  sum(stacks[x][:perm[x]])
            if max_temp > maximum:
                print(perm)
                maximum = max_temp
    return maximum
for x in range(ntest):
    n,k,p = list(map(int,input().strip().split()))
    stacks = []
    for _ in range(n):
        stack = list(map(int,input().strip().split()))
        stacks.append(stack)
        
    answer = solve(stacks,n,k,p)
    print("Case #" + str(x+1) + ": " + str(answer))