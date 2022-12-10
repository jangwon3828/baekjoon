import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int L1 = sc.nextInt();
        int L2 = sc.nextInt();

        int F = 0;

        int P1 = L1 % 4;
        int P2 = L2 % 4;
        int D1 = L1 / 4;
        int D2 = L2 / 4;

        if(P1 == 0){
            P1 = 4;
            D1--;
        }
        if(P2 == 0){
            P2 = 4;
            D2--;
        }
        F += (int)Math.abs((double)(P1 - P2));
        F += (int)Math.abs((double)(D1 - D2));
        System.out.println(F);
        sc.close();
    }
}