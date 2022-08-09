import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        a = a.replace("XXXX", "AAAA");
        a = a.replace("XX", "BB");
        if (a.equals("X") || a.contains("X")) {
            System.out.println(-1);
            System.exit(0);
        }
        System.out.println(a);

    }
}


