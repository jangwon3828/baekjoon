import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] map = new int[n][m];
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {;
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
                if (map[i][j] == 1)
                    queue.add(new int[]{i, j});
            }
        }
        int[] dx = new int[]{0, 0, 1, -1};
        int[] dy = new int[]{1, -1, 0, 0};
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int nowX = poll[0];
            int nowY = poll[1];
            for (int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];
                if (nextX < 0 || nextY < 0 || nextY >= m || nextX >= n) continue;
                if (map[nextX][nextY] == 0) {
                    queue.add(new int[]{nextX, nextY});
                    map[nextX][nextY] = map[nowX][nowY] + 1;
                }
            }
        }
        int result = Integer.MIN_VALUE;
       a: for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(map[i][j]==0){
                    result=0;
                    break a;
                }
                result = Math.max(map[i][j], result);
            }
        }
        System.out.println(result-1);
    }
}