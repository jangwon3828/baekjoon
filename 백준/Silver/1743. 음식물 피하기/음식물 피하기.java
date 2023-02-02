import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] map = new int[x][y];
        boolean[][] check = new boolean[x][y];
        int count = sc.nextInt();
        int answer = 0;
        for (int i = 0; i < count; i++) {
            int nX = sc.nextInt();
            int nY = sc.nextInt();
            map[nX - 1][nY - 1] = 1;

        }
        int[] dx = new int[]{0, 0, 1, -1};
        int[] dy = new int[]{1, -1, 0, 0};
        for (int i = 0; i < x; i++) {

            for (int j = 0; j < y; j++) {

                if (map[i][j] == 1 && !check[i][j]) {
                    Queue<int[]> queue = new LinkedList<>();
                    queue.add(new int[]{i, j});
                    check[i][j] = true;
                    int temp = 1;
                    while (!queue.isEmpty()) {
                        int[] poll = queue.poll();
                        int nowX = poll[0];
                        int nowY = poll[1];
                        for (int k = 0; k < 4; k++) {
                            int nextX = nowX + dx[k];
                            int nextY = nowY + dy[k];
                            if (nextX >= 0 && nextX < x && nextY >= 0 && nextY < y) {
                                if (map[nextX][nextY] == 1 && !check[nextX][nextY]) {
                                    queue.add(new int[]{nextX, nextY});
                                    check[nextX][nextY] = true;
                                    temp += 1;
                                }

                            }

                        }
                    }
                    answer = Math.max(temp, answer);
                }
            }
        }
        System.out.println(answer);

    }

}
