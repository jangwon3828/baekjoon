import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < a; i++) {
            hs.add(bf.readLine());
        }
        int count = 0;
        for (int x = 0; x < b; x++) {
            if (hs.contains(bf.readLine()))
                count++;
        }
        sb.append(count);
        System.out.println(sb);
    }
}