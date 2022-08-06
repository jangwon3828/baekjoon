import java.util.Scanner;

public class Main {
    public static void main(String[] args)   {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<n;i++){
            String temp=sc.next();
            if(temp.length()>=6&&temp.length()<=9) sb.append("yes").append("\n");
            else sb.append("no").append("\n");
        }
        System.out.println(sb);
    }
}