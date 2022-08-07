import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = (a + b) / 2;
        int y = a - x;
        if (y > x) {
            int tem = x;
            x = y;
            y = tem;
        }
        int temp = x - y;
        if ((temp == b && x >= 0 && y >= 0) || (temp == b * -1 && x >= 0 && y >= 0)) {
            System.out.println(x + " " + y);
        } else {
            System.out.println("-1");
        }

    }
}
