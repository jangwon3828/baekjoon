import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            int[] a = new int[]{s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()};
            int sum = a[1] + a[2] + a[3];
            if (sum > 54) {
                if (a[1] > 10) {
                    if (a[2] > 7) {
                        if (a[3] > 11) {
                            System.out.println(a[0] + " " + sum + " " + "PASS");
                            continue;
                        }
                    }
                }
            }
            System.out.println(a[0] + " " + sum + " " + "FAIL");
        }
    }
}