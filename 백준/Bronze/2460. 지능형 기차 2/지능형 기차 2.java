import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        int max=0;
        for (int i = 0; i < 10; i++) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            count=count+m-n;
            max=Math.max(count,max);
        }
        System.out.println(max);
    }

}

