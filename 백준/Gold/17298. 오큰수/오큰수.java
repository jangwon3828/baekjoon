import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<Integer>();
        int count = Integer.parseInt(bf.readLine());
        int[] arr = new int[count];
        StringTokenizer st=new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int x = 0; x < count; x++) {
            while(!stack.isEmpty() && arr[stack.peek()] < arr[x]) {
                arr[stack.pop()] = arr[x];
            }
            stack.push(x);
        }

        while(!stack.isEmpty()) {
            arr[stack.pop()] = -1;
        }

        for(int i = 0; i < count; i++) {
            sb.append(arr[i]).append(' ');
        }
        System.out.println(sb);

    }
}