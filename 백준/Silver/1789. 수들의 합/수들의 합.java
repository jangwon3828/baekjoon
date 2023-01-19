import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long count=1;
        long total=1;
        for (int i = 2; i < n; i++) {
            if(total+i>n)
                break;
            total+=i;
            count++;
        }
        System.out.println(count);
    }
}
