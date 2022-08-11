import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[8][2];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            int b = sc.nextInt();
            a[i][0] = b;
            a[i][1] = i;
        }

        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] > o2[0] ? -1 : 0;
            }
        });
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += a[i][0];
        }
        sb.append(sum).append("\n");
        int[] b = new int[5];
        for (int i = 0; i < 5; i++) {
            b[i] = a[i][1] + 1;
        }
        Arrays.sort(b);
        for (int i = 0; i < 5; i++) {
            sb.append(b[i]).append(" ");
        }
        System.out.println(sb);

    }
}