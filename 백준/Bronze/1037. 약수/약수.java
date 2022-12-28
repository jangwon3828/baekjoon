import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if(n==1){
            int temp = sc.nextInt();
            System.out.println(temp*temp);
            System.exit(0);
        }
        int[] arr=new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[0]*arr[n-1]);
    }
}
