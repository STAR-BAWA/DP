public class TriboNacci {

    public static int TriboNacci(int n){
        if(n==0||n==1||n==2)return 0;

        if(n==3){
            return 1;
        }

        else {
         return TriboNacci(n-1)+
                TriboNacci(n-2)+
                TriboNacci(n-3);
        }
    }
    public static int printTribDP(int n,int []dp){
        if(n==0||n==1||n==2)return dp[n]=0;
        if(dp[n]!=-1)return dp[n];

        if(n==3)return dp[n]= 1;

        else return dp[n]=printTribDP(n-1, dp)+printTribDP(n-2, dp)+printTribDP(n-3, dp);
    }
    static void printTrib(int n)
    {
        // dp vector to store subproblems
        int[] dp = new int[n + 1];
        for (var i = 0; i <= n; i++)
            dp[i] = -1;
        for (int i = 1; i <= n; i++)
            System.out.print(printTribDP(i, dp) + " ");
    }
    public static void main(String[] args) {
        int n = 10;
        printTrib(n);
    }
}
