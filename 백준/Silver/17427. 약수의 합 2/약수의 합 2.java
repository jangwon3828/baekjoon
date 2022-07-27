import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        int a= Integer.parseInt(bf.readLine());
        long sum=0;
        for(int i=1;i<=a;i++){
            sum+=a/i*i;
        }
        System.out.println(sum);
    }
}