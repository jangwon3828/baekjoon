import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int d = sc.nextInt();
            int ans = 0;
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (s * d >= a) ans += b;
            }
            int temp = i + 1;
            System.out.println("Data Set " + temp + ":" + "\n" + ans+"\n");
        }
    }


}