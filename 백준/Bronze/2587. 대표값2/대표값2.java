import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int[] arr= new int[5];
        int aver =0;
        for(int i=0;i<5;i++){
            int a=sc.nextInt();
            arr[i]=a;
            aver +=a;
        }
        Arrays.sort(arr);
        System.out.println(aver/5);
        System.out.println(arr[2]);
    }
}