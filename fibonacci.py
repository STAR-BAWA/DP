memo={}
def fibonacci(nums):
    if nums in memo:
        return memo[nums]
    
    if nums<=2:
        result=1

    else:
        result=fibonacci(nums-1)+fibonacci(nums-2)

    memo[nums]=result
    return result


print(fibonacci(7))
