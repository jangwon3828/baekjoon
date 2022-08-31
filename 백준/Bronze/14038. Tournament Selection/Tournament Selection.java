import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        for(int i =0;i<6;i++){
            sb.append(sc.next());
        }
        String s= sb.toString();
        int a=0;
        for(int i =0;i<6;i++){
            a= s.charAt(i)==87?a+1:a;
        }
        a= a>=5?1:a>=3?2:a>=1?3:-1;
        System.out.println(a);
    }
}