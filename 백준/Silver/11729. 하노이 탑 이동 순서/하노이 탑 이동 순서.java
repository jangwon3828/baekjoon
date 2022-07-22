import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb=new StringBuilder();
    static int c=0;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bf.readLine());
        hanoi(count,1,3,2);
        System.out.println(c);
        System.out.println(sb);
    }
    public static void hanoi(int count,int start,int end,int temp)
    {
        if(count==0) return ;
        hanoi(count-1,start,temp,end);
        c++;
        sb.append(start).append(" ").append(end).append("\n");
        hanoi(count-1,temp,end,start);
    }
}