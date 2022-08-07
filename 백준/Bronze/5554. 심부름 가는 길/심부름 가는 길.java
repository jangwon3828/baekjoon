import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt()+ sc.nextInt()+ sc.nextInt()+ sc.nextInt();
        int hour=sum/60;
        int count=sum-hour*60;
        System.out.println(hour);
        System.out.println(count);

    }
}
