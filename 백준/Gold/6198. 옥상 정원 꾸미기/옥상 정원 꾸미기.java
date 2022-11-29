import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long answer = 0;
       Stack<Integer>stack=new Stack<>();
        for (int i = 0; i < n; i++) {
            int building = sc.nextInt();
            if(stack.empty()){
                stack.push(building);
                continue;
            }
            if(stack.peek()>building){
                stack.push(building);
            }
            if(stack.peek()<=building){
                int a=stack.size();
                for (int j = 0; j < a; j++) {
                    if(stack.peek()<=building)
                        stack.pop();
                    else{
                        break;
                    }
                }
                stack.push(building);
            }
            answer+=stack.size()-1;
        }
        System.out.println(answer);
    }
}