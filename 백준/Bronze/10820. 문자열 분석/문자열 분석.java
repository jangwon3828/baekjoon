import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;

        String input;
        int[] count;

        while ((input = br.readLine()) != null) {
            count = new int[4];

            sb = new StringBuilder();

            for (int i=0; i<input.length(); i++) {
                int code = input.charAt(i);

                if (code >= 97 && code <= 122) {
                    count[0] += 1;
                }
                if(code >= 65 && code <= 90) {
                    count[1] += 1;
                }
                if(code >= 48 && code <= 57) {
                    count[2] += 1;
                }
                if(code == 32) {
                    count[3] += 1;
                }
            }

            for(int i : count) {
                sb.append(i).append(" ");
            }

            System.out.println(sb);
        }
    }
}
