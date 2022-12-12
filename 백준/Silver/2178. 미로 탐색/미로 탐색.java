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
        int[] dx = {-1, 1, 0, 0}; 
        int[] dy = {0, 0, -1, 1}; 


        for (int i = 0; i < n; i++) {
            String s = bf.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }
        boolean[][] visited = new boolean[n][m];
        visited[0][0] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        while (!queue.isEmpty()){
            int now[]=queue.poll();
            int nowX=now[0];
            int nowY=now[1];
            for (int i = 0; i < 4; i++) {
                int nextX=nowX +dx[i];
                int nextY=nowY +dy[i];
                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= m)
                    continue;
                if (visited[nextX][nextY] || map[nextX][nextY] == 0)
                    continue;
                queue.add(new int[] {nextX, nextY});
                map[nextX][nextY] = map[nowX][nowY] + 1;
                visited[nextX][nextY] = true;
            }

        }
        System.out.println(map[n-1][m-1]);
    }
}

