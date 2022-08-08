import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char a = (char) br.read();
        a -= 109567;
        System.out.println((int) a);
    }
}
