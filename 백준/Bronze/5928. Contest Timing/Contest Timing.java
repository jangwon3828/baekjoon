import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int a= (sc.nextInt()-11)*1440+(sc.nextInt()-11)*60+(sc.nextInt()-11);
       System.out.println(a>=0?a:-1);
    }
}
