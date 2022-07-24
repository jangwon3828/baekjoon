import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] minus = bf.readLine().split("-");
        int sum = Integer.MAX_VALUE;
        for (int i = 0; i < minus.length; i++) {
            int temp = 0;
            String[] plus = minus[i].split("\\+");
            for (int x = 0; x < plus.length; x++) {
                temp += Integer.parseInt(plus[x]);
            }

            if (sum == Integer.MAX_VALUE) {
                sum = temp;
            } else {
                sum -= temp;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(sum);
        System.out.println(sb);
    }
}