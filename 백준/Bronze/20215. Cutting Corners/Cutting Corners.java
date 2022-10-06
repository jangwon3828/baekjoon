import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int cornerWidth = Integer.parseInt(st.nextToken());
        int cornerHeight = Integer.parseInt(st.nextToken());

        double len = cornerHeight + cornerWidth - Math.sqrt(cornerHeight * cornerHeight + cornerWidth * cornerWidth);
        System.out.println(len);
    }
}