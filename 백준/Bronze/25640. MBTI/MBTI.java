import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=sc.nextInt();
        int ans=0;
        for(int i=0;i<n;i++){
            ans=s.equals(sc.next())?ans+1:ans;
        }
        System.out.println(ans);

    }
}