import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1000-sc.nextInt();
        int answer=0;
        answer+=a/500;
        a=a%500;
        answer+=a/100;
        a=a%100;
        answer+=a/50;
        a=a%50;
        answer+=a/10;
        a=a%10;
        answer+=a/5;
        a=a%5;
        answer+=a;
        System.out.println(answer);
    }
}