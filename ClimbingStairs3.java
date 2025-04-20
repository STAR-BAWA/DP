import java.util.ArrayList;

public class ClimbingStairs3 {

    public static int climbStairsMemo(int n,ArrayList<Integer> memo){

        if(n==1 ||n==2 || n==3){
            return 1;
        }

        if(n==0)return 0;

        if(n<0)return Integer.MAX_VALUE;

        if(memo.get(n)!=-1)return memo.get(n);

        int min1=climbStairsMemo(n-1,memo);
        int min2=climbStairsMemo(n-2,memo);
        int min3=climbStairsMemo(n-3,memo);

        int minSteps=Math.min(min1,Math.min(min2,min3));
        if(minSteps!=Integer.MAX_VALUE){
            minSteps+=1;
        }
        memo.set(n, minSteps);
        return minSteps;
    }
    public static int climbStairs(int n){

        ArrayList<Integer> memo=new ArrayList<>();
        for(int i=0;i<=n;i++){
            memo.add(-1);
        }
        return climbStairsMemo(n,memo);
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(climbStairs(n));
        
    }
}
