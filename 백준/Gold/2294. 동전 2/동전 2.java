import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] dp=new int[k+1];

        for(int i=1;i<=k;i++){
            dp[i]=Integer.MAX_VALUE-1;
        }

        for(int i=1;i<=n;i++){
            for(int j=arr[i];j<=k;j++){
                dp[j]=Math.min(dp[j],dp[j-arr[i]]+1);
            }
        }

        if(dp[k]==Integer.MAX_VALUE-1)
            System.out.println(-1);
        else
            System.out.println(dp[k]);
    }
}
