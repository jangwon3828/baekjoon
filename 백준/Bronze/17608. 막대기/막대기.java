import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int temp = Integer.parseInt(br.readLine());
        for (int i = 0; i < temp; i++) {
            int get = Integer.parseInt(br.readLine());
            if (i == 0) {
                stack.push(get);
            }
            while (true) {
                if (stack.size() == 0 || stack.peek() > get) {
                    stack.push(get);
                    break;
                }
                stack.pop();
            }
        }
        System.out.println(stack.size());
    }
}