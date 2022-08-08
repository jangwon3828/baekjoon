import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            long he = 1;
            long bo = 1;
            int b = sc.nextInt();
            int c = sc.nextInt();
            int fo = Math.min(c - b, b);
            for (int j = 0; j < fo; j++) {
                he *= c - j;
            }
            for (int j = 1; j <= fo; j++) {
                bo *= j;
            }
            long re = he / bo;
            System.out.println(re);
        }
    }
}
