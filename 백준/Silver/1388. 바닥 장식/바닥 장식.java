import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            String s = bf.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = s.charAt(j);
            }
        }
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        int count = 0;
        for (int i = 0; i < n; i++) {
            int tmp = 0;
            for (int j = 0; j < m; j++) {
                if (map[i][j] == '|') {
                    tmp = 0;
                } else if (++tmp == 1) {
                    count++;
                }
            }
        }
        for (int j = 0; j < m; j++) {
            int tmp = 0;
            for (int i = 0; i < n; i++) {
                if (map[i][j] == '-') {
                    tmp = 0;
                } else if (++tmp == 1) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}