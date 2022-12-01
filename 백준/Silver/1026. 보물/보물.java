import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Integer[] arr1 = new Integer[a];
        Integer[] arr2 = new Integer[a];

        for (int i = 0; i < a; i++) {
            arr1[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        for (int i = 0; i < a; i++) {
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr2, Collections.reverseOrder());
        int answer = 0;
        for (int i = 0; i < a; i++) {
            answer += arr1[i] * arr2[i];
        }
        System.out.println(answer);
    }
}