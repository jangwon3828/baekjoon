import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        int s = sc.nextInt();
        int[] nums = new int[N+1];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int start=0;
        int end=0;
        int total=0;

        while(start <= N && end <= N) {
            if(total >= s && min > end - start) min = end - start;

            if(total < s) total += nums[end++];
            else total -= nums[start++];
        }
        System.out.println(min==Integer.MAX_VALUE?0:min);

    }

}