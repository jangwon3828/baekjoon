import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int b = 91 + a[0] + a[1] * 3 + a[2];
        System.out.println("The 1-3-sum is " + b);
    }
}
