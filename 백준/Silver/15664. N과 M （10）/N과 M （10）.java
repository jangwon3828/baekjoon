import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {

    static int[] map;
    static int[] arr;
    static boolean[] visit;
    static int n;
    static int m;
    static LinkedHashSet<String> strings;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        map = new int[n];
        arr = new int[m];
        strings = new LinkedHashSet<>();
        visit = new boolean[n];


        for (int i = 0; i < n; i++) {
            map[i] = sc.nextInt();
        }
        Arrays.sort(map);
        go(0);
        strings.forEach(System.out::println);
    }

    private static void go(int count) {
        if(count==m){
            StringBuilder s= new StringBuilder();
            for (int i = 0; i < m-1; i++) {
                if(arr[i]<=arr[i+1]){
                    continue;
                }else return;
            }
            for(int a:arr){
                s.append(a).append(" ");
            }
            strings.add(s.toString());
            return;
        }

        for (int i = 0; i < n; i++) {
            if(visit[i])continue;
            visit[i]=true;
            arr[count]=map[i];
            go(count+1);
            visit[i]=false;
        }
    }
}