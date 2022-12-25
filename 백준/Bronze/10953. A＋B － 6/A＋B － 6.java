import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String[] split = sc.next().split(",");
            int num = Integer.parseInt(split[0]) + Integer.parseInt(split[1]);
            System.out.println(num);
        }

    }
}