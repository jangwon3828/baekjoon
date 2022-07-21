import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bf.readLine());
        ArrayList<String> arr = new ArrayList<String>();

        for (int i = 0; i < count; i++) {
            String temp = bf.readLine();
            if (!arr.contains(temp)) {
                arr.add(temp);
            }

        }


        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length()) {
                    return -1;
                } else if (o1.length() == o2.length()) {
                   return o1.compareTo(o2);
                }
                else
                    return 1;
            }

        });
        StringBuilder sb=new StringBuilder();
        for(int g=0;g<arr.size();g++)
        {
            sb.append(arr.get(g)).append("\n");
        }

        System.out.println(sb);


    }
}