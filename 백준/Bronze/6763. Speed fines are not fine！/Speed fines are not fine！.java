import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = (sc.nextInt() - sc.nextInt()) * -1;
        if (a <= 0) {
            System.out.println("Congratulations, you are within the speed limit!");
            System.exit(0);
        } else if (a <= 20) {
            System.out.println("You are speeding and your fine is $100.");
            System.exit(0);
        } else if (a <= 30) {
            System.out.println("You are speeding and your fine is $270.");
            System.exit(0);
        }
        System.out.println("You are speeding and your fine is $500.");


    }
}
