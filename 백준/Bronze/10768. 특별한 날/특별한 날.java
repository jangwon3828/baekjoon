import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if ((a > 2 || (a == 2 && b > 18))) {
            System.out.println("After");
            System.exit(0);
        }
        if (a == 2 && b == 18) {
            System.out.println("Special");
            System.exit(0);
        } else
            System.out.println("Before");

    }
}