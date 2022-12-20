import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int p1 = 0;
            int p2 = 0;
            for (int j = 0; j < n; j++) {
                char p1c = sc.next().charAt(0);
                char p2c = sc.next().charAt(0);
                int result = rsp(p1c, p2c);
                switch (result) {
                    case 0:
                        break;
                    case 1:
                        p1++;
                        break;
                    case 2:
                        p2++;
                        break;
                }
            }
            if (p1 > p2) sb.append("Player 1").append("\n");
            if (p1 < p2) sb.append("Player 2").append("\n");
            if (p1 == p2) sb.append("TIE").append("\n");
        }
        System.out.println(sb);
    }

    public static int rsp(char p1, char p2) {
        if (p1 == 'R') {
            switch (p2) {
                case 'R':
                    return 0;
                case 'S':
                    return 1;
                case 'P':
                    return 2;
            }
        } else if (p1 == 'S') {
            switch (p2) {
                case 'S':
                    return 0;
                case 'P':
                    return 1;
                case 'R':
                    return 2;
            }
        } else if (p1 == 'P') {
            switch (p2) {
                case 'P':
                    return 0;
                case 'R':
                    return 1;
                case 'S':
                    return 2;
            }
        }
        return 0;
    }
}