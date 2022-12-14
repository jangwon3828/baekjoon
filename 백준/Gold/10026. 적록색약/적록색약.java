import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static Character[][] map;
    private static Character[][] colorMap;
    private static int n;
    private static boolean[][] visit;
    private static boolean[][] colorVisit;
    private static int[] dx = new int[]{0, 0, 1, -1};
    private static  int[] dy = new int[]{1, -1, 0, 0};
    private static  Queue<int[]> queue = new LinkedList<>();


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());
        map = new Character[n][n];
        colorMap = new Character[n][n];
        visit = new boolean[n][n];
        colorVisit = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            String s = bf.readLine();
            for (int j = 0; j < n; j++) {
                char c = s.charAt(j);
                map[i][j] = c;
                colorMap[i][j] = c == 'G' ? 'R' : c;
            }
        }
        int answer=0;
        int answer2=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(!visit[i][j]){
                    answer++;
                    bfs(new int[]{i,j});
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(!colorVisit[i][j]){
                    answer2++;
                    bfs2(new int[]{i,j});
                }
            }
        }
        System.out.println(answer + " "+answer2);
    }

    private static void bfs(int[] arr) {
        queue.add(arr);
        visit[arr[0]][arr[1]] = true;
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int nowX = poll[0];
            int nowY = poll[1];
            Character nowChar = map[nowX][nowY];
            for (int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];
                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= n) continue;
                if (visit[nextX][nextY]) continue;
                if (nowChar==(map[nextX][nextY])) {
                    queue.add(new int[]{nextX, nextY});
                    visit[nextX][nextY] = true;
                }
            }
        }
    }
    private static void bfs2(int[] arr) {
        queue.add(arr);
        colorVisit[arr[0]][arr[1]] = true;
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int nowX = poll[0];
            int nowY = poll[1];
            Character nowChar = colorMap[nowX][nowY];
            for (int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];
                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= n) continue;
                if (colorVisit[nextX][nextY]) continue;
                if (nowChar==(colorMap[nextX][nextY])) {
                    queue.add(new int[]{nextX, nextY});
                    colorVisit[nextX][nextY] = true;
                }
            }
        }
    }
}