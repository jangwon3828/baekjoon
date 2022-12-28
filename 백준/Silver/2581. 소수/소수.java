import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean check[]=new boolean[10001];
        check[0]=true;
        check[1]=true;
        for (int i = 2; i < 10001; i++) {
            for (int j = 2; ; j++) {
                if(i*j>=10001)break;
                check[i*j]=true;
            }
        }
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> answer=new ArrayList<>();
        int num=0;
        for (int i = n; i <= m; i++) {
            if(!check[i]){
                answer.add(i);
                num+=i;
            }
        }
        if(answer.isEmpty()){
            System.out.println(-1);
        }else{
            Collections.sort(answer);
            System.out.println(num);
            System.out.println(answer.get(0));
        }
    }
}
