import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long start = sc.nextLong();
        long goal = sc.nextLong();
        Queue<long[]> queue = new LinkedList<>();
        queue.add(new long[]{start, 1});
        long answer = Long.MAX_VALUE;
        while (!queue.isEmpty()) {
            long[] poll = queue.poll();
            long num = poll[0];
            long cnt = poll[1];
            if (num == goal) {
                answer = Math.min(cnt, answer);
                continue;
            }
            if (num > goal) continue;
            long next1 = num * 2;
            long next2 = num * 10 + 1;
            if (next1 <= goal)
                queue.add(new long[]{next1, cnt + 1});
            if (next2 <= goal)
                queue.add(new long[]{next2, cnt + 1});
        }
        System.out.println(answer==Long.MAX_VALUE?-1:answer);

    }
}
