import java.util.*;
import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {
        Scanner sc= new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        char[][] map = new char[N + 1][M + 1];
        int[][] visited = new int[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            String s = sc.next();
            for (int j = 1; j <= M; j++)
                map[i][j] = s.charAt(j - 1);
        }

        int startX = sc.nextInt();
        int startY = sc.nextInt();
        int golX   = sc.nextInt();
        int goalY  = sc.nextInt();

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{startX, startY});

       a: while (!q.isEmpty()) {
            int[] cur = q.poll();
            int curRow = cur[0];
            int curCol = cur[1];

            for (int i = 0; i < 4; i++) {
                for (int j = 1; j <= K; j++) {
                    int newRow = curRow + dx[i] * j;
                    int newCol = curCol + dy[i] * j;

                    if (newRow >= 1 && newRow <= N && newCol >= 1 && newCol <= M && map[newRow][newCol] == '.') {
                        if (visited[newRow][newCol] == 0) {
                            visited[newRow][newCol] = visited[curRow][curCol] + 1;
                            if (newRow == golX && newCol == goalY)
                                break a;
                            q.add(new int[]{newRow, newCol});
                        } else if (visited[newRow][newCol] <= visited[curRow][curCol])
                            break;
                    } else
                        break;
                }
            }
        }
        visited[golX][goalY] = visited[golX][goalY] == 0 ? -1 : visited[golX][goalY];
        System.out.println(visited[golX][goalY]);
    }
}