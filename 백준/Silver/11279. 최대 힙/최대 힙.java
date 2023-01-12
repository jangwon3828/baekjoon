import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            if(m==0){
                sb.append(pq.size()==0?0:pq.poll()).append("\n");

            }else {
                pq.offer(m);
            }
        }
        System.out.println(sb);
    }
}
