import java.util.Scanner;

public class Main {
    public static void main(String[] args)   {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n=a/4;
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append("long").append(" ");
        }
        sb.append("int");
        System.out.println(sb);
    }
}