import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] hamburger = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int[] drink = new int[]{sc.nextInt(), sc.nextInt()};
        Arrays.sort(hamburger);
        Arrays.sort(drink);

        System.out.println(hamburger[0] + drink[0] - 50);

    }
}
