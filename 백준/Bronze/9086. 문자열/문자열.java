import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            String s = bf.readLine();
            if (s.length() == 1) {
                sb.append(s).append(s).append("\n");
                continue;
            }
            sb.append(s.charAt(0)).append(s.charAt(s.length() - 1)).append("\n");
        }
        System.out.println(sb);
    }
}