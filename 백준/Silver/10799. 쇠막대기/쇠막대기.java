import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character>stack=new Stack<>();
        String s = br.readLine();
        int answer=0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c=='(')
                stack.push(c);
            if(c==')'&&stack.size()>0){
                stack.pop();
                if (s.charAt(i - 1) == '(') {
                    answer += stack.size();
                }
                else answer++;
            }
        }
        System.out.println(answer);
    }

}