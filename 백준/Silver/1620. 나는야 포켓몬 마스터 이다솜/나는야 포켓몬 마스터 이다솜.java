import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        HashMap<String, String> hs = new HashMap<>();
        HashMap<String, String> hm = new HashMap<>();
        for (int i = 1; i <= a; i++) {
            String tmep = bf.readLine();
            hs.put(tmep, String.valueOf(i));
            hs.put(String.valueOf(i), tmep);
        }
        for (int x = 0; x < b; x++) {
            String temp = bf.readLine();
            String containsKey = String.valueOf(hs.getOrDefault(temp, "no"));
            if (containsKey.equals("no")) {
                containsKey = String.valueOf(hm.getOrDefault(temp, "no"));
            }
            sb.append(containsKey).append("\n");
        }

        System.out.println(sb);
    }
}