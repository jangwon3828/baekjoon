import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
 
        sc.close();
 
        int x = Rev(X);
        int y = Rev(Y);
        int res = Rev(x + y);
        System.out.println(res);
    }
 
    private static int Rev(int N) {
        String str = "";
        while (N > 0) {
            str += N % 10;
            N /= 10;
        }
        return Integer.parseInt(str);
    }
}
