import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = 9;
        int[] arr = new int[n];
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;
                    sum += arr[k];
                }
                if (sum == 100) {
                    for (int k = 0; k < n; k++) {
                        if (k == i || k == j) continue;
                        sb.append(arr[k]).append("\n");
                    }
                    System.out.println(sb);
                    System.exit(0);
                }
            }
        }

    }
}
