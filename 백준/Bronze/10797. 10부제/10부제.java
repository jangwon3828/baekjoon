import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = 0;
        for (int i = 0; i < 5; i++) {
            if (a == s.nextInt())
                b++;
        }
        System.out.println(b);
    }
}