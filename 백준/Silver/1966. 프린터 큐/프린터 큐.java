import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
StringBuilder sb=new StringBuilder();
        for (int i = 0; i < t; i++) {
            String[] split = br.readLine().split(" ");
            int count = Integer.parseInt(split[0]);
            int index = Integer.parseInt(split[1]);
            int[] arr = new int[count];
            StringTokenizer st = new StringTokenizer(br.readLine());
            PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
            for (int j = 0; j < count; j++) {
                int num = Integer.parseInt(st.nextToken());
                arr[j] = num;
                pq.offer(num);
            }
            int answer=0;
            while (!pq.isEmpty()) {
                for (int j = 0; j < arr.length; j++) {
                    if (pq.peek() == arr[j]){
                        if(j==index){
                            sb.append(++answer).append("\n");
                            pq.clear();
                            break ;
                        }
                        pq.poll();
                        answer++;
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
