import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String input01 = br.readLine();
        final String input02 = br.readLine();
        StringTokenizer st = new StringTokenizer(input02);
        final int chickenSC = Integer.parseInt(input01);
        final int colaSC = Integer.parseInt(st.nextToken());
        final int beerSC = Integer.parseInt(st.nextToken());
        int min = Math.min((colaSC / 2 + beerSC), chickenSC);
        System.out.print(min);
    }
}