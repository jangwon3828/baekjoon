import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        BigInteger apple = new BigInteger(bf.readLine());
        BigInteger diff = new BigInteger(bf.readLine());
        BigInteger two = new BigInteger("2");
        sb.append((apple.subtract(diff)).divide(two).add(diff)).append("\n");
        sb.append((apple.subtract(diff)).divide(two)).append("\n");
        System.out.println(sb);
    }
}