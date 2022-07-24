import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[]arrx=new int[3];
        int[]arry=new int[3];
        for(int i=0;i<3;i++)
        {
            StringTokenizer st=new StringTokenizer(bf.readLine());
            arrx[i] = Integer.parseInt(st.nextToken());
            arry[i] = Integer.parseInt(st.nextToken());
        }
        int x=0;
        int y=0;
        if(arrx[0]==arrx[1])
        {
           x=arrx[2];
        }

        if(arrx[0]==arrx[2])
        {
            x=arrx[1];
        }
        if(arrx[1]==arrx[2])
        {
            x=arrx[0];
        }
        if(arry[0]==arry[1])
        {
            y=arry[2];
        }
        if(arry[0]==arry[2])
        {
            y=arry[1];
        }
        if(arry[1]==arry[2])
        {
            y=arry[0];
        }

        StringBuilder sb = new StringBuilder();
        sb.append(x).append(" ").append(y);
        System.out.println(sb);
    }
}