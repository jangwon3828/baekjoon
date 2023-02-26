import java.io.*;
import java.util.*;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();

        String s = br.readLine();

        String[] strArray = new String[s.length()];

        for (int i = 0; i < s.length(); i++) {
            strArray[i] = s.substring(i,s.length());
        }

        Arrays.sort(strArray);

        for(String str : strArray) {
            sb.append(str).append("\n");
   
        }
        System.out.println(sb);
    }
 
}