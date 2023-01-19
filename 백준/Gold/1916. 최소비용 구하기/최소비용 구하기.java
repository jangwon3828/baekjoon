import java.util.Scanner;

public class Main {
    static int N;
    static boolean[] visited;
    static long[] dijkstra;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int M = sc.nextInt();

        long[][] map = new long[N][N];

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    map[i][j] = 0;
                    continue;
                }

                map[i][j] = Integer.MAX_VALUE;
            }

        for (int i = 0; i < M; i++) {


            int row = sc.nextInt()-1;
            int col = sc.nextInt()-1;
            int val = sc.nextInt();
            map[row][col] = Math.min(map[row][col], val);
        }


        int start = sc.nextInt()-1;
        int to =  sc.nextInt()-1;

        dijkstra = map[start].clone();

        visited = new boolean[N];
        visited[start] = true;

        for (int i = 1; i < N; i++) {
            int idx = choose();
            visited[idx] = true;

            for (int j = 0; j < N; j++)
                if (!visited[j])
                    dijkstra[j] = Math.min(dijkstra[j], dijkstra[idx] + map[idx][j]);
        }

        System.out.println(dijkstra[to]);
    }

    static int choose() {
        int minIdx = 0;
        long min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            if (visited[i])
                continue;

            if (min > dijkstra[i]) {
                min = dijkstra[i];
                minIdx = i;
            }
        }

        return minIdx;
    }
}