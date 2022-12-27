import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
        int count=0;
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int out = sc.nextInt();
            int in = sc.nextInt();
            count=count-out+in;
            max=Math.max(count,max);
        }
        System.out.println(max);
    }
}
