import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a= sc.next();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<a.length();i++){
sb.append( (char) (a.charAt(i)-32));
        }
        System.out.println(sb);
    }
}