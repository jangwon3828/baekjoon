import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int h=0,m=0,n=0;

        if(a%10==0){
            if(a/300>0){
                h=a/300;
                a%=300;
            }
            if(a/60>0){
                m=a/60;
                a%=60;
            }
            if(a/10>0){
                n=a/10;
            }
            System.out.println(h+" "+m+" "+n);
            System.exit(0);
        }
        System.out.println(-1);



    }
}