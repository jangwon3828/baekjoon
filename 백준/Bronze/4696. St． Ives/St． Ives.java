import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (; ; ) {
            double b = sc.nextDouble();
            if (b == 0) {
                System.exit(0);
            }
            double temp = Math.pow(b, 4) + Math.pow(b, 3) + Math.pow(b, 2) + b + 1;
            System.out.println(String.format("%.2f", temp));

        }

    }
}
