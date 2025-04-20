def tribonacci(n):
    h={}
    def tribo(n):
        if n in h:
            return h[n];

        else :
            if(n==0):
                return 0;
            elif(n==1) or (n==2):
                return 1
            else:
                res=tribo(n-3)+tribo(n-2)+tribo(n-1)
                h[n]=res
            
            return res
        
    return tribo(n)


if __name__ == "__main__":
    print(tribonacci(10))