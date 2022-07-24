import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count=Integer.parseInt(bf.readLine());
       for(int i=0;i<count ;i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int x=a;
            int y=b;
            int c=0;
           while (b != 0) {
               c = a % b;
               a = b;
               b = c;
           }
            sb.append(x*y/a).append("\n");


        }
        System.out.println(sb);
    }
}