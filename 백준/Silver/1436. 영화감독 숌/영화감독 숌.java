import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(bf.readLine());
        int b=666;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<10000000;i++)
        {
            if(String.valueOf(b).contains("666"))
            {
                arr.add(b);
            }
            b++;
        }
        System.out.println(arr.get(a-1));
    }
}