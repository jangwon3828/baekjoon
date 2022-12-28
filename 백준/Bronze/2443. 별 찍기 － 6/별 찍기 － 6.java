import java.util.*;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=a*2;
        for(int i=0;i<a;i++)
        {
            System.out.print(" ".repeat(i));
            System.out.println("*".repeat(b-1));
            b-=2;
        }
    }
}