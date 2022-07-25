import java.io.*;
import java.util.*;

class Main {
    static int N;
    static int[] vx = new int[16];
    static int[] vy = new int[16];

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bf.readLine());
        int res = 0;
        for (int i = 0; i < N; i++) {
            res += go(0, i);
        }
        System.out.println(res);
    }
    private static int go(int y, int x) {
        for (int i = 0; i < y; i++) {
            if (y == vy[i]) return 0;
            if (x == vx[i]) return 0;
            if (Math.abs(x - vx[i]) == Math.abs(y - vy[i])) return 0;
        }
        if (y == N - 1) {
            return 1;
        }
        vy[y] = y;
        vx[y] = x;
        int r = 0;
        for (int i = 0; i < N; i++) {
            r += go(y + 1, i);
        }
        return r;
    }
}