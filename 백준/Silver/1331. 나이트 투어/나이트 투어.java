import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        Scanner sc = new Scanner(System.in);

        String start = sc.next();
        String temp = start;
        for (int i = 1; i < 36; i++) {
            String te = sc.next();


            int i1 = temp.charAt(0) - te.charAt(0);
            int i2 = temp.charAt(1) - te.charAt(1);
            if (((i1 == 1 || i1 == -1) && (i2 == 2 || i2 == -2)) || ((i1 == 2 || i1 == -2) && (i2 == 1 || i2 == -1))) {

            } else {
                System.out.println("Invalid");
                System.exit(0);
            }


            if (hs.contains(te)) {
                System.out.println("Invalid");
                System.exit(0);
            }
            if (i == 35) {
                int e1 = start.charAt(0) - te.charAt(0);
                int e2 = start.charAt(1) - te.charAt(1);
                if (((e1 == 1 || e1 == -1) && (e2 == 2 || e2 == -2)) || ((e1 == 2 || e1 == -2) && (e2 == 1 || e2 == -1))) {

                } else {
                    System.out.println("Invalid");
                    System.exit(0);
                }
            }
            temp = te;
            hs.add(te);
        }
        System.out.println("Valid");
    }
}