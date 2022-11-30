import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> tree = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int abs1 = Math.abs(o1);
                int abs2 = Math.abs(o2);
                if(abs1==abs2){
                    return o1-o2;
                }
                return abs1-abs2;
            }
        });
        for (int i = 0; i < num; i++) {
            int n = sc.nextInt();
            if (n == 0 && tree.isEmpty()) {
                sb.append(0).append("\n");
            } else if (n == 0) {
                Integer first = tree.poll();
                sb.append(first).append("\n");
            } else {
                tree.add(n);
            }
        }
        System.out.println(sb);
    }
}