import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(0);
            System.exit(0);
        }
        int me = sc.nextInt();
        int re = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) arr.add(sc.nextInt());


        for (; ; ) {
            Collections.sort(arr);
            int a = arr.get(arr.size() - 1);
            arr.remove(arr.size() - 1);
            if (a < me) {
                System.out.println(re);
                System.exit(0);
            }
            re++;
            a--;
            me++;
            arr.add(a);
        }
    }
}