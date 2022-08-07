import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = b % d == 0 ? b / d : b / d + 1;
        int g = c % e == 0 ? c / e : c / e + 1;
        if (f > g) {
            System.out.println(a - f);
            System.exit(0);
        }
        System.out.println(a - g);

    }
}
