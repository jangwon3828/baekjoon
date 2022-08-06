import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int a=0;
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());
        a+=Integer.parseInt(st.nextToken())*Integer.parseInt(st.nextToken());
        a+=Integer.parseInt(st.nextToken())*Integer.parseInt(st.nextToken());
        System.out.println(a);
    }
}