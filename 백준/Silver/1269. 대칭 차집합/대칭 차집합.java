import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        HashSet<Integer> first = new HashSet<>();

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < a; i++) {
            first.add(Integer.parseInt(st.nextToken()));
        }
        int count = 0;
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < b; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if (first.contains(temp)) {
                count++;
            }
            first.add(temp);

        }
        sb.append(first.size() - count);
        System.out.println(sb);
    }
}