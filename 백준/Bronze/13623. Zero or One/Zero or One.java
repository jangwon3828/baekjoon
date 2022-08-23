import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == 1 && b == 0 && c == 0) System.out.println("A");
        else if (a == 0 && b == 1 && c == 1) System.out.println("A");
        else if (a == 0 && b == 1 && c == 0) System.out.println("B");
        else if (a == 1 && b == 0 && c == 1) System.out.println("B");
        else if (a == 0 && b == 0 && c == 1) System.out.println("C");
        else if (a == 1 && b == 1 && c == 0) System.out.println("C");
        else System.out.println("*");;

    }
}