import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String temp = bf.readLine();
            if (hm.containsKey(temp)) {
                hm.put(temp, hm.get(temp) + 1);
                continue;
            }
            hm.put(temp, 0);
        }
        ArrayList<String> books = new ArrayList<>();
        int max = 0;
        Set set2 = hm.entrySet();
        Iterator iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String, Integer> entry = (Map.Entry) iterator2.next();
            String stemp = (String) entry.getKey();
            int itemp = (int) entry.getValue();
            if (itemp > max) {
                max = itemp;
                books = new ArrayList<>();
                books.add(stemp);
            }
            if (itemp == max) {
                books.add(stemp);
            }

        }
        Collections.sort(books);
        System.out.println(books.get(0));
    }
}