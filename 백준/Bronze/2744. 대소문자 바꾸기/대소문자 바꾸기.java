import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String temp = new BufferedReader(new InputStreamReader(System.in)).readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) - 'a' < 0) {
                sb.append((char) (temp.charAt(i) + 32));
            }
            if (temp.charAt(i) - 'a' >= 0) {
                sb.append((char) (temp.charAt(i) - 32));
            }
        }

        System.out.println(sb);

    }
}