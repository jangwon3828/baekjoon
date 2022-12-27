import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int temp=0;
        int cnt=0;
        for (int i = 1; i <= n; i++) {
            if(cnt==m)break;
            if(n%i==0){
                cnt++;
                temp=i;
            }
        }
        System.out.println(m==cnt?temp:0);
    }
}
