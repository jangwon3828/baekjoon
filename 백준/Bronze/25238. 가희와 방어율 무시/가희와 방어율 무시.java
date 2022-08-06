import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        double b = Integer.parseInt(st.nextToken())*0.01;
        a-= a*b;
        int result=100-a;
        if(result>0)
            a=1;
        else if(result<=0)
            a=0;
        System.out.println(a);
    }
}