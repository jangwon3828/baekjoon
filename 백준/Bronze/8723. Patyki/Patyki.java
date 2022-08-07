import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()};
        Arrays.sort(a);
        int b=0;
        if(a[0]==a[2]) b=2;
        if(a[0]*a[0]+a[1]*a[1]==a[2]*a[2]) b=1;

        System.out.println(b);
    }
}
