import java.util.*;

public class Main {

    static int max=Integer.MIN_VALUE;
    static int min=Integer.MAX_VALUE;
    static int[] operator=new int[4];
    static int[] arr;
    static int n;

    public static void main(String[] args) {
        init();
        go(arr[0],0);
        System.out.println(max);
        System.out.println(min);
    }
    public static void init(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            operator[i]= sc.nextInt();
        }
        sc.close();

    }
    public static void go(int num,int index) {
        if(index==n-1){
            max=Math.max(max,num);
            min=Math.min(min,num);
            return;
        }
        for (int i = 0; i < 4; i++) {
            if(operator[i]>0){
                operator[i]--;
                switch (i){
                    case 0: go(num+arr[index+1],index+1); break;
                    case 1: go(num-arr[index+1],index+1); break;
                    case 2: go(num*arr[index+1],index+1); break;
                    case 3: go(num/arr[index+1],index+1); break;
                }
                operator[i]++;
            }

        }
    }
}