import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int temp = Integer.parseInt(br.readLine());
        for (int i = 0; i < temp; i++) {
            StringBuilder sb=new StringBuilder();
            sb.append("Case #"+(i+1)+": ");
            String[] arr = br.readLine().split(" ");
            for (int j = arr.length-1; j >=0 ; j--) {
                sb.append(arr[j]).append(" ");
            }
            System.out.println(sb.toString());
        }
    }
}