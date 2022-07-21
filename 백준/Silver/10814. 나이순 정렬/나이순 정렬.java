import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bf.readLine());
        String[][] arr=new String[count][2];

        for (int i = 0; i < count; i++) {
            StringTokenizer st=new StringTokenizer(bf.readLine());
            arr[i][0]=st.nextToken();
            arr[i][1]=st.nextToken();
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
            }
        });
        StringBuilder sb=new StringBuilder();
        for(int x=0;x<arr.length;x++)
        {
            sb.append(arr[x][0]).append(" ").append(arr[x][1]).append("\n");
        }
        System.out.println(sb);


    }
}