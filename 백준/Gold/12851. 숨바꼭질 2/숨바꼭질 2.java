import java.util.*;
import java.io.*;

class Main {
    static int N, K;
    static int[] time = new int[100001];
    static int minTime = 987654321;
    static int count = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        if (N >= K) {
            System.out.println((N-K) + "\n1");
            return;
        }

        bfs();

        System.out.println(minTime + "\n" + count);
    }

    static void bfs() {
        Queue<Integer> q = new LinkedList<Integer>();

        q.add(N);
        time[N] = 1;

        while (!q.isEmpty()) {
            int now = q.poll();

            if (minTime < time[now]) return;

            for (int i=0; i<3; i++) {
                int next;

                if (i == 0)         next = now + 1;
                else if (i == 1)    next = now - 1;
                else                next = now * 2;

                if (next < 0 || next > 100000) continue;

                if (next == K) {
                    minTime = time[now];
                    count++;
                }
                if (time[next] == 0 || time[next] == time[now] + 1) {
                    q.add(next);
                    time[next] = time[now] + 1;
                }
            }
        }
    }
}