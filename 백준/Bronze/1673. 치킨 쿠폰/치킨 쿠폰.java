import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = br.readLine();
            if (s == null) {
                break;
            }
            String[] inputs = s.split(" ");
            int n = Integer.parseInt(inputs[0]);
            int k = Integer.parseInt(inputs[1]);
            System.out.println(chicken(n, 0, k));

        }
    }

    private static int chicken(int coupon, int ordered, int k) {
        if (coupon < k) {
            return ordered + coupon;
        }
        return chicken((coupon / k) + (coupon % k), ordered + (coupon - coupon % k), k);
    }
}