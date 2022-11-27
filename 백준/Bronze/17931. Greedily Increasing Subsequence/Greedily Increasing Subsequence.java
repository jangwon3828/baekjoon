import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        Stack<Integer>stack=new Stack<>();
        while (st.hasMoreTokens()){
            int temp = Integer.parseInt(st.nextToken());
            if(stack.size()==0){
                stack.push(temp);
                continue;
            }
            if(temp>stack.peek())stack.push(temp);
        }
        StringBuilder sb=new StringBuilder();
        sb.append(stack.size()).append("\n");
        for (int i = 0; i < stack.size(); i++) {
            sb.append(stack.get(i)+" ");
        }
        System.out.println(sb.toString());
    }
}