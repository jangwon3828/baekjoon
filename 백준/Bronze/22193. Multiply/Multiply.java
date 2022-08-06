import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String a=bf.readLine();
        BigInteger b=new BigInteger(bf.readLine());
        BigInteger c=new BigInteger(bf.readLine());
        System.out.println(b.multiply(c));
    }

}