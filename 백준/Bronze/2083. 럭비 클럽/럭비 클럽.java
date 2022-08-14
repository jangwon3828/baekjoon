import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (true){
            String name = sc.next();
            int age=sc.nextInt();
            int weight=sc.nextInt();
            if(name.equals("#")){
                System.exit(0);
            }
            if(age>=18||weight>=80)
            {
                System.out.println(name + " Senior");
                continue;
            }
            System.out.println(name + " Junior");

        }
    }
}