import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int count =0;

        while(n>=2 && m>=1 && m+n >=3+k){
            n = n-2;
            m= m-1;
            count++;
        }
        System.out.println(count);
    }
}