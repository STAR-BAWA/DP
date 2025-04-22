import java.util.ArrayList;
import java.util.List;

public class minCost {
    public static void main(String[] args) {
             List<List<Integer>> cost = new ArrayList<>();
        cost.add(List.of(1, 2, 3));
        cost.add(List.of(4, 8, 2));
        cost.add(List.of(1, 5, 3));

        int m = cost.size();
        int n = cost.get(0).size();

      
      
        System.out.println(minCostFunc(cost, m - 1, n - 1));
    }
    static int minCostTop(int [][]cost ,int m,int n){
        int temp[][]=new int[m+1][n+1];
        int sum=0;
        for(int i=0;i<=n;i++){
            temp[i][0]=sum+cost[0][i];
            sum=temp[0][i];
        }

        for(int i=0;i<=m;i++){
            temp[0][i]=sum+cost[0][0];
            sum=temp[i][0];
        }

        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                temp[i][j] = cost[i][j] + Math.min(Math.min(temp[i-1][j], temp[i][j-1]), temp[i-1][j-1]);
            }
        }
        return temp[m-1][n-1];
    }
    // static int minCostFunc(List<List<Integer>> cost, int m, int n) {
        
    //     if(m<0 || n<0){
    //         return Integer.MAX_VALUE;
    //     }

    //     //starting cell
    //     if(m==0 && n==0){
    //         return cost.get(m).get(n);
    //     }
    //     return cost.get(m).get(n) + Math.min(
    //             Math.min(minCostFunc(cost, m, n - 1),
    //                      minCostFunc(cost, m - 1, n)),
    //             minCostFunc(cost, m - 1, n - 1));
    // }
}
