import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String a=bf.readLine();
        String b=bf.readLine();
        System.out.println(a.length()>=b.length()?"go":"no");
    }
}