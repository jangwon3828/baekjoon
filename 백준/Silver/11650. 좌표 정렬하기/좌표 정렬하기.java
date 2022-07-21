import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bf.readLine());
        ArrayList<ArrayList<Integer>> arr2 = new ArrayList<ArrayList<Integer>>();
        int n = 0;
        while (n++ < count) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for (int i = 0; i < 2; i++) {
                arr.add(Integer.parseInt(st.nextToken()));
            }
            arr2.add(arr);
        }
        StringBuilder sb = new StringBuilder();
        Collections.sort(arr2, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                if (o1.get(0).equals(o2.get(0))) {
                    return o1.get(1) - o2.get(1);
                } else {
                    return o1.get(0) - o2.get(0);
                }
            }
        });
        for (int x = 0; x < count; x++) {
            sb.append(arr2.get(x).get(0)).append(" ").append(arr2.get(x).get(1)).append("\n");
        }
        System.out.print(sb);


    }
}