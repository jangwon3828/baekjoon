import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String b = String.format(":fan::fan::fan:\n" +
                ":fan::%s::fan:\n" +
                ":fan::fan::fan:", sc.next());
        System.out.println(b);

    }
}