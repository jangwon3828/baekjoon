import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[10];
        int[] results = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            results[i] = arr[7];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(results[i]);
        }
    }
}