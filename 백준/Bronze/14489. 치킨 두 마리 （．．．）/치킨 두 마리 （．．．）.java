import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int i1 = sc.nextInt();
        int i2 = sc.nextInt()*2;
        int i3=i1+i;
        if(i3>=i2){
            System.out.println(i3-i2);
            System.exit(0);
        }
        System.out.println(i3);
    }
}