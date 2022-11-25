import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String next = bf.readLine();
        String boom = bf.readLine();
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < next.length(); i++) {
            stack.push(next.charAt(i));
            if(boom.length()<=stack.size()){
                boolean check =true;
                for (int j =0; j < boom.length() ; j++) {
                    if(stack.get(stack.size()-boom.length()+j)!=boom.charAt(j)){
                        check=false;
                        break;
                    }
                }
                if(check){
                    for (int j = 0; j < boom.length(); j++) {
                        stack.pop();
                    }
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for (Character character : stack) {
            sb.append(character);
        }
        System.out.println(sb.length()==0?"FRULA":sb);
    }

}