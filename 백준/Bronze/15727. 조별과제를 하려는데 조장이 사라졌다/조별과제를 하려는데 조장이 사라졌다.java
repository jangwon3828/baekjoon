import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int count = 0;
        int temp = N;
        for (int i = 0; i < N; i++) {
            if (temp == 0) break;
            if (temp - 5 >= 0) {
                temp -= 5;
                count++;
                continue;
            }
            if (temp - 4 >= 0) {
                temp -= 4;
                count++;
                continue;
            }
            if (temp - 3 >= 0) {
                temp -= 3;
                count++;
                continue;
            }
            if (temp - 2 >= 0) {
                temp -= 2;
                count++;
                continue;
            }
            if (temp - 1 >= 0) {
                temp -= 1;
                count++;
            }

        }
        System.out.println(count);

    }
}