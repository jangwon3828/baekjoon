import java.io.*;
import java.util.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bf.readLine());
        int[] arr = new int[count];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int check = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        Arrays.sort(arr);
        for (int x = 0; x < check; x++) {
            card(arr, Integer.parseInt(st.nextToken()));
        }
        System.out.println(sb);
    }

    public static void card(int[] arr, int num) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;

        while (leftIndex <= rightIndex) {
            int midIndex = (leftIndex + rightIndex) / 2;
            int mid = arr[midIndex];

            if (num < mid) rightIndex = midIndex - 1;
            else if (num > mid) leftIndex = midIndex + 1;
            else {
                sb.append("1").append(" ");
                return;
            }

        }
        sb.append("0").append(" ");
    }

}