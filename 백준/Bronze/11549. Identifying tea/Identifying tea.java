import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       int ans=sc.nextInt();
       int count=0;
       for(int i=0;i<5;i++){
           count=sc.nextInt()==ans?count+=1:count;
       }
       System.out.println(count);
    }
}