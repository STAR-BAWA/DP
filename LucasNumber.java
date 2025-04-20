import java.math.BigInteger;
import java.util.*;
public class LucasNumber {

    public static BigInteger printLucasDP(int n,BigInteger []memo){
        
        if(n==0)return memo[n]=BigInteger.valueOf(2);
        if(n==1)return memo[n]=BigInteger.valueOf(1);

        if(memo[n]!=null)return memo[n];
        return memo[n]=printLucasDP(n-1,memo).add(printLucasDP(n-2,memo));
    }
    static void printLucas(int n){
       BigInteger memo[]=new BigInteger[n+1];
       

       
       printLucasDP(n,memo);
    
       for(int i=0;i<memo.length;i++){
        System.out.print(memo[i]+" ");
       }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
       printLucas(n);
       sc.close();
    }
}
