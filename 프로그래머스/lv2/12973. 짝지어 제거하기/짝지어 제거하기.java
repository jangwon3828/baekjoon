import java.util.*;
class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char lang = s.charAt(i);

            if (stack.isEmpty()) {
                stack.push(lang);
                continue;
            }
            if(stack.peek()==lang){
                stack.pop();
                continue;
            }
            stack.push(lang);


        }
        return stack.isEmpty() ? 1 : 0;
    }
}