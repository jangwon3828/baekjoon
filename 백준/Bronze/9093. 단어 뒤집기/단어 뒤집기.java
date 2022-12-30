import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bf.readLine());
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < n; i++) {
            StringTokenizer st=new StringTokenizer(bf.readLine());
            Stack<Character>stack=new Stack<>();
            while(st.hasMoreTokens()){
                String word = st.nextToken();
                for (int j = 0; j < word.length(); j++) {
                    stack.push(word.charAt(j));
                }
                for (int j = 0; j < word.length(); j++) {
                    sb.append(stack.pop());
                }
                sb.append(" ");
            }
            sb.append("\n");

        }
        System.out.println(sb);
    }
}
