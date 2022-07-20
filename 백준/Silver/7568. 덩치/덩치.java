import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int[][] arr = new int[a][2];
        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        for (int x = 0; x < a; x++) {
            int count = 1;
            for (int y = 0; y < a; y++) {

                if (arr[x][0] < arr[y][0] && arr[x][1] < arr[y][1]) {
                    count++;
                }
            }
            sb.append(count).append(" ");
        }
        System.out.println(sb);

    }
}