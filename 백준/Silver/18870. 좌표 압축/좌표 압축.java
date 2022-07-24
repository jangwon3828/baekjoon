import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bf.readLine());
        int[] sarr = new int[count];
        int[] arr = new int[count];
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < count; i++) {
            sarr[i] = arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sarr);
        int num = 0;
        for (int te : sarr) {
            if (!hm.containsKey(te)) {
                hm.put(te, num);
                num++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int a : arr) {
            int te = hm.get(a);
            sb.append(te).append(" ");
        }

        System.out.println(sb);

    }
}