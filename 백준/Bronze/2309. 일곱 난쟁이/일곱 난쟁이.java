import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 9;
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                int sum = 0;
                for (int k=0; k<n; k++) {
                    if (i == k || j == k) continue;
                    sum += a[k];
                }
                if (sum == 100) {
                    for (int k=0; k<n; k++) {
                        if (i == k || j == k) continue;
                        System.out.println(a[k]);
                    }
                    System.exit(0);
                }
            }
        }
    }
}