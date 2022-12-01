import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long temp=1;
        long count=1;
        for (long j = 2; j < a; j++) {
            if(temp+j>a){
                break;
            }
            temp+=j;
            count++;
        }
        System.out.println(count);

    }
}