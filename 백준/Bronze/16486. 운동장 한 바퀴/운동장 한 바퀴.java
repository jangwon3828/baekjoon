import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt(), d2 = sc.nextInt();
        double pi = 3.141592;
        System.out.println(d1*2 + 2*pi*d2);
    }
}