import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        int l = sc.nextInt();
        int temp = 0;
        Arrays.sort(arr);
        for (int i = 0; i < a; i++) {
            if (arr[i] == l) {
                System.out.println(0);
                temp = -1;
                break;
            }
        }
        if (temp != -1) {
            if (arr[0] >= l) {
                temp = (l) * (arr[0] - l) - 1;
            } else {

                for (int i = 1; i < a; i++) {
                    if (arr[i] >= l) {
                        temp = (l - arr[i - 1]) * (arr[i] - l) - 1;
                        break;
                    }
                }
            }
            System.out.println(temp);
        }
    }
}