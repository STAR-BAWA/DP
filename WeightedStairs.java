import java.util.Arrays;

public class WeightedStairs {
    private static int minCostClimbingStairs(int[] cost) {
        // TODO Auto-generated method stub
       int n=cost.length;

       if(n==1)return cost[0];

       int prev1=cost[0];
       int prev2=cost[1];

       for(int i=2;i<cost.length;i++){
        int curr=cost[i]+Math.min(prev1,prev2);
        prev1=prev2;
        prev2=curr;
       }

       return Math.min(prev1, prev2);
    }

    private static int minCostRecur(int i,int []cost,int[] memo){

        if(i==0 || i==1){
            return cost[i];
        }

        if(memo[i]!=-1)return memo[i];

        return memo[i]=cost[i]+Math.min(minCostRecur(i-1, cost, memo),minCostRecur(i-2, cost, memo));
    }
    static int minCostClimbingStairsDP(int []cost){
        int n=cost.length;
        if(n==1)return cost[0];

        int []memo=new int[n];
        Arrays.fill(memo,-1);

        return Math.min(minCostRecur(n-1, cost, memo),minCostRecur(n-2, cost, memo));
    }
    public static void main(String[] args) {
        int[] cost = { 16, 19, 10, 12, 18 };
        System.out.println(minCostClimbingStairsDP(cost));
    }

}
