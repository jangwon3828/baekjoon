import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");

        long num1 = Long.parseLong(input[0]+input[1]);
        long num2 = Long.parseLong(input[2]+input[3]);

        sb.append(num1 + num2);

        System.out.println(sb);
    }
}