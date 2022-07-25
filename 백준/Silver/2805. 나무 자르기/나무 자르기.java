import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int count = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        long arr[] = new long[count];
        long start = 0;
        long end = 0;
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < count; i++) {
            int temp = Integer.parseInt(st.nextToken());
            arr[i] = temp;
            end=Math.max(arr[i],end);
        }

 

        while (start<end) {
            long mid = (end + start) / 2;
            long hi = 0;
            for (int x = 0; x < arr.length; x++) {
                int a = (int) (arr[x] - mid);
                if (a > 0) {
                    hi += a;
                }
            }
            if (hi >= num) {
                start = mid+1;
            } else {
                end = mid;
            }
        }
        System.out.println(start-1);

    }
}