import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double answer=0.00;
        a: while (true){
            String next = sc.next();
            switch (next){
                case "Paper" : answer+=57.99; break;
                case "Printer" : answer+=120.50; break;
                case "Planners" : answer+=31.25; break;
                case "Binders" : answer+=22.50; break;
                case "Calendar" : answer+=10.95; break;
                case "Notebooks" : answer+=11.20; break;
                case "Ink" : answer+=66.95; break;
                case "EOI" :
                    System.out.println("$"+answer); System.exit(0);
            }
        }
    }
}