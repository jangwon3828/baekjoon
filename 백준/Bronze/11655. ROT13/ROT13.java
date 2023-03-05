import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] rot13 = br.readLine().toCharArray();
        for (int i = 0; i < rot13.length; i++) {
            if (rot13[i] >= 'A' && rot13[i] <= 'Z') {
                if (rot13[i] >= 'N') {
                    rot13[i] -= 13;
                } else {
                    rot13[i] += 13;
                }
            } else if (rot13[i] >= 'a' && rot13[i] <= 'z') {
                if (rot13[i] >= 'n') {
                    rot13[i] -= 13;
                } else {
                    rot13[i] += 13;
                }
            }
        }

        for (char i : rot13)
            sb.append(i);

        System.out.println(sb);
    }
}