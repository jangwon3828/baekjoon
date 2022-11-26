import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> index = new Stack<Integer>(); 

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());		

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= size; i++) {			
            int num = Integer.parseInt(st.nextToken());
            while (true) {
                if (!stack.empty()) {			
                    int top = stack.peek();
                    if (top > num) {
                        System.out.print(index.peek() + " ");
                        stack.push(num);
                        index.push(i);
                        break;
                    } else { 
                        stack.pop();
                        index.pop();

                    }
                } else { // 스택 비어있을 경우
                    System.out.print("0 ");
                    stack.push(num);
                    index.push(i);
                    break;

                }

            }

        }
    }

}