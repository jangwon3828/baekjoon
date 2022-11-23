import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        long a=0;
        long b=1;
        long c=1;
        for(int i=2;i<n;i++){
            a=b;
            b=c;
            c=a+b;
        }
        System.out.println(c);
    }
}