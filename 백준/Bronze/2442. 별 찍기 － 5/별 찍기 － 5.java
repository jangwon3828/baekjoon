import java.util.*;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=a;
        int c=1;
        for(int i=0;i<a;i++)
        {
            System.out.print(" ".repeat(b-1));
            System.out.println("*".repeat(c));
            c+=2;
            b--;
        }
    }
}