import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        int cute = 0;
        for (int i = 0; i < t; i++) {
            cute+= sc.nextInt();
        }
        System.out.println(cute>t/2?"Junhee is cute!":"Junhee is not cute!");
    }
}