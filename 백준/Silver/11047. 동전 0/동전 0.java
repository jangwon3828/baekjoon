import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int filter = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());
        int count = 0;
        int[] arr = new int[filter];
        for (int i = 0; i < filter; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
        }
        for (int x = arr.length - 1; x >= 0; x--) {
            if (money / arr[x] > 0) {
                count += money / arr[x];
                money %= arr[x];
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(count);
        System.out.println(sb);
    }
}