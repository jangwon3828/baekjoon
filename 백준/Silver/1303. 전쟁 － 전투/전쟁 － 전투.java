import java.util.*;

public class Main {
    static int y;
    static int x;
    static char[][] map;
    static boolean[][] check;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();
        x = sc.nextInt();
        map = new char[x][y];
        check = new boolean[x][y];

        for (int i = 0; i < x; i++) {
            String next = sc.next();
            for (int j = 0; j < y; j++) {
                map[i][j] = next.charAt(j);
            }
        }
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{0, 0});
        int white_count = 0;
        int black_count = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (!check[i][j]) {

                    if (map[i][j] == 'W') {
                        int num = BFS(i, j, 'W');
                        white_count += num * num;
                    } else {
                        int num = BFS(i, j, 'B');
                        black_count += num * num;
                    }

                }

            }
        }
        System.out.println(white_count + " "+ black_count);

    }

    private static int BFS(int i, int j, char w) {
        int[] dx = new int[]{0, 0, 1, -1};
        int[] dy = new int[]{1, -1, 0, 0};
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});
        int cnt = 0;
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int nowX = poll[0];
            int nowY = poll[1];
            for (int l = 0; l < 4; l++) {

                int nextX = nowX + dy[l];
                int nextY = nowY + dx[l];

                if (nextX >= 0 && nextX < x && nextY >= 0 && nextY < y) {

                    if (!check[nextX][nextY] && w == map[nextX][nextY]) {
                        queue.add(new int[]{nextX,nextY });
                        check[nextX][nextY] = true;
                        cnt++;
                    }

                }
            }
        }

        return cnt==0?1:cnt;
    }
}
