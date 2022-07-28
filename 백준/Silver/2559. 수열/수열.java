import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int count = n - m + 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < count; i++) {
            int temp = 0;
            for (int j = i; j < m + i; j++) {
                temp += arr[j];
            }
            if (temp > max) {
                max = temp;
            }

        }

        System.out.println(max);
    }
}