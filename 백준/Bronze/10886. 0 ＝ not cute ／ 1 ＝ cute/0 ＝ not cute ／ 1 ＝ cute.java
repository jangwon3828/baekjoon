import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c=0;
        for(int i=0; i<a;i++){
            int b = sc.nextInt();
            if(b==0){
                c++;
            }
            else if(b==1){
                c--;
            }
        }
        if(c>0){
            System.out.println("Junhee is not cute!");
        }
        else if(c<0){
            System.out.println("Junhee is cute!");
        }
    }
}