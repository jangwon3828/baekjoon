import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next().trim();
        StringBuilder sb=new StringBuilder();
        int n = next.length() / 10;
        int temp=0;
        for (int i = 0; i < n*10; i+=10) {
            sb.append(next.substring(i,i+10)).append("\n");
            temp=i+10;
        }
        sb.append(next.substring(temp,next.length()));
        System.out.println(sb);
    }
}