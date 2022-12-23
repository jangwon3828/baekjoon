import java.util.Scanner;

public class Main {

    static int[] bitter;
    static int[] sour;
    static int n;
    static int min=Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        bitter = new int[n];
        sour = new int[n];
        for (int i = 0; i < n; i++) {
            sour[i]=sc.nextInt();
            bitter[i]=sc.nextInt();
            min=Math.min(min,Math.abs(sour[i]-bitter[i]));
        }

        go(0,0,1,0);
        System.out.println(min);
    }

    private static void go(int idx,int count,int sourT,int bitterT) {
        if(count==n){
            if(idx !=0) {
                int total = Math.abs(sourT - bitterT);
                min=Math.min(total,min);
            }
            return;
        }
        go(idx,count+1,sourT,bitterT);
        go(idx+1,count+1,sourT*sour[count],bitterT+bitter[count]);
    }
}