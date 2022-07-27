import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int max = 1000000;
        long[] d = new long[max + 1];
        for (int i = 1; i <=max; i++) {
            d[i] = 1;
        }
        for (int l = 2; l <=max; l++) {
            for (int j = 1; j * l <=max; j++) {
                d[l * j] += l;
            }
        }
        long[] answer = new long[max + 1];

        for (int x = 1; x <= max; x++) {
            answer[x] = answer[x - 1] + d[x];
        }
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < n; i++) {
            int ans = Integer.parseInt(bf.readLine());
            sb.append(answer[ans]).append("\n");
        }
        System.out.println(sb);


    }
}