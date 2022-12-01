import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr=new int[a];
        int max=0;
        for (int i = 0; i < a; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int n=2;
        if(arr.length==1)max=arr[0];
        if(arr.length>=2){
            for (int i = arr.length-2; i >=0 ; i--) {
                max= Math.max(max,arr[i] * n);
                n++;
            }
        }
        System.out.println(max);

    }
}