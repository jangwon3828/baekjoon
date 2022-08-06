import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        for(int i=0;;i++)
        {
            try {
                StringTokenizer st=new StringTokenizer(bf.readLine());
                int a= Integer.parseInt(st.nextToken());
                int b= Integer.parseInt(st.nextToken());
                sb.append(b/(a+1)).append("\n");
            }
            catch (Exception ex){
                System.out.println(sb);
                System.exit(0);
            }
        }

    }
}