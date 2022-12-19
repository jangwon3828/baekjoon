import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            int[] arr = new int[3];
            for (int j = 0; j < 3; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            int num = 0;
            int cnt = 0;
            if (arr[0] == arr[1]) {
                cnt = 2;
                num = arr[0];
                if (arr[1] == arr[2]) {
                    cnt = 3;
                    num = arr[0];
                } else {
                    cnt = 2;
                    num = arr[0];
                }
            } else if (arr[1] == arr[2]) {
                cnt = 2;
                num = arr[1];
            } else {
                cnt = 1;
                num = arr[2];
            }
            switch (cnt) {
                case 1:
                    max = Math.max(num * 100, max);
                    break;
                case 2:
                    max = Math.max(num * 100 + 1000, max);
                    break;
                case 3:
                    max = Math.max(num * 1000 + 10000, max);
                    break;
            }

        }
        System.out.println(max);
    }

}

