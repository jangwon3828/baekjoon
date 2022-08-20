import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a = new int[4];
        for(int i=0;i<4;i++){
            a[i]= sc.nextInt();
        }
        int r=sc.nextInt();
        int b=0;
        for(int i=0;i<4;i++){
            if(a[i]== r) {
                System.out.println(i + 1);
                b++;
            }
        }
        if(b==0){
            System.out.println(0);
        }
    }


}