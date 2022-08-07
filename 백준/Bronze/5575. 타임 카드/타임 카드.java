import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int[] start = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()};
            int[] end = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()};
            int rs = 0;
            int rh = 0;
            int rm = 0;

            if (end[2] - start[2] < 0) {
                rs = end[2] - start[2] + 60;
                start[1]++;
            } else {
                rs = end[2] - start[2];
            }
            if (end[1] - start[1] < 0) {
                rm = end[1] - start[1] + 60;
                start[0]++;
            } else {
                rm = end[1] - start[1];
            }
            if (end[0] - start[0] < 0) {
                rh = end[0] - start[0] + 24;
            } else {
                rh = end[0] - start[0];
            }
            System.out.println(rh + " " + rm + " " + rs);
        }


    }
}
