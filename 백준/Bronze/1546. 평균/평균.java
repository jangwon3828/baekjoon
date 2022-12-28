import java.util.Scanner;

public class Main{
    public static void main(String[] args){
       
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        float[] arr = new float[num];
        float max =1;
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
            if(max<arr[i]){
               max = arr[i];
            }
        }
        float sum=0;
        for(int a=0;a<num;a++)
        {
           sum +=arr[a]/max*100;
        }
        float aver = sum/num;
        System.out.printf("%f",aver); 
    }
}