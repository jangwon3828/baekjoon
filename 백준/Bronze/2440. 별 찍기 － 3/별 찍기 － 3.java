import java.util.*;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=a;
        for(int i=0;i<a;i++)
        {
            System.out.println("*".repeat(b));
            b--;
        }
    }
}