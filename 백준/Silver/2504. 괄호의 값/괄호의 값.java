import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        Stack<Character> stack = new Stack<>();
        int result = 0;
        int value = 1;
        for(int i = 0; i < N.length(); i++) {
            if(N.charAt(i) == '(') {
                stack.push(N.charAt(i));
                value *= 2; //( : 2
            } else if(N.charAt(i) == '[') {
                stack.push(N.charAt(i));
                value *= 3; //[ : 3
            } else if(N.charAt(i) == ')') {
                if(stack.isEmpty() || stack.peek() != '(') {
                    result = 0;
                    break;
                } else if(N.charAt(i-1) == '(') {
                    result += value;
                }
                stack.pop();
                value /= 2;
            } else if(N.charAt(i) == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    result = 0;
                    break;
                } else if (N.charAt(i - 1) == '[') {
                    result += value;
                }
                stack.pop();
                value /= 3;
            }
        }
        System.out.println(!stack.empty()?0:result);
    }
}