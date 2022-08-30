import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        String t=sc.next();
        int b=  sc.nextInt();
         t=sc.next();
        int c=  sc.nextInt();
        String y="YES";
        String n="NO";
        System.out.println(a+b==c?y:n);

    }
}