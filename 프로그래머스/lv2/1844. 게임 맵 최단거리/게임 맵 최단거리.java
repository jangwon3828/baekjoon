import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[][] maps) {
        Queue<int[]> queue = new LinkedList<>();
        int[] dx = new int[]{0, 0, 1, -1};
        int[] dy = new int[]{1, -1, 0, 0};
        queue.add(new int[]{0, 0});
        boolean[][] check = new boolean[maps.length][maps[0].length];
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int nowX = poll[0];
            int nowY = poll[1];
            for (int k = 0; k < 4; k++) {
                int nextX = nowX + dx[k];
                int nextY = nowY + dy[k];
                if (nextX >= 0 && nextX < maps.length && nextY >= 0 && nextY < maps[0].length) {
                    if (maps[nextX][nextY] == 1 && !check[nextX][nextY]) {
                        queue.add(new int[]{nextX, nextY});
                        check[nextX][nextY] = true;
                        maps[nextX][nextY] += maps[nowX][nowY];
                    }

                }

            }
        }

    return maps[maps.length - 1][maps[0].length - 1] == 1 ? -1 : maps[maps.length - 1][maps[0].length - 1];
        
    }
}