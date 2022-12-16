import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] parent, count;
    static boolean[] marked,check;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        parent = new int[N+1];
        count = new int[N+1];

        for(int i = 1; i<=N; i++) {
            parent[i] = i;
        }

        marked = new boolean[N+1];
        check = new boolean[N+1];

        for(int i = 1; i<=M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if(find(parent[x])==find(parent[y])) {
                System.out.println(0);
                return;
            }
            else {
                if(count[x]!=0) union(count[x],y);
                else count[x] = y;

                if(count[y]!=0) union(count[y],x);
                else count[y] = x;
            }
        }

        System.out.println(1);
    }

    static int find(int x) {
        if(x==parent[x]) return x;
        else return parent[x] = find(parent[x]);
    }

    static void union(int x, int y) {
        int a = find(parent[x]);
        int b = find(parent[y]);
        if(a<b) {
            parent[b] = a;
        }
        else {
            parent[a] = b;
        }
    }

}