import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        int a=new Scanner(System.in).nextInt();
        int b=0;
        for(int i=0;i<a+1;i++)
        {

            if(i<100)
            {
                b=i;
            }
            if(a==1)
            {
                b=1;
            }
            else
            {
                int t1= i/100;
                int t2= i/10%10;
                int t3=i%10;
                if(t1-t2==t2-t3)
                    b+=1;
            }
        }
        System.out.println(b);
    }
}