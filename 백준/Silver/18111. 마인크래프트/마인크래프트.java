import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nmb = br.readLine().split(" ");
        int n = Integer.parseInt(nmb[0]);
        int m = Integer.parseInt(nmb[1]);
        int b = Integer.parseInt(nmb[2]);

        int[][] ground = new int[n][m];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < ground.length; i++) {

            String[] groundRow = br.readLine().split(" ");

            for (int j = 0; j < m; j++) {
                int value = Integer.parseInt(groundRow[j]);
                ground[i][j] = value;

                max = Math.max(max, value);
                min = Math.min(min, value);
            }
        }

        int answerSeconds = Integer.MAX_VALUE;
        int answerHeight = -1;

        for (int i = min; i <= max; i++) {

            int seconds = 0;
            int inventory = b;

            for (int j = 0; j < ground.length; j++) {
                for (int k = 0; k < ground[j].length; k++) {
                    int diff = ground[j][k] - i;

                    if (diff > 0) {
                        seconds += Math.abs(diff) * 2;
                        inventory += Math.abs(diff);
                    } else if (diff < 0) {
                        seconds += Math.abs(diff);
                        inventory -= Math.abs(diff);
                    }
                }
            }

            if (inventory >= 0) {
                if (seconds <= answerSeconds) {
                    answerSeconds = seconds;
                    answerHeight = i;
                }
            }
        }

        bw.write(answerSeconds + " " + answerHeight);

        bw.flush();
        bw.close();
    }
}