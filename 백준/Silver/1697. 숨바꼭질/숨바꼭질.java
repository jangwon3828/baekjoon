import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int min = Integer.MAX_VALUE;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{n, 0});
        boolean[] check = new boolean[100001];
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int num = poll[0];
            int cnt = poll[1];
            if(num==m){
                min=Math.min(min,cnt);
                continue;
            }
            if (num - 1 >= 0) {
                if (!check[num - 1]) {
                    check[num - 1] = true;
                    queue.offer(new int[]{num - 1, cnt+1});
                }
            }
            if (num + 1 <= 100000) {
                if (!check[num + 1]) {
                    check[num + 1] = true;
                    queue.offer(new int[]{num + 1, cnt+1});
                }
            }
            if (num * 2 <= 100000) {
                if (!check[num * 2]) {
                    check[num * 2] = true;
                    queue.offer(new int[]{num * 2, cnt+1});
                }
            }

        }
        System.out.println(min);
    }
}
