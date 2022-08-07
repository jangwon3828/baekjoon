import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int n = s.nextInt();
            sum += n >= 40 ? n : 40;
        }
        System.out.println(sum / 5);

    }
}
