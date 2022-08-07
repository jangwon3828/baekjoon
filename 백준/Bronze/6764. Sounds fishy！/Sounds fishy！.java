import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
        if (a[0] == a[1] && a[1] == a[2] && a[2] == a[3]) {
            System.out.println("Fish At Constant Depth");
            System.exit(0);
        }
        if (a[0] > a[1] && a[1] > a[2] && a[2] > a[3]) {
            System.out.println("Fish Diving");
            System.exit(0);
        }
        if (a[0] < a[1] && a[1] < a[2] && a[2] < a[3]) {
            System.out.println("Fish Rising");
            System.exit(0);
        }
        System.out.println("No Fish");


    }
}
