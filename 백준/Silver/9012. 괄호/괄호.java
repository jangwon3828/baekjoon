import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            ArrayList<Character> chars=new ArrayList<Character>();
            String str = sc.next();
            if(str.length()%2!=0)
            {
                sb.append("NO").append("\n");
                continue;
            }
            for(int x=0;x<str.length();x++)
            {
                try{
                    if(str.charAt(x)==40)
                    {
                        chars.add(str.charAt(x));
                    }
                    if(str.charAt(x)==41)
                    {
                        chars.remove(chars.size()-1);
                    }

                    if(x==str.length()-1&&chars.size()==0)
                    {
                        sb.append("YES").append("\n");
                        break;
                    }
                    if(x==str.length()-1&&chars.size()!=0)
                    {
                        sb.append("NO").append("\n");
                        break;
                    }
                }
                catch (Exception ex)
                {
                    sb.append("NO").append("\n");
                    break;
                }
            }

        }
        System.out.println(sb);
    }
}