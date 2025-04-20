n = int(input("Enter a number: "))
memo = {}

def ClimbStairs(n):
    if n == 1:
        return 1
    elif n == 2:
        return 2

    if n in memo:
        return memo[n]

    memo[n] = ClimbStairs(n - 1) + ClimbStairs(n - 2)
    return memo[n]

print(f"Ways to climb {n} stairs: {ClimbStairs(n)}")
