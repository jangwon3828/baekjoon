import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum1 = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
        int sum2 = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
        if (sum1 > sum2) {
            System.out.println(sum1);
            System.exit(0);
        }
        System.out.println(sum2);
    }
}
