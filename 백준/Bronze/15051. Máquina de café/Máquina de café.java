import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A1=sc.nextInt();
        int A2=sc.nextInt();
        int A3=sc.nextInt();
        int r1=A2*2 + A3*4;
        int r2=A1*2 + A3*2;
        int r3= A1*4 +A2*2;
        System.out.println(Math.min(Math.min(r1,r2),r3));
    }

}