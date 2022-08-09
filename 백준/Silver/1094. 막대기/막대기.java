import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 1;
        for (; ; ) {
            if (a == 1) {
                System.out.println(count);
                System.exit(0);
            }
            count += a % 2;
            a /= 2;
        }
    }
}