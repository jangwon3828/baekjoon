import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
        String d=a+b*2+c*3>=10?"happy":"sad";
        System.out.println(d);
    }
}
