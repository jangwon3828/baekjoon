import java.util.*;

public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        for(int i =1;i<=a;i++)
        {
            System.out.println(" ".repeat(a-i)+"*".repeat(i));

        }
    }
}