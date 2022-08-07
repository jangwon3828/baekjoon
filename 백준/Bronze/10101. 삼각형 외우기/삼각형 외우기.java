import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()};
        if (a[0] + a[1] + a[2] == 180) {
            if (a[0] == a[1]) {
                if (a[1] == a[2]) {
                    System.out.println("Equilateral");
                    System.exit(0);
                } else {
                    System.out.println("Isosceles");
                    System.exit(0);
                }
            }
            else if (a[1] == a[2]) {
                System.out.println("Isosceles");
                System.exit(0);
            }
            else if (a[0] == a[2]) {
                System.out.println("Isosceles");
                System.exit(0);
            }else {
                System.out.println("Scalene");
                System.exit(0);
            }
        }
        System.out.println("Error");
    }
}