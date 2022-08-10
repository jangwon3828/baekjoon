import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int re=0;
        char a=s.charAt(0);
        boolean b=true;
        int re2=0;
        for(int i=1;i<s.length();i++){
            if(a==s.charAt(i))continue;
            if(b){
                re++;
                b=false;
            }
            else {
                b=true;
                re2++;
            }

            a=s.charAt(i);
        }
        System.out.println(Math.max(re,re2));
    }
}