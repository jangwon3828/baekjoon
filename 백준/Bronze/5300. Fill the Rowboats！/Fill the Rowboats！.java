import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb=new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if(i==n){
                sb.append(i).append(" Go! ");
                break;
            }
            if(i%6==0){
                sb.append(i).append(" Go! ");
            }else {
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb);
    }
}