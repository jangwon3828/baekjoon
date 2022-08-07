import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[]{sc.nextInt(), sc.nextInt()};
        if (a[1] <= 4 && a[0] >= 3) {
            System.out.println("TroyMartian");
        }
        if (a[1] >= 2 && a[0] <= 6) {
            System.out.println("VladSaturnian");
        }
        if (a[1] <= 3 && a[0] <= 2) {
            System.out.println("GraemeMercurian");
        }
    }
}
