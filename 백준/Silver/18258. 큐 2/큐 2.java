import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Deque<Integer> dq=new LinkedList<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a= Integer.parseInt(bf.readLine());
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<a;i++)
        {
            StringTokenizer st=new StringTokenizer(bf.readLine());
            switch(st.nextToken())
            {
                case "push": dq.addLast(Integer.valueOf(st.nextToken())); break;
                case "pop": int ap= dq.peekFirst()==null? -1  : dq.peekFirst() ;sb.append(ap).append("\n"); if(ap!=-1)dq.pollFirst(); break;
                case "size": int as=dq.size();sb.append(as).append("\n"); break;
                case "empty": int ae= dq.peek()==null? 1 : 0 ; sb.append(ae).append("\n"); break;
                case "front": int af =dq.peekFirst()==null?-1:dq.peekFirst();sb.append(af).append("\n"); break;
                case "back": int ab =dq.peekLast()==null?-1:dq.peekLast();sb.append(ab).append("\n"); break;
            }
        }
        System.out.println(sb);
    }
}
