import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> plusQ = new PriorityQueue<>((p1, p2) -> p2 - p1);
        PriorityQueue<Integer> minusQ = new PriorityQueue<>((p1, p2) -> p2 - p1);

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(st.nextToken());

            if (temp > 0) {
                plusQ.offer(temp);
            } else {
                minusQ.offer(Math.abs(temp));
            }
        }
        int maxV = 0;
        if (plusQ.isEmpty()) {
            maxV = minusQ.peek();
        } else if (minusQ.isEmpty()) {
            maxV = plusQ.peek();
        } else {
            maxV = Math.max(plusQ.peek(), minusQ.peek());
        }

        int ans = 0;

        while (!plusQ.isEmpty()) {
            int temp = plusQ.poll();
            for (int i = 0; i < M - 1; i++) {
                plusQ.poll();

                if (plusQ.isEmpty()) {
                    break;
                }
            }
            ans += temp * 2;
        }

        while (!minusQ.isEmpty()) {
            int temp = minusQ.poll();
            for (int i = 0; i < M - 1; i++) {
                minusQ.poll();

                if (minusQ.isEmpty()) {
                    break;
                }
            }
            ans += temp * 2;
        }

        ans -= maxV;
        System.out.println(ans);
        br.close();
    }
}