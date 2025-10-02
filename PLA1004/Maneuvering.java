import java.util.*;

public class Maneuvering{
    //need to return the count of possible paths to reach the cell
    static int numberofPath(int m, int n){
        if (m==1|n==1){
            return 1;
        }
        return numberofPath(m-1,n)+numberofPath(m, n-1);

    } 

    static int optimalSolution(int m, int n){
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        for (int i =1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[j]=dp[j]+dp[j-1];
            }
        }
        return dp[n-1];
    }
    public static void main (String args[]){
        int m = 2;
        int n = 3;
        System.out.println(optimalSolution(m,n));

    }

}