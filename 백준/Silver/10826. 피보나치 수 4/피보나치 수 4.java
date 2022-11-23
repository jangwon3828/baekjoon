import java.math.BigInteger;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        BigInteger a=new BigInteger("0");
        BigInteger b=new BigInteger("1");
        BigInteger c=new BigInteger("1");
        for(int i=2;i<n;i++){
            a=b;
            b=c;
            c=a.add(b);
        }
          System.out.println(n!=0?c:0);
    }
}