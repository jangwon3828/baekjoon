import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n, m;
    static int[][] map;
    static ArrayList<Integer> virus;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(bf.readLine());
        m = Integer.parseInt(bf.readLine());
        map = new int[m][2];
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            map[i][0] = Integer.parseInt(st.nextToken());
            map[i][1] = Integer.parseInt(st.nextToken());
        }
        visit = new boolean[m];
        virus = new ArrayList<Integer>();
        virus.add(1);
        DFS();
        virus.remove(1);
        System.out.println(virus.size());
    }

    public static void DFS() {
        for (int i = 0; i < map.length; i++) {
            if (virus.contains(map[i][0]))
                if (!virus.contains(map[i][1])) {
                    virus.add(map[i][1]);
                    DFS();
                }

            if (virus.contains(map[i][1]))
                if (!virus.contains(map[i][0])) {
                    virus.add(map[i][0]);
                    DFS();
                }

        }
    }
}