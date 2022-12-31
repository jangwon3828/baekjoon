import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean[] check=new boolean[10001];
        for (int i = 1; i <= 100; i++) {
            check[(int) Math.pow(i,2)]=true;
        }

        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum=0;
        int min= Integer.MAX_VALUE;
        for (int i = n; i <= m; i++) {
            if(check[i]){
                min=Math.min(min,i);
                sum+=i;
            }
        }
        if(sum==0){
            System.out.println(-1);
        }else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
