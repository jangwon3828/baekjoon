import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int size = Integer.parseInt(st.nextToken());
            int location = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(bf.readLine());
            int[] arr = new int[size];
            int index = 0;
            while (st.hasMoreTokens()) {
                int a = Integer.parseInt(st.nextToken());
                arr[index] = a;
                index++;
                pq.offer(a);
            }
            int time = 0;
            a : while (!pq.isEmpty()) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == pq.peek()) {
                        if (location == j) {
                            time++;
                            sb.append(time).append("\n");
                            pq.poll();
                            break a;
                        }
                        time++;
                        pq.poll();
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
