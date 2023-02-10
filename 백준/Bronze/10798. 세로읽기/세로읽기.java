import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char[][] chs = new char[5][15];

        for (int i = 0; i < chs.length; i++) {
            String next = sc.next();

            for (int j = 0; j < next.length(); j++) {
                chs[i][j] = next.charAt(j);
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (chs[j][i] == ' ' || chs[j][i] == '\0')
                    continue;

                System.out.print(chs[j][i]);
            }

        }
    }

}
