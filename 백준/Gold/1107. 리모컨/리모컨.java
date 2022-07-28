import java.io.*;
import java.util.*;

public class Main {
    static boolean[] enable = new boolean[10];

    public static int possible(int c) {
        if (c == 0) {
            if (enable[0])
                return 0;
            else
                return 1;
        }
        int len = 0;
        while (c > 0) {
            if (enable[c % 10]) {
                return 0;
            }

            len += 1;
            c /= 10;
        }
        return len;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int channel = Integer.parseInt(bf.readLine());
        int broken = Integer.parseInt(bf.readLine());
        if (broken != 0) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for (int i = 0; i < broken; i++) {
                int x = Integer.parseInt(st.nextToken());
                enable[x] = true;
            }
        }
        int ans = channel - 100;
        if (ans < 0) {
            ans *= -1;
        }

        for (int i = 0; i < 1000000; i++) {
            int c = i;
            int len = possible(c);
            if (len > 0) {
                int press = c - channel;
                if (press < 0) {
                    press = -press;
                }
                if (ans > len + press) {
                    ans = len + press;
                }

            }
        }
        System.out.println(ans);


    }
}
