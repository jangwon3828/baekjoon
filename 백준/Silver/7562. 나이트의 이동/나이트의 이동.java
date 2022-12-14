import java.util.*;

public class Main {
    private static int n;
    private static int startX;
    private static int startY;
    private static int endX;
    private static int endY;
    private static boolean[][] visit;
    private static int[] dx = new int[]{2, 2, -2, -2, 1, 1, -1, -1};
    private static int[] dy = new int[]{1, -1, 1, -1, 2, -2, 2, -2};
    private static Queue<int[]> queue;
    private static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        queue = new LinkedList<>();
        while (count-- > 0) {
            n = sc.nextInt();
            startX = sc.nextInt();
            startY = sc.nextInt();
            endX = sc.nextInt();
            endY = sc.nextInt();
            visit = new boolean[n][n];
            bfs(new int[]{startX, startY,0});
        }
    }

    private static void bfs(int[] arr) {
        queue.clear();
        queue.add(arr);
        visit[arr[0]][arr[1]] = true;
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int nowX = poll[0];
            int nowY = poll[1];
            int count = poll[2];
            if(nowX==endX&&nowY==endY){
                System.out.println(count);
                return;
            }
            for (int i = 0; i < 8; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];
                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= n) continue;
                if (!visit[nextX][nextY]){
                    queue.add(new int[]{nextX, nextY, count + 1});
                    visit[nextX][nextY] = true;
                }
            }
        }
    }

}