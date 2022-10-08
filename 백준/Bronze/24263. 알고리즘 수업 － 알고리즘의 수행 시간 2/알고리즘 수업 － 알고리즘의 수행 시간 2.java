import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String inputStr = br.readLine();
        StringBuilder sb = new StringBuilder();
        sb.append(inputStr).append("\n").append(1);
        System.out.print(sb);
    }

}
