import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[]{s.nextInt(), s.nextInt(), s.nextInt()};
        int b = a[0] * a[1] - a[2];
        System.out.println(b >= 0 ? b : 0);
    }
}