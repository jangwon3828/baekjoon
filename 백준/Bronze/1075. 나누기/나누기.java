import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());
        
        int temp = (n/100)*100;
        while(true) {
            if(temp%f == 0) {
                int result = temp % 100;
                if(result < 10) System.out.println("0" + result);
                else System.out.println(result);
                return;
            }
            temp++;
        }
        
    }
}