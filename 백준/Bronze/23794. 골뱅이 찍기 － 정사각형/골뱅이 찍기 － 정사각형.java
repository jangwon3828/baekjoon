import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int n = sc.nextInt();
        String s="@";
        String empty=" ";
        String repeat = s.repeat(n+2);
        String center=s+empty.repeat(n)+s;
        for (int i = 0; i < n+2; i++) {
            if(i==0||i==n+1){
                sb.append(repeat).append("\n");
            }else{
                sb.append(center).append("\n");
            }

        }


        System.out.println(sb);
    }
}