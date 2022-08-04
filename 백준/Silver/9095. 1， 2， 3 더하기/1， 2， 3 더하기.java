import java.io.*;
public class Main {
    static int dp[] = new int [11];

    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        int t = Integer.parseInt(bf.readLine());
        dp[1] =1;
        dp[2]=2;
        dp[3]=4;

        for(int j=4;j<=10;j++) {
            dp[j] = dp[j-3] + dp[j-2] + dp[j-1];
        }

        for(int i=0;i<t;i++) {
            int n = Integer.parseInt(bf.readLine());
            sb.append(dp[n]).append("\n");
        }

        System.out.println(sb);

    }

}