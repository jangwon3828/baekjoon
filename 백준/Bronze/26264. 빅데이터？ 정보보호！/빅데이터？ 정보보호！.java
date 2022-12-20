import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        sc.nextInt();
        StringBuilder sb=new StringBuilder();
        String readline=sc.next();

        String secur=readline.replace("security","1");
        secur=secur.replace("bigdata","");
        String big=readline.replace("bigdata","1");
        big=big.replace("security","");

        int bigdata = big.length();
        int security = secur.length();
        if(bigdata>security){
            sb.append("bigdata?");
        } else if (security>bigdata) {
            sb.append("security!");
        }else {
            sb.append("bigdata? security!");
        }
        System.out.println(sb);

    }
}