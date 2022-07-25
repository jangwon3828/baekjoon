import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int count = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        long arr[] = new long[count];
        long sum = 0;
        for (int i = 0; i < count; i++) {
            int temp = Integer.parseInt(bf.readLine());
            arr[i] = temp;
            sum += temp;
        }
        long end = sum;
        long start = 1;

        while (true) {
            long mid = (end + start) / 2;
            if (start == mid)
                break;
            ;
            int hi = 0;
            for (int x = 0; x < arr.length; x++) {
                hi += arr[x] / mid;
            }
            if (hi >= num) {
                start = mid;
            } else {
                end = mid;
            }


        }
        StringBuilder sb = new StringBuilder();
        sb.append(start);
        System.out.println(sb);

    }
}