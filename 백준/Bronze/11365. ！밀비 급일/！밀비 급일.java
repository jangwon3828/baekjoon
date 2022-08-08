import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (; ; ) {
            String s = bf.readLine();
            if (s.equals("END")) {
                System.out.println(sb);
                System.exit(0);
            }
            for (int i = s.length() - 1; i >= 0; i--) {
                sb.append(s.charAt(i));
            }
            sb.append("\n");

        }
    }
}
