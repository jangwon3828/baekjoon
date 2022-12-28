import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String next = sc.next();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < next.length(); i++) {
            char charAt = next.charAt(i);
            if(charAt-2>'A')sb.append((char)(charAt -3));
            else sb.append((char)(charAt + 23));

        }
        System.out.println(sb);
    }
}