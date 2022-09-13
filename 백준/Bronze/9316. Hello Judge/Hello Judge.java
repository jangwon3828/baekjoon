import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StringBuilder sb= new StringBuilder();
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            sb.append("Hello World, Judge ").append(i+1).append("!").append("\n");
        }
        System.out.print(sb);
    }
}