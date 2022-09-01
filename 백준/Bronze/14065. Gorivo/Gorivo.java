import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double GALLON2LITER = 3.785411784;
        double MILE2KM = 1.609344;
        double HUNDRED_KM = 100.00;
        Scanner sc = new Scanner(System.in);
        double milesPerGallon = sc.nextDouble();
        double result = HUNDRED_KM / ((MILE2KM / GALLON2LITER) * milesPerGallon);
        System.out.printf("%.6f\n", result);
    }
}