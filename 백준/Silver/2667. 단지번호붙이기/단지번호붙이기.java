import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int each;
    static int[] dy = new int[]{0, 1, 0, -1};
    static int[] dx = new int[]{1, 0, -1, 0};
    static ArrayList<Integer> result;
    static int[][] arr;
    static boolean[][] check;

    public static void dfs(int y, int x) {
        each++;
        for (int i = 0; i < 4; i++) {

            int ny = y + dy[i];
            int nx = x + dx[i];
            if ((ny >= 0 && ny < n) && (nx >= 0 && nx < n)) {
                if (arr[ny][nx] == 1 && !check[ny][nx]) {
                    check[ny][nx] = true;
                    dfs(ny, nx);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken());
        arr = new int[n][n];
        int i, j;
        for (i = 0; i < n; i++) {
            String temp = bf.readLine();
            for (j = 0; j < n; j++) {
                arr[i][j] = temp.charAt(j) - '0';
            }

        }
        check = new boolean[n][n];
        result = new ArrayList<>();
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (arr[i][j] == 1 && !check[i][j]) {
                    check[i][j] = true;
                    each = 0;
                    dfs(i, j);
                    result.add(each);

                }
            }
        }
        Collections.sort(result);
        StringBuilder sb = new StringBuilder();
        sb.append(result.size()).append("\n");
        for (i = 0; i < result.size(); i++) {
            sb.append(result.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}