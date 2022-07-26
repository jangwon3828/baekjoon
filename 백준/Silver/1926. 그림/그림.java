import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    public static Deque<Point> dq = new LinkedList<>();
    static int[] dy = new int[]{0, 1, 0, -1};
    static int[] dx = new int[]{1, 0, -1, 0};
    static int n;
    static int m;

    static int[][] arr;
    static boolean[][] check;

    public static int bfs(int y, int x) {
        dq.add(new Point(y, x));
        int re = 1;
        while (!dq.isEmpty()) {
            Point point = dq.poll();

            for (int i = 0; i < 4; i++) {
                int ny = point.x + dy[i];
                int nx = point.y + dx[i];
                if ((ny >= 0 && ny < n) && (nx >= 0 && nx < m)) {
                    if ((arr[ny][nx] == 1) && (!check[ny][nx])) {
                        check[ny][nx] = true;
                        re++;
                        dq.add(new Point(ny, nx));
                    }
                }
            }
        }
        return re;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        int i, j;
        for (i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            for (j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int count = 0;
        int max = 0;
        check = new boolean[n][m];
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (arr[i][j] == 1 && !check[i][j]) {
                    check[i][j] = true;
                    count++;
                    max = Math.max(max, bfs(i, j));

                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(count).append("\n");
        sb.append(max).append("\n");
        System.out.println(sb);

    }


}