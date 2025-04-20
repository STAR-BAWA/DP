import java.util.ArrayList;

public class ClimbingStairs {
    static ArrayList<Integer> arr=new ArrayList<>();
    static int ClimbingStairsRecur(int n){
        while(arr.size()<=n){
            arr.add(-1);
        }
        if(n==0) {
            arr.set(n,1);
            return 1;
        }   
        if(n==1){
            arr.set(n,1);
            return 1;
        }
        if(n==2){
            arr.set(n, 2);
            return 2;
        }

        if(arr.get(n)!=-1)return arr.get(n);
        int res= ClimbingStairsRecur(n-1)+ClimbingStairsRecur(n-2);

        arr.set(n,res);
        return res;
    }
    public static void main(String[] args) {
        int n = 9;
        System.out.println(ClimbingStairsRecur(n));
    }
}
