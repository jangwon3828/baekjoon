import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; ; i++) {

            StringTokenizer st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            if(a==0){
                System.out.println(sb);
                System.exit(0);
            }
            int b = Integer.parseInt(st.nextToken());
            if(a>b){
                sb.append("Yes").append("\n");
            }
            else {
                sb.append("No").append("\n");
            }
        }

    }
}