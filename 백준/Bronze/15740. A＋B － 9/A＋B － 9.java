import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(bf.readLine());
        BigInteger a=new BigInteger(st.nextToken());
        BigInteger b=new BigInteger(st.nextToken());
        System.out.println(a.add(b));
    }
}