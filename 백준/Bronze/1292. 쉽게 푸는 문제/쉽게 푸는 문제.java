import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr=new int[500502];
        int index=1;

        for (int i = 0; i < 1001; i++) {
            int cnt=0;
            for (; ;) {
                if(cnt == i)break;
                arr[index]=i;
                cnt++;
                index++;
            }
        }
        int n = sc.nextInt();
        int m = sc.nextInt();
        int answer=0;
        for (int i = n; i <= m; i++) {
            answer+=arr[i];
        }
        System.out.println(answer);
    }
}
