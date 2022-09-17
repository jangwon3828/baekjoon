import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        String result= m<3?"NEWBIE!":m>n?"TLE!":"OLDBIE!";
        System.out.println(result);

    }
}