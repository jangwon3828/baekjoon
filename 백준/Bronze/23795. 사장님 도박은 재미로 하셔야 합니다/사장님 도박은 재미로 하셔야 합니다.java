import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int a = sc.nextInt();
            if (a == -1) {
                break;
            }

            sum += a;

        }
        System.out.println(sum);
    }
}