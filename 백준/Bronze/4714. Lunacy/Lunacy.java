import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            double a = sc.nextDouble();
            if (a < 0) System.exit(0);

            String b = String.format("Objects weighing %.2f on Earth will weigh %.2f on the moon.", a, a *0.167);
            System.out.println(b);
        }
    }
}