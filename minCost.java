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
    static int minCostFunc(List<List<Integer>> cost, int m, int n) {
        
        if(m<0 || n<0){
            return Integer.MAX_VALUE;
        }

        //starting cell
        if(m==0 && n==0){
            return cost.get(m).get(n);
        }
        return cost.get(m).get(n) + Math.min(
                Math.min(minCostFunc(cost, m, n - 1),
                         minCostFunc(cost, m - 1, n)),
                minCostFunc(cost, m - 1, n - 1));
    }
}
