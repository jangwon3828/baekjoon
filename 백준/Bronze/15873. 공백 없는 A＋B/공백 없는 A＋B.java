import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String k = br.readLine();

        if(k.contains("1010")){
            System.out.println(20);
        } else if(k.contains("10")){
            k = k.replaceAll("10", "");
            System.out.println(Integer.parseInt(k) + 10);
        } else {
            System.out.println(Integer.parseInt(k)/10 + Integer.parseInt(k)%10);
        }

        br.close();
    }

}
