import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int[] arr2 = new int[count];
        int check = 0;
        for (int i = 0; i < count; i++) {
            check += arr[i];
            arr2[i] = check;
        }
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += arr2[i];
        }

        StringBuilder sb = new StringBuilder();
        sb.append(sum);
        System.out.println(sb);
    }
}