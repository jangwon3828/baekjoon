import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String a = bf.readLine();
        for (int i = a.length() - 1; i >= 0; i--) {
            sb.append(a.charAt(i));
        }
        System.out.println(sb);
    }
}