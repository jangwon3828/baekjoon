import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        Stack<Character> stack = new Stack<>();
        int answer = 0;
        int temp=1;
        a:for (int i = 0; i < next.length(); i++) {
            Character c = next.charAt(i);
            switch (c) {
                case '(':
                    stack.push(c);
                    temp*=2;
                    break;
                case '[':
                    stack.push(c);
                    temp*=3;
                    break;
                case ')':
                    if (stack.isEmpty()||stack.peek()!='(') {
                        answer = 0;
                        break a;
                    }
                    stack.pop();
                    if(next.charAt(i-1) == '(') {
                        answer+=temp;
                    }

                    temp/=2;
                    break;

                case ']':
                    if (stack.isEmpty()||stack.peek()!='[') {
                        answer = 0;
                        break a;
                    }
                    stack.pop();
                    if(next.charAt(i-1) == '[') {
                        answer+=temp;
                    }
                    temp/=3;
                    break;
            }
        }
        System.out.println(stack.isEmpty()?answer:0);
    }
}