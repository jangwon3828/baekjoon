import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        int index=0;
        for (int i = 0; i < 9; i++) {
            int nextInt = sc.nextInt();
            if(nextInt>=max){
                max=nextInt;
                index=i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
