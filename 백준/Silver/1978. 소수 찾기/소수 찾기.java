import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] check = new boolean[1001];

        check[0]=true;
        check[1]=true;
        check[1000]=true;
        for (int i = 2; i < 1000; i++) {
            if (check[i]) continue;
            for (int j = 2; j < 1000; j++) {
               int num=i*j;
                if (num >= 1000) break;
                check[num] = true;
            }
        }
        int cnt = 0;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            cnt += check[temp] ? 0 : 1;
        }
        System.out.println(cnt);
    }
}
