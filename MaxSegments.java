public class MaxSegments {

    static int maxCutHelper(int n, int x,int y,int z,int []memo) {
        
        if(n==0){
            return 0;
        }

        if(n<0){
            return -1;
        }

        if(memo[n]!=-1){
            return memo[n];
        }

        int cut1=maxCutHelper(n-x, x, y, z, memo);
        int cut2=maxCutHelper(n-y, x, y, z, memo);
        int cut3=maxCutHelper(n-z, x, y, z, memo);

        int maxCut=Math.max(cut1,Math.max(cut2,cut3));

        if(maxCut==-1){
            return memo[n]=-1;
        }

        return memo[n]=maxCut+1;
    }
    static int maximizeTheCuts(int n,int x,int y,int z){
        int []dp=new int[n+1];
        java.util.Arrays.fill(dp, -1);

        int res=maxCutHelper(n,x,y,z,dp);

        if(res==-1)return 0;
        return res;


    }
    public static void main(String[] args) {
        int n = 11;
        int x = 2, y = 3, z = 5;  

        System.out.println(maximizeTheCuts(n, x, y, z));
    }
}