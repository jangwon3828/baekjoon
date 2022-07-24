import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bf.readLine());
        int[] arr = new int[8001];
        int sum = 0;
        int max = -9000;
        int min = 10000;
        int mid = 10000;
        int fre = 10000;
        int temp = 0;
        for (int i = 0; i < count; i++) {
            int a = Integer.parseInt(bf.readLine());
            sum += a;
            if (a > max) {
                max = a;
            }
            if (a < min) {
                min = a;
            }
            arr[a + 4000]++;
        }

        int b = 0;
        int c = 0;
        boolean d = false;
        for (int i = min + 4000; i <= max + 4000; i++) {

            if (arr[i] > 0) {
                if (b < (count + 1) / 2) {
                    b += arr[i];
                    mid = i - 4000;
                }

                if (c < arr[i]) {
                    c = arr[i];
                    fre = i - 4000;
                    d = true;
                } else if (c == arr[i] && d == true) {
                    fre = i - 4000;
                    d = false;
                }
            }
        }
        System.out.println((int) Math.round((double) sum / count));
        System.out.println(mid);
        System.out.println(fre);
        System.out.println(max - min);

    }
}