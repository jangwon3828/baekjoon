import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        double b=a-a*0.22;
        double c=a-(a-a*0.8)*0.22;
        sb.append((int)b).append(" ").append((int)(c));
        System.out.println(sb);
    }

}