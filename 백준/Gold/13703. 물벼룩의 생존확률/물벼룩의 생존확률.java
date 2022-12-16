import java.util.*;
public class Main{
    static final int MAXN = 64;
    static final int MAXK = 64;
    static int N;
    static int K;
    static long[][] cache = new long[MAXK][MAXN];
    static long power(int x){
        if (x == 0) return 1;
        if (x == 1) return 2;
        return power(x/2)*power(x/2)*power(x%2);
    }
    static long solve(int x,int y){
        if (x > y) return 0;
        if (x == y) return 1;
        if (x == 0) return power(y);
        if (cache[x][y] != -1) return cache[x][y];
        return cache[x][y] = solve(x-1,y-1)+solve(x+1,y-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();
        N = sc.nextInt();
        for (int i = 0; i < MAXK; i++){
            for (int j = 0; j < MAXN; j++){
                cache[i][j] = -1;
            }
        }
        long ans = solve(K,N);
        System.out.println(power(N)-ans);
    }
}