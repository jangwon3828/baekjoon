import java.util.Stack;
class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        a: for (int i = 0; i < s.length(); i++) {
            stack.clear();
            for (int j = i; j <s.length(); j++) {
                if(s.charAt(j)=='('||s.charAt(j)=='{'||s.charAt(j)=='['){
                    stack.add(s.charAt(j));
                    continue;
                }
                if(stack.isEmpty()){
                    continue a;
                }
                Character peek = stack.pop();
                if(s.charAt(j)==')'){
                    if(peek=='(') {
                        continue;
                    }else {
                        continue a;
                    }
                }
                if(s.charAt(j)=='}'){
                    if(peek=='{') {
                        continue;
                    }else {
                        continue a;
                    }
                }
                if(s.charAt(j)==']'){
                    if(peek=='[') {
                        continue;
                    }else {
                        continue a;
                    }
                }
            }

            for (int j = 0; j < i; j++) {
                if(s.charAt(j)=='('||s.charAt(j)=='{'||s.charAt(j)=='['){
                    stack.add(s.charAt(j));
                    continue;
                }
                if(stack.isEmpty()){
                    continue a;
                }
                Character peek = stack.pop();
                if(s.charAt(j)==')'){
                    if(peek =='(') {
                        continue;
                    }else {
                        continue a;
                    }
                }
                if(s.charAt(j)=='}'){
                    if(peek =='{') {
                        continue;
                    }else {
                        continue a;
                    }
                }
                if(s.charAt(j)==']'){
                    if(peek =='[') {
                        continue;
                    }else {
                        continue a;
                    }
                }
            }

            if(stack.isEmpty())answer=answer+1;
        }
        return answer;
    }
}