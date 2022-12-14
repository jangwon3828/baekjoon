import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static int[][] map;
    private static int n;
    private static int m;
    private static boolean[][] visit;
    private static int[] dx = new int[]{0, 0, 1, -1,1,1,-1,-1};
    private static  int[] dy = new int[]{1, -1, 0, 0,-1,1,1,-1};
    private static  Queue<int[]> queue;


    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        while (true){
            m = sc.nextInt();
            n = sc.nextInt();
            queue = new LinkedList<>();
            map = new int[n][m];
            visit = new boolean[n][m];
            if(n+m==0) break;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int temp=sc.nextInt();
                    map[i][j] = temp;
                }
            }
            int answer=0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(!visit[i][j]&&map[i][j]==1){
                        answer++;
                        bfs(new int[]{i,j});
                    }
                }
            }
            sb.append(answer).append("\n");
        }


        System.out.println(sb);
    }

    private static void bfs(int[] arr) {
        queue.add(arr);
        visit[arr[0]][arr[1]] = true;
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int nowX = poll[0];
            int nowY = poll[1];
            for (int i = 0; i < 8; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];
                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= m) continue;
                if (visit[nextX][nextY]) continue;
                if (map[nextX][nextY]==1) {
                    queue.add(new int[]{nextX, nextY});
                    visit[nextX][nextY] = true;
                }
            }
        }
    }

}